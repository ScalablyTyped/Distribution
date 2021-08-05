package typings.hyphen

import typings.hyphen.anon.ReadonlyFactoryOptions
import typings.hyphen.anon.ReadonlyHyphenationOption
import typings.hyphen.anon.ReadonlyPatternsDefinitio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a hyphenation function that can be used to hyphenate text.
    * @param patternsDefinition The hyphenation patterns definition for a language.
    * @param options Settings for the hyphenation function.
    * @returns Depending on the options a synchronous or asynchronous hyphenation function.
    */
  inline def apply(patternsDefinition: ReadonlyPatternsDefinitio): HyphenationFunctionAsync | HyphenationFunctionSync = ^.asInstanceOf[js.Dynamic].apply(patternsDefinition.asInstanceOf[js.Any]).asInstanceOf[HyphenationFunctionAsync | HyphenationFunctionSync]
  inline def apply(patternsDefinition: ReadonlyPatternsDefinitio, options: ReadonlyFactoryOptions): HyphenationFunctionAsync | HyphenationFunctionSync = (^.asInstanceOf[js.Dynamic].apply(patternsDefinition.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HyphenationFunctionAsync | HyphenationFunctionSync]
  
  @JSImport("hyphen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Options for the hyphenation factory function.
    */
  trait FactoryOptions extends StObject {
    
    /**
      * If true the factory returns an asynchronous hyphenation function.
      * @default false
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean indicating, if the hyphenation function should output debug info to the console.
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true the hyphenation function is going to ignore HTML tags in the text.
      * @default false
      */
    var html: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value of the hyphen character that is inserted into the text.
      * @default \\u00AD
      */
    var hyphenChar: js.UndefOr[String] = js.undefined
    
    /**
      * The minimum length for a word to get hyphenated. Can't be less than 5.
      * @default 5
      */
    var minWordLength: js.UndefOr[Double] = js.undefined
  }
  object FactoryOptions {
    
    inline def apply(): FactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FactoryOptions]
    }
    
    extension [Self <: FactoryOptions](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setHyphenChar(value: String): Self = StObject.set(x, "hyphenChar", value.asInstanceOf[js.Any])
      
      inline def setHyphenCharUndefined: Self = StObject.set(x, "hyphenChar", js.undefined)
      
      inline def setMinWordLength(value: Double): Self = StObject.set(x, "minWordLength", value.asInstanceOf[js.Any])
      
      inline def setMinWordLengthUndefined: Self = StObject.set(x, "minWordLength", js.undefined)
    }
  }
  
  /**
    * Asynchronous hyphenation function returning a promise for the hyphenated text.
    * @param text The text to be hyphenated.
    * @param options Options for the hyphenation process.
    * @returns A promise of the hyphenated text.
    */
  type HyphenationFunctionAsync = js.Function2[
    /* text */ String, 
    /* options */ js.UndefOr[ReadonlyHyphenationOption], 
    js.Promise[String]
  ]
  
  /**
    * Synchronous hyphenation function returning the hyphenated text immediately.
    * @param text The text to be hyphenated.
    * @param options Options for the hyphenation process.
    * @returns The hyphenated text.
    */
  type HyphenationFunctionSync = js.Function2[/* text */ String, /* options */ js.UndefOr[ReadonlyHyphenationOption], String]
  
  /**
    * Options for a hyphenation call.
    */
  trait HyphenationOptions extends StObject {
    
    /**
      * A boolean indicating, if the hyphenation function should output debug info to the console.
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value of the hyphen character that is inserted into the text.
      * @default \\u00AD
      */
    var hyphenChar: js.UndefOr[String] = js.undefined
    
    /**
      * The minimum length for a word to get hyphenated. Can't be less than 5.
      * @default 5
      */
    var minWordLength: js.UndefOr[Double] = js.undefined
  }
  object HyphenationOptions {
    
    inline def apply(): HyphenationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HyphenationOptions]
    }
    
    extension [Self <: HyphenationOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHyphenChar(value: String): Self = StObject.set(x, "hyphenChar", value.asInstanceOf[js.Any])
      
      inline def setHyphenCharUndefined: Self = StObject.set(x, "hyphenChar", js.undefined)
      
      inline def setMinWordLength(value: Double): Self = StObject.set(x, "minWordLength", value.asInstanceOf[js.Any])
      
      inline def setMinWordLengthUndefined: Self = StObject.set(x, "minWordLength", js.undefined)
    }
  }
  
  /**
    * Hyphenation patterns and exceptions for a language.
    */
  trait PatternsDefinition extends StObject {
    
    /** List of words with hyphenation points that don't fit the patterns. */
    var exceptions: js.Array[String]
    
    /** List of hyphenation patterns. */
    var patterns: js.Array[String]
  }
  object PatternsDefinition {
    
    inline def apply(exceptions: js.Array[String], patterns: js.Array[String]): PatternsDefinition = {
      val __obj = js.Dynamic.literal(exceptions = exceptions.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatternsDefinition]
    }
    
    extension [Self <: PatternsDefinition](x: Self) {
      
      inline def setExceptions(value: js.Array[String]): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
      
      inline def setExceptionsVarargs(value: String*): Self = StObject.set(x, "exceptions", js.Array(value :_*))
      
      inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    }
  }
}
