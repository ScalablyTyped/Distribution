package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for specifying the start activities to crawl.
  */
@js.native
trait SchemaRoboStartingIntent extends StObject {
  
  var launcherActivity: js.UndefOr[SchemaLauncherActivityIntent] = js.native
  
  var startActivity: js.UndefOr[SchemaStartActivityIntent] = js.native
  
  /**
    * Timeout in seconds for each intent.
    */
  var timeout: js.UndefOr[String] = js.native
}
object SchemaRoboStartingIntent {
  
  @scala.inline
  def apply(): SchemaRoboStartingIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoboStartingIntent]
  }
  
  @scala.inline
  implicit class SchemaRoboStartingIntentMutableBuilder[Self <: SchemaRoboStartingIntent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLauncherActivity(value: SchemaLauncherActivityIntent): Self = StObject.set(x, "launcherActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLauncherActivityUndefined: Self = StObject.set(x, "launcherActivity", js.undefined)
    
    @scala.inline
    def setStartActivity(value: SchemaStartActivityIntent): Self = StObject.set(x, "startActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartActivityUndefined: Self = StObject.set(x, "startActivity", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
