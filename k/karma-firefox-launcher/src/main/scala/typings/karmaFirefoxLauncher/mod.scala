package typings.karmaFirefoxLauncher

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait CustomLauncher extends StObject {
    
    /**
      * extensions that you want loaded into the browser on startup
      */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * configure preferences for the Firefox instance that is loaded
      */
    var prefs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object CustomLauncher {
    
    inline def apply(): CustomLauncher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomLauncher]
    }
    
    extension [Self <: CustomLauncher](x: Self) {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setPrefs(value: StringDictionary[js.Any]): Self = StObject.set(x, "prefs", value.asInstanceOf[js.Any])
      
      inline def setPrefsUndefined: Self = StObject.set(x, "prefs", js.undefined)
    }
  }
}
