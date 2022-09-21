package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSearchapps
  extends StObject
     with StandardParameters {
  
  /**
    * A query string compatible with Google's [AIP-160](https://google.aip.dev/160) standard. Use any of the following fields in a query: * [`app_id`](../projects.apps#FirebaseAppInfo.FIELDS.app_id) * [`namespace`](../projects.apps#FirebaseAppInfo.FIELDS.namespace) * [`platform`](../projects.apps#FirebaseAppInfo.FIELDS.platform) We also support the following "virtual" fields (fields which are not actually part of the returned resource object, but can be queried as if they are pre-populated with specific values): * `sha1_hash` or `sha1_hashes`: This field is considered to be a repeated `string` field, populated with the list of all SHA-1 certificate fingerprints registered with the app. This list is empty if the app is not an Android app. * `sha256_hash` or `sha256_hashes`: This field is considered to be a repeated `string` field, populated with the list of all SHA-256 certificate fingerprints registered with the app. This list is empty if the app is not an Android app. * `app_store_id`: This field is considered to be a singular `string` field, populated with the Apple App Store ID registered with the app. This field is empty if the app is not an iOS app. * `team_id`: This field is considered to be a singular `string` field, populated with the Apple team ID registered with the app. This field is empty if the app is not an iOS app.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of Apps to return in the response. The server may return fewer than this value at its discretion. If no value is specified (or too large a value is specified), then the server will impose its own limit. This value cannot be negative.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token returned from a previous call to `SearchFirebaseApps` indicating where in the set of Apps to resume listing.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The parent FirebaseProject for which to list Apps, in the format: projects/ PROJECT_IDENTIFIER Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Controls whether Apps in the DELETED state should be returned. Defaults to false.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsSearchapps {
  
  inline def apply(): ParamsResourceProjectsSearchapps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSearchapps]
  }
  
  extension [Self <: ParamsResourceProjectsSearchapps](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
  }
}
