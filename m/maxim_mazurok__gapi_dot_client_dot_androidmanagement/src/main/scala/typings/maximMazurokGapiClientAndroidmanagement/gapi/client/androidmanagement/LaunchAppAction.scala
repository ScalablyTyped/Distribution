package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchAppAction extends StObject {
  
  /** Package name of app to be launched */
  var packageName: js.UndefOr[String] = js.native
}
object LaunchAppAction {
  
  @scala.inline
  def apply(): LaunchAppAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchAppAction]
  }
  
  @scala.inline
  implicit class LaunchAppActionMutableBuilder[Self <: LaunchAppAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
