package typings.insertModuleGlobals

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.insertModuleGlobals.anon.Buffer
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("insert-module-globals", JSImport.Namespace)
  @js.native
  val ^ : InsertModuleGlobals = js.native
  
  type InsertFunction = js.Function2[/* file */ String, /* basedir */ String, VariableConfig | String]
  
  @js.native
  trait InsertModuleGlobals extends StObject {
    
    /**
      * Return a transform stream inserter for the filename file that will accept a javascript file as input and
      * will output the file with a closure around the contents as necessary to define extra builtins.
      */
    def apply(file: String): Transform = js.native
    def apply(file: String, opts: Options): Transform = js.native
    
    /**
      * Defaults
      */
    val vars: Buffer = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * When opts.always is true, wrap every file with all the global variables without parsing.
      * This is handy because parsing the scope can take a long time, so you can prioritize fast builds over saving bytes in the final output.
      * When opts.always is truthy but not true, avoid parsing but perform a quick test to determine if wrapping should be skipped.
      */
    var always: js.UndefOr[Boolean] = js.undefined
    
    var basedir: js.UndefOr[String] = js.undefined
    
    /**
      * If opts.debug is true, an inline source map will be generated to compensate for the extra lines.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use opts.vars to override the default inserted variables, or set opts.vars[name] to undefined to not insert a variable which would otherwise be inserted.
      *
      * opts.vars properties with a . in their name will be executed instead of the parent object if ONLY that property is used.
      * For example, "Buffer.isBuffer" will mask "Buffer" only when there is a Buffer.isBuffer() call in a file and no other references to Buffer.
      */
    var vars: js.UndefOr[VarsOption] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlways(value: Boolean): Self = StObject.set(x, "always", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
      
      @scala.inline
      def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setVars(value: VarsOption): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
    }
  }
  
  trait VariableConfig extends StObject {
    
    var id: String
    
    var source: String
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object VariableConfig {
    
    @scala.inline
    def apply(id: String, source: String): VariableConfig = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariableConfig]
    }
    
    @scala.inline
    implicit class VariableConfigMutableBuilder[Self <: VariableConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  type VarsOption = StringDictionary[js.UndefOr[InsertFunction]]
  
  type _To = InsertModuleGlobals
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: InsertModuleGlobals = ^
}
