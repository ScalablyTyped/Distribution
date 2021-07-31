package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A minimal index definition.
  */
trait SchemaGoogleDatastoreAdminV1Index extends StObject {
  
  /**
    * The index&#39;s ancestor mode.  Must not be ANCESTOR_MODE_UNSPECIFIED.
    * Required.
    */
  var ancestor: js.UndefOr[String] = js.undefined
  
  /**
    * The resource ID of the index. Output only.
    */
  var indexId: js.UndefOr[String] = js.undefined
  
  /**
    * The entity kind to which this index applies. Required.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID. Output only.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * An ordered sequence of property names and their index attributes.
    * Required.
    */
  var properties: js.UndefOr[js.Array[SchemaGoogleDatastoreAdminV1IndexedProperty]] = js.undefined
  
  /**
    * The state of the index. Output only.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDatastoreAdminV1Index {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1Index]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1IndexMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1Index] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncestor(value: String): Self = StObject.set(x, "ancestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestorUndefined: Self = StObject.set(x, "ancestor", js.undefined)
    
    @scala.inline
    def setIndexId(value: String): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexIdUndefined: Self = StObject.set(x, "indexId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[SchemaGoogleDatastoreAdminV1IndexedProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: SchemaGoogleDatastoreAdminV1IndexedProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
