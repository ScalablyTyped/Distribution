package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends js.Object {
  
  /** Application tracks visible to the enterprise. */
  var appTracks: js.UndefOr[js.Array[AppTrackInfo]] = js.native
  
  /** The set of managed properties available to be pre-configured for the app. */
  var managedProperties: js.UndefOr[js.Array[ManagedProperty]] = js.native
  
  /** The name of the app in the form enterprises/{enterpriseId}/applications/{package_name}. */
  var name: js.UndefOr[String] = js.native
  
  /** The permissions required by the app. */
  var permissions: js.UndefOr[js.Array[ApplicationPermission]] = js.native
  
  /** The title of the app. Localized. */
  var title: js.UndefOr[String] = js.native
}
object Application {
  
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppTracksVarargs(value: AppTrackInfo*): Self = this.set("appTracks", js.Array(value :_*))
    
    @scala.inline
    def setAppTracks(value: js.Array[AppTrackInfo]): Self = this.set("appTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppTracks: Self = this.set("appTracks", js.undefined)
    
    @scala.inline
    def setManagedPropertiesVarargs(value: ManagedProperty*): Self = this.set("managedProperties", js.Array(value :_*))
    
    @scala.inline
    def setManagedProperties(value: js.Array[ManagedProperty]): Self = this.set("managedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedProperties: Self = this.set("managedProperties", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: ApplicationPermission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[ApplicationPermission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
