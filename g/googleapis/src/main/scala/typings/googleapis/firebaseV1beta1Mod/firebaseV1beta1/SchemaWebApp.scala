package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebApp extends StObject {
  
  /**
    * The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with the `WebApp`. Be aware that this value is the UID of the API key, _not_ the [`keyString`](https://cloud.google.com/api-keys/docs/reference/rest/v2/projects.locations.keys#Key.FIELDS.key_string) of the API key. The `keyString` is the value that can be found in the App's [configuration artifact](../../rest/v1beta1/projects.webApps/getConfig). If `api_key_id` is not set in requests to [`webApps.Create`](../../rest/v1beta1/projects.webApps/create), then Firebase automatically associates an `api_key_id` with the `WebApp`. This auto-associated key may be an existing valid key or, if no valid key exists, a new one will be provisioned. In patch requests, `api_key_id` cannot be set to an empty value, and the new UID must have no restrictions or only have restrictions that are valid for the associated `WebApp`. We recommend using the [Google Cloud Console](https://console.cloud.google.com/apis/credentials) to manage API keys.
    */
  var apiKeyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`. This identifier should be treated as an opaque token, as the data format is not specified.
    */
  var appId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URLs where the `WebApp` is hosted.
    */
  var appUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The user-assigned display name for the `WebApp`.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the WebApp, in the format: projects/PROJECT_IDENTIFIER /webApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.webApps#WebApp.FIELDS.app_id)).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `WebApp`.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The lifecycle state of the App.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. A unique, Firebase-assigned identifier for the `WebApp`. This identifier is only used to populate the `namespace` value for the `WebApp`. For most use cases, use `appId` to identify or reference the App. The `webId` value is only unique within a `FirebaseProject` and its associated Apps.
    */
  var webId: js.UndefOr[String | Null] = js.undefined
}
object SchemaWebApp {
  
  inline def apply(): SchemaWebApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebApp]
  }
  
  extension [Self <: SchemaWebApp](x: Self) {
    
    inline def setApiKeyId(value: String): Self = StObject.set(x, "apiKeyId", value.asInstanceOf[js.Any])
    
    inline def setApiKeyIdNull: Self = StObject.set(x, "apiKeyId", null)
    
    inline def setApiKeyIdUndefined: Self = StObject.set(x, "apiKeyId", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAppUrls(value: js.Array[String]): Self = StObject.set(x, "appUrls", value.asInstanceOf[js.Any])
    
    inline def setAppUrlsNull: Self = StObject.set(x, "appUrls", null)
    
    inline def setAppUrlsUndefined: Self = StObject.set(x, "appUrls", js.undefined)
    
    inline def setAppUrlsVarargs(value: String*): Self = StObject.set(x, "appUrls", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWebId(value: String): Self = StObject.set(x, "webId", value.asInstanceOf[js.Any])
    
    inline def setWebIdNull: Self = StObject.set(x, "webId", null)
    
    inline def setWebIdUndefined: Self = StObject.set(x, "webId", js.undefined)
  }
}
