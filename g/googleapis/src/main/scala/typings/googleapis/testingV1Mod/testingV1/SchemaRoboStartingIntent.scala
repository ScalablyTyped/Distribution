package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for specifying the start activities to crawl.
  */
trait SchemaRoboStartingIntent extends StObject {
  
  var launcherActivity: js.UndefOr[SchemaLauncherActivityIntent] = js.undefined
  
  var startActivity: js.UndefOr[SchemaStartActivityIntent] = js.undefined
  
  /**
    * Timeout in seconds for each intent.
    */
  var timeout: js.UndefOr[String] = js.undefined
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
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
