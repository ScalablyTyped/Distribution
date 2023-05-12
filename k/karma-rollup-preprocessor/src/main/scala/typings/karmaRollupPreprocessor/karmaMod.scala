package typings.karmaRollupPreprocessor

import typings.karmaRollupPreprocessor.karmaRollupPreprocessorStrings.input
import typings.rollup.mod.RollupOptions
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object karmaMod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * see {@link https://github.com/jlmakes/karma-rollup-preprocessor#configured-preprocessors}
      */
    var rollupPreprocessor: js.UndefOr[RollupPreprocessorOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setRollupPreprocessor(value: RollupPreprocessorOptions): Self = StObject.set(x, "rollupPreprocessor", value.asInstanceOf[js.Any])
      
      inline def setRollupPreprocessorUndefined: Self = StObject.set(x, "rollupPreprocessor", js.undefined)
    }
  }
  
  /**
    * Default global variable name is by default `__json__`,
    * but you can override it with your own name in karma configuration:
    */
  type RollupPreprocessorOptions = Exclude[RollupOptions, input]
}
