package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1ListFieldsResponse extends StObject {
  
  /**
    * The requested fields.
    */
  var fields: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1Field]] = js.undefined
  
  /**
    * A page token that may be used to request another page of results. If blank, this is the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1ListFieldsResponse {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1ListFieldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ListFieldsResponse]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1ListFieldsResponse](x: Self) {
    
    inline def setFields(value: js.Array[SchemaGoogleFirestoreAdminV1Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaGoogleFirestoreAdminV1Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
