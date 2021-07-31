package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  /** Application tracks visible to the enterprise. */
  var appTracks: js.UndefOr[js.Array[AppTrackInfo]] = js.undefined
  
  /** The set of managed properties available to be pre-configured for the app. */
  var managedProperties: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
  
  /** The name of the app in the form enterprises/{enterpriseId}/applications/{package_name}. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The permissions required by the app. */
  var permissions: js.UndefOr[js.Array[ApplicationPermission]] = js.undefined
  
  /** The title of the app. Localized. */
  var title: js.UndefOr[String] = js.undefined
}
object Application {
  
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppTracks(value: js.Array[AppTrackInfo]): Self = StObject.set(x, "appTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTracksUndefined: Self = StObject.set(x, "appTracks", js.undefined)
    
    @scala.inline
    def setAppTracksVarargs(value: AppTrackInfo*): Self = StObject.set(x, "appTracks", js.Array(value :_*))
    
    @scala.inline
    def setManagedProperties(value: js.Array[ManagedProperty]): Self = StObject.set(x, "managedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPropertiesUndefined: Self = StObject.set(x, "managedProperties", js.undefined)
    
    @scala.inline
    def setManagedPropertiesVarargs(value: ManagedProperty*): Self = StObject.set(x, "managedProperties", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[ApplicationPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: ApplicationPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
