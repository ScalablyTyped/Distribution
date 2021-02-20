package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An index definition.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta1Index extends StObject {
  
  /**
    * The collection ID to which this index applies. Required.
    */
  var collectionId: js.UndefOr[String] = js.native
  
  /**
    * The fields to index.
    */
  var fields: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta1IndexField]] = js.native
  
  /**
    * The resource name of the index. Output only.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The state of the index. Output only.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaGoogleFirestoreAdminV1beta1Index {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1Index]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1IndexMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta1Index] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[SchemaGoogleFirestoreAdminV1beta1IndexField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaGoogleFirestoreAdminV1beta1IndexField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
