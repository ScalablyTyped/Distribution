package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoboStartingIntent extends StObject {
  
  /**
    * An intent that starts the main launcher activity.
    */
  var launcherActivity: js.UndefOr[SchemaLauncherActivityIntent] = js.undefined
  
  /**
    * An intent that starts an activity with specific details.
    */
  var startActivity: js.UndefOr[SchemaStartActivityIntent] = js.undefined
  
  /**
    * Timeout in seconds for each intent.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
}
object SchemaRoboStartingIntent {
  
  inline def apply(): SchemaRoboStartingIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoboStartingIntent]
  }
  
  extension [Self <: SchemaRoboStartingIntent](x: Self) {
    
    inline def setLauncherActivity(value: SchemaLauncherActivityIntent): Self = StObject.set(x, "launcherActivity", value.asInstanceOf[js.Any])
    
    inline def setLauncherActivityUndefined: Self = StObject.set(x, "launcherActivity", js.undefined)
    
    inline def setStartActivity(value: SchemaStartActivityIntent): Self = StObject.set(x, "startActivity", value.asInstanceOf[js.Any])
    
    inline def setStartActivityUndefined: Self = StObject.set(x, "startActivity", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
