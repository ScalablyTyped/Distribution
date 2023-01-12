package typings.hyphen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<hyphen.hyphen.FactoryOptions> */
  trait ReadonlyFactoryOptions extends StObject {
    
    val async: js.UndefOr[Boolean] = js.undefined
    
    val debug: js.UndefOr[Boolean] = js.undefined
    
    val html: js.UndefOr[Boolean] = js.undefined
    
    val hyphenChar: js.UndefOr[String] = js.undefined
    
    val minWordLength: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyFactoryOptions {
    
    inline def apply(): ReadonlyFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyFactoryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyFactoryOptions] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Readonly<hyphen.hyphen.HyphenationOptions> */
  trait ReadonlyHyphenationOption extends StObject {
    
    val debug: js.UndefOr[Boolean] = js.undefined
    
    val hyphenChar: js.UndefOr[String] = js.undefined
    
    val minWordLength: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyHyphenationOption {
    
    inline def apply(): ReadonlyHyphenationOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyHyphenationOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyHyphenationOption] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHyphenChar(value: String): Self = StObject.set(x, "hyphenChar", value.asInstanceOf[js.Any])
      
      inline def setHyphenCharUndefined: Self = StObject.set(x, "hyphenChar", js.undefined)
      
      inline def setMinWordLength(value: Double): Self = StObject.set(x, "minWordLength", value.asInstanceOf[js.Any])
      
      inline def setMinWordLengthUndefined: Self = StObject.set(x, "minWordLength", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<hyphen.hyphen.PatternsDefinition> */
  trait ReadonlyPatternsDefinitio extends StObject {
    
    val exceptions: js.Array[String]
    
    val patterns: js.Array[String]
  }
  object ReadonlyPatternsDefinitio {
    
    inline def apply(exceptions: js.Array[String], patterns: js.Array[String]): ReadonlyPatternsDefinitio = {
      val __obj = js.Dynamic.literal(exceptions = exceptions.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyPatternsDefinitio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyPatternsDefinitio] (val x: Self) extends AnyVal {
      
      inline def setExceptions(value: js.Array[String]): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
      
      inline def setExceptionsVarargs(value: String*): Self = StObject.set(x, "exceptions", js.Array(value*))
      
      inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
}
