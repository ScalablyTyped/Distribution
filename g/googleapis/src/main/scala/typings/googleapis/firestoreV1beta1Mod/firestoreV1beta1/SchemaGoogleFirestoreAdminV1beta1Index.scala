package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1beta1Index extends StObject {
  
  /**
    * The collection ID to which this index applies. Required.
    */
  var collectionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fields to index.
    */
  var fields: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta1IndexField]] = js.undefined
  
  /**
    * The resource name of the index. Output only.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the index. Output only.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta1Index {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta1Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1Index]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta1Index](x: Self) {
    
    inline def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdNull: Self = StObject.set(x, "collectionId", null)
    
    inline def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
    
    inline def setFields(value: js.Array[SchemaGoogleFirestoreAdminV1beta1IndexField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaGoogleFirestoreAdminV1beta1IndexField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
