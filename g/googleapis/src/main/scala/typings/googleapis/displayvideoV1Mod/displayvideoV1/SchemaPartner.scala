package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartner extends StObject {
  
  /**
    * Ad server related settings of the partner.
    */
  var adServerConfig: js.UndefOr[SchemaPartnerAdServerConfig] = js.undefined
  
  /**
    * Settings that control how partner data may be accessed.
    */
  var dataAccessConfig: js.UndefOr[SchemaPartnerDataAccessConfig] = js.undefined
  
  /**
    * The display name of the partner. Must be UTF-8 encoded with a maximum size of 240 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The status of the partner.
    */
  var entityStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Settings that control which exchanges are enabled for the partner.
    */
  var exchangeConfig: js.UndefOr[SchemaExchangeConfig] = js.undefined
  
  /**
    * General settings of the partner.
    */
  var generalConfig: js.UndefOr[SchemaPartnerGeneralConfig] = js.undefined
  
  /**
    * Output only. The resource name of the partner.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique ID of the partner. Assigned by the system.
    */
  var partnerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the partner was last updated. Assigned by the system.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPartner {
  
  inline def apply(): SchemaPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartner]
  }
  
  extension [Self <: SchemaPartner](x: Self) {
    
    inline def setAdServerConfig(value: SchemaPartnerAdServerConfig): Self = StObject.set(x, "adServerConfig", value.asInstanceOf[js.Any])
    
    inline def setAdServerConfigUndefined: Self = StObject.set(x, "adServerConfig", js.undefined)
    
    inline def setDataAccessConfig(value: SchemaPartnerDataAccessConfig): Self = StObject.set(x, "dataAccessConfig", value.asInstanceOf[js.Any])
    
    inline def setDataAccessConfigUndefined: Self = StObject.set(x, "dataAccessConfig", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    inline def setEntityStatusNull: Self = StObject.set(x, "entityStatus", null)
    
    inline def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    inline def setExchangeConfig(value: SchemaExchangeConfig): Self = StObject.set(x, "exchangeConfig", value.asInstanceOf[js.Any])
    
    inline def setExchangeConfigUndefined: Self = StObject.set(x, "exchangeConfig", js.undefined)
    
    inline def setGeneralConfig(value: SchemaPartnerGeneralConfig): Self = StObject.set(x, "generalConfig", value.asInstanceOf[js.Any])
    
    inline def setGeneralConfigUndefined: Self = StObject.set(x, "generalConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdNull: Self = StObject.set(x, "partnerId", null)
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
