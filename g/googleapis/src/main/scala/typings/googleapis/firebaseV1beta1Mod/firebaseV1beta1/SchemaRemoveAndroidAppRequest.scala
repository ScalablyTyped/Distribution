package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveAndroidAppRequest extends StObject {
  
  /**
    * If set to true, and the App is not found, the request will succeed but no action will be taken on the server.
    */
  var allowMissing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Checksum provided in the AndroidApp entity, which if provided ensures the client has an up-to-date value before proceeding.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set to true, only validate the request and do not delete the app.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRemoveAndroidAppRequest {
  
  inline def apply(): SchemaRemoveAndroidAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveAndroidAppRequest]
  }
  
  extension [Self <: SchemaRemoveAndroidAppRequest](x: Self) {
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingNull: Self = StObject.set(x, "allowMissing", null)
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
