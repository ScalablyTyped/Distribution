package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectionProfile extends StObject {
  
  /**
    * Output only. The create time of the resource.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Forward SSH tunnel connectivity.
    */
  var forwardSshConnectivity: js.UndefOr[SchemaForwardSshTunnelConnectivity] = js.undefined
  
  /**
    * Cloud Storage ConnectionProfile configuration.
    */
  var gcsProfile: js.UndefOr[SchemaGcsProfile] = js.undefined
  
  /**
    * Labels.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * MySQL ConnectionProfile configuration.
    */
  var mysqlProfile: js.UndefOr[SchemaMysqlProfile] = js.undefined
  
  /**
    * Output only. The resource's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * No connectivity option chosen.
    */
  var noConnectivity: js.UndefOr[SchemaNoConnectivitySettings] = js.undefined
  
  /**
    * Oracle ConnectionProfile configuration.
    */
  var oracleProfile: js.UndefOr[SchemaOracleProfile] = js.undefined
  
  /**
    * Private connectivity.
    */
  var privateConnectivity: js.UndefOr[SchemaPrivateConnectivity] = js.undefined
  
  /**
    * Static Service IP connectivity.
    */
  var staticServiceIpConnectivity: js.UndefOr[SchemaStaticServiceIpConnectivity] = js.undefined
  
  /**
    * Output only. The update time of the resource.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnectionProfile {
  
  inline def apply(): SchemaConnectionProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionProfile]
  }
  
  extension [Self <: SchemaConnectionProfile](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setForwardSshConnectivity(value: SchemaForwardSshTunnelConnectivity): Self = StObject.set(x, "forwardSshConnectivity", value.asInstanceOf[js.Any])
    
    inline def setForwardSshConnectivityUndefined: Self = StObject.set(x, "forwardSshConnectivity", js.undefined)
    
    inline def setGcsProfile(value: SchemaGcsProfile): Self = StObject.set(x, "gcsProfile", value.asInstanceOf[js.Any])
    
    inline def setGcsProfileUndefined: Self = StObject.set(x, "gcsProfile", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMysqlProfile(value: SchemaMysqlProfile): Self = StObject.set(x, "mysqlProfile", value.asInstanceOf[js.Any])
    
    inline def setMysqlProfileUndefined: Self = StObject.set(x, "mysqlProfile", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoConnectivity(value: SchemaNoConnectivitySettings): Self = StObject.set(x, "noConnectivity", value.asInstanceOf[js.Any])
    
    inline def setNoConnectivityUndefined: Self = StObject.set(x, "noConnectivity", js.undefined)
    
    inline def setOracleProfile(value: SchemaOracleProfile): Self = StObject.set(x, "oracleProfile", value.asInstanceOf[js.Any])
    
    inline def setOracleProfileUndefined: Self = StObject.set(x, "oracleProfile", js.undefined)
    
    inline def setPrivateConnectivity(value: SchemaPrivateConnectivity): Self = StObject.set(x, "privateConnectivity", value.asInstanceOf[js.Any])
    
    inline def setPrivateConnectivityUndefined: Self = StObject.set(x, "privateConnectivity", js.undefined)
    
    inline def setStaticServiceIpConnectivity(value: SchemaStaticServiceIpConnectivity): Self = StObject.set(x, "staticServiceIpConnectivity", value.asInstanceOf[js.Any])
    
    inline def setStaticServiceIpConnectivityUndefined: Self = StObject.set(x, "staticServiceIpConnectivity", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
