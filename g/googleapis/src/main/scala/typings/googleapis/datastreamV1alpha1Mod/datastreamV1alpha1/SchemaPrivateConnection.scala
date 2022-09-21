package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivateConnection extends StObject {
  
  /**
    * Output only. The create time of the resource.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. In case of error, the details of the error in a user-friendly format.
    */
  var error: js.UndefOr[SchemaError] = js.undefined
  
  /**
    * Labels.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The resource's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of the Private Connection.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The update time of the resource.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * VPC Peering Config
    */
  var vpcPeeringConfig: js.UndefOr[SchemaVpcPeeringConfig] = js.undefined
}
object SchemaPrivateConnection {
  
  inline def apply(): SchemaPrivateConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateConnection]
  }
  
  extension [Self <: SchemaPrivateConnection](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setError(value: SchemaError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVpcPeeringConfig(value: SchemaVpcPeeringConfig): Self = StObject.set(x, "vpcPeeringConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConfigUndefined: Self = StObject.set(x, "vpcPeeringConfig", js.undefined)
  }
}
