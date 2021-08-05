package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User specified settings that are attached to the Cloud Security Command
  * Center (Cloud SCC) organization.
  */
trait SchemaOrganizationSettings extends StObject {
  
  /**
    * The configuration used for Asset Discovery runs.
    */
  var assetDiscoveryConfig: js.UndefOr[SchemaAssetDiscoveryConfig] = js.undefined
  
  /**
    * A flag that indicates if Asset Discovery should be enabled. If the flag
    * is set to `true`, then discovery of assets will occur. If it is set to
    * `false, all historical assets will remain, but discovery of future assets
    * will not occur.
    */
  var enableAssetDiscovery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The relative resource name of the settings. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/organizationSettings&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaOrganizationSettings {
  
  inline def apply(): SchemaOrganizationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganizationSettings]
  }
  
  extension [Self <: SchemaOrganizationSettings](x: Self) {
    
    inline def setAssetDiscoveryConfig(value: SchemaAssetDiscoveryConfig): Self = StObject.set(x, "assetDiscoveryConfig", value.asInstanceOf[js.Any])
    
    inline def setAssetDiscoveryConfigUndefined: Self = StObject.set(x, "assetDiscoveryConfig", js.undefined)
    
    inline def setEnableAssetDiscovery(value: Boolean): Self = StObject.set(x, "enableAssetDiscovery", value.asInstanceOf[js.Any])
    
    inline def setEnableAssetDiscoveryUndefined: Self = StObject.set(x, "enableAssetDiscovery", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
