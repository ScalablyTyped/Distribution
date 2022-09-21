package typings.karmaFirefoxLauncher

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait CustomLauncher extends StObject {
    
    /**
      * location of the Firefox executable
      */
    var command: js.UndefOr[String] = js.undefined
    
    /**
      * extensions that you want loaded into the browser on startup
      */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * custom launcher name
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * configure preferences for the Firefox instance that is loaded
      */
    var prefs: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object CustomLauncher {
    
    inline def apply(): CustomLauncher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomLauncher]
    }
    
    extension [Self <: CustomLauncher](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrefs(value: StringDictionary[Any]): Self = StObject.set(x, "prefs", value.asInstanceOf[js.Any])
      
      inline def setPrefsUndefined: Self = StObject.set(x, "prefs", js.undefined)
    }
  }
}
