package typings.karmaJsdomLauncher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * Launcher for jsdom configuration
      */
    var jsdomLauncher: js.UndefOr[JsdomLauncherOptions] = js.undefined
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsdomLauncher(value: JsdomLauncherOptions): Self = StObject.set(x, "jsdomLauncher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsdomLauncherUndefined: Self = StObject.set(x, "jsdomLauncher", js.undefined)
    }
  }
  
  trait JsdomLauncherOptions extends StObject {
    
    /**
      * You can pass options directly to jsdom as shown below.
      * See jsdom's own documentation for all supported options.
      */
    var jsdom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jsdom.ConstructorOptions */ js.Any
  }
  object JsdomLauncherOptions {
    
    @scala.inline
    def apply(
      jsdom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jsdom.ConstructorOptions */ js.Any
    ): JsdomLauncherOptions = {
      val __obj = js.Dynamic.literal(jsdom = jsdom.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsdomLauncherOptions]
    }
    
    @scala.inline
    implicit class JsdomLauncherOptionsMutableBuilder[Self <: JsdomLauncherOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsdom(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jsdom.ConstructorOptions */ js.Any
      ): Self = StObject.set(x, "jsdom", value.asInstanceOf[js.Any])
    }
  }
}
