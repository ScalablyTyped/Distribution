package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for FirestoreAdmin.ListFields.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse extends StObject {
  
  /**
    * The requested fields.
    */
  var fields: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta2Field]] = js.native
  
  /**
    * A page token that may be used to request another page of results. If
    * blank, this is the last page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2ListFieldsResponseMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta2ListFieldsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[SchemaGoogleFirestoreAdminV1beta2Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaGoogleFirestoreAdminV1beta2Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
