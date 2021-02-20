package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetupAction extends StObject {
  
  /** Description of this action. */
  var description: js.UndefOr[UserFacingMessage] = js.native
  
  /** An action to launch an app. */
  var launchApp: js.UndefOr[LaunchAppAction] = js.native
  
  /** Title of this action. */
  var title: js.UndefOr[UserFacingMessage] = js.native
}
object SetupAction {
  
  @scala.inline
  def apply(): SetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupAction]
  }
  
  @scala.inline
  implicit class SetupActionMutableBuilder[Self <: SetupAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: UserFacingMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLaunchApp(value: LaunchAppAction): Self = StObject.set(x, "launchApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchAppUndefined: Self = StObject.set(x, "launchApp", js.undefined)
    
    @scala.inline
    def setTitle(value: UserFacingMessage): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
