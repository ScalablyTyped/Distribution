package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetupAction extends StObject {
  
  /** Description of this action. */
  var description: js.UndefOr[UserFacingMessage] = js.undefined
  
  /**
    * An action to launch an app. The app will be launched with an intent containing an extra with key com.google.android.apps.work.clouddpc.EXTRA_LAUNCHED_AS_SETUP_ACTION set to the
    * boolean value true to indicate that this is a setup action flow.
    */
  var launchApp: js.UndefOr[LaunchAppAction] = js.undefined
  
  /** Title of this action. */
  var title: js.UndefOr[UserFacingMessage] = js.undefined
}
object SetupAction {
  
  inline def apply(): SetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetupAction] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: UserFacingMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLaunchApp(value: LaunchAppAction): Self = StObject.set(x, "launchApp", value.asInstanceOf[js.Any])
    
    inline def setLaunchAppUndefined: Self = StObject.set(x, "launchApp", js.undefined)
    
    inline def setTitle(value: UserFacingMessage): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
