package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFederation extends StObject {
  
  /**
    * A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
    */
  var backendMetastores: js.UndefOr[StringDictionary[SchemaBackendMetastore] | Null] = js.undefined
  
  /**
    * Output only. The time when the metastore federation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The federation endpoint.
    */
  var endpointUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-defined labels for the metastore federation.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Immutable. The relative resource name of the federation, of the form: projects/{project_number\}/locations/{location_id\}/federations/{federation_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the federation.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Additional information about the current state of the metastore federation, if available.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The globally unique resource identifier of the metastore federation.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the metastore federation was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The Apache Hive metastore version of the federation. All backend metastore versions must be compatible with the federation version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaFederation {
  
  inline def apply(): SchemaFederation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFederation]
  }
  
  extension [Self <: SchemaFederation](x: Self) {
    
    inline def setBackendMetastores(value: StringDictionary[SchemaBackendMetastore]): Self = StObject.set(x, "backendMetastores", value.asInstanceOf[js.Any])
    
    inline def setBackendMetastoresNull: Self = StObject.set(x, "backendMetastores", null)
    
    inline def setBackendMetastoresUndefined: Self = StObject.set(x, "backendMetastores", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndpointUri(value: String): Self = StObject.set(x, "endpointUri", value.asInstanceOf[js.Any])
    
    inline def setEndpointUriNull: Self = StObject.set(x, "endpointUri", null)
    
    inline def setEndpointUriUndefined: Self = StObject.set(x, "endpointUri", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
