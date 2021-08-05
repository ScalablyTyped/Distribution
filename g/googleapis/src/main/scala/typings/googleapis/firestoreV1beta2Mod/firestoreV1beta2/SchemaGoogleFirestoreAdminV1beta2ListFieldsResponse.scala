package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for FirestoreAdmin.ListFields.
  */
trait SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse extends StObject {
  
  /**
    * The requested fields.
    */
  var fields: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta2Field]] = js.undefined
  
  /**
    * A page token that may be used to request another page of results. If
    * blank, this is the last page.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse](x: Self) {
    
    inline def setFields(value: js.Array[SchemaGoogleFirestoreAdminV1beta2Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaGoogleFirestoreAdminV1beta2Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
