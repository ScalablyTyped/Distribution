package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1Index extends StObject {
  
  /**
    * Required. The index's ancestor mode. Must not be ANCESTOR_MODE_UNSPECIFIED.
    */
  var ancestor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource ID of the index.
    */
  var indexId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The entity kind to which this index applies.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Project ID.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. An ordered sequence of property names and their index attributes.
    */
  var properties: js.UndefOr[js.Array[SchemaGoogleDatastoreAdminV1IndexedProperty]] = js.undefined
  
  /**
    * Output only. The state of the index.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1Index {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1Index]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1Index](x: Self) {
    
    inline def setAncestor(value: String): Self = StObject.set(x, "ancestor", value.asInstanceOf[js.Any])
    
    inline def setAncestorNull: Self = StObject.set(x, "ancestor", null)
    
    inline def setAncestorUndefined: Self = StObject.set(x, "ancestor", js.undefined)
    
    inline def setIndexId(value: String): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdNull: Self = StObject.set(x, "indexId", null)
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "indexId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setProperties(value: js.Array[SchemaGoogleDatastoreAdminV1IndexedProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: SchemaGoogleDatastoreAdminV1IndexedProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
