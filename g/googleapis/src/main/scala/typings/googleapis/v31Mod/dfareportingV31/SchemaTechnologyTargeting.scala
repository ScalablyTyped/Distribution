package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Technology Targeting.
  */
trait SchemaTechnologyTargeting extends StObject {
  
  /**
    * Browsers that this ad targets. For each browser either set
    * browserVersionId or dartId along with the version numbers. If both are
    * specified, only browserVersionId will be used. The other fields are
    * populated automatically when the ad is inserted or updated.
    */
  var browsers: js.UndefOr[js.Array[SchemaBrowser]] = js.undefined
  
  /**
    * Connection types that this ad targets. For each connection type only id
    * is required. The other fields are populated automatically when the ad is
    * inserted or updated.
    */
  var connectionTypes: js.UndefOr[js.Array[SchemaConnectionType]] = js.undefined
  
  /**
    * Mobile carriers that this ad targets. For each mobile carrier only id is
    * required, and the other fields are populated automatically when the ad is
    * inserted or updated. If targeting a mobile carrier, do not set targeting
    * for any zip codes.
    */
  var mobileCarriers: js.UndefOr[js.Array[SchemaMobileCarrier]] = js.undefined
  
  /**
    * Operating system versions that this ad targets. To target all versions,
    * use operatingSystems. For each operating system version, only id is
    * required. The other fields are populated automatically when the ad is
    * inserted or updated. If targeting an operating system version, do not set
    * targeting for the corresponding operating system in operatingSystems.
    */
  var operatingSystemVersions: js.UndefOr[js.Array[SchemaOperatingSystemVersion]] = js.undefined
  
  /**
    * Operating systems that this ad targets. To target specific versions, use
    * operatingSystemVersions. For each operating system only dartId is
    * required. The other fields are populated automatically when the ad is
    * inserted or updated. If targeting an operating system, do not set
    * targeting for operating system versions for the same operating system.
    */
  var operatingSystems: js.UndefOr[js.Array[SchemaOperatingSystem]] = js.undefined
  
  /**
    * Platform types that this ad targets. For example, desktop, mobile, or
    * tablet. For each platform type, only id is required, and the other fields
    * are populated automatically when the ad is inserted or updated.
    */
  var platformTypes: js.UndefOr[js.Array[SchemaPlatformType]] = js.undefined
}
object SchemaTechnologyTargeting {
  
  inline def apply(): SchemaTechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTechnologyTargeting]
  }
  
  extension [Self <: SchemaTechnologyTargeting](x: Self) {
    
    inline def setBrowsers(value: js.Array[SchemaBrowser]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
    
    inline def setBrowsersVarargs(value: SchemaBrowser*): Self = StObject.set(x, "browsers", js.Array(value :_*))
    
    inline def setConnectionTypes(value: js.Array[SchemaConnectionType]): Self = StObject.set(x, "connectionTypes", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypesUndefined: Self = StObject.set(x, "connectionTypes", js.undefined)
    
    inline def setConnectionTypesVarargs(value: SchemaConnectionType*): Self = StObject.set(x, "connectionTypes", js.Array(value :_*))
    
    inline def setMobileCarriers(value: js.Array[SchemaMobileCarrier]): Self = StObject.set(x, "mobileCarriers", value.asInstanceOf[js.Any])
    
    inline def setMobileCarriersUndefined: Self = StObject.set(x, "mobileCarriers", js.undefined)
    
    inline def setMobileCarriersVarargs(value: SchemaMobileCarrier*): Self = StObject.set(x, "mobileCarriers", js.Array(value :_*))
    
    inline def setOperatingSystemVersions(value: js.Array[SchemaOperatingSystemVersion]): Self = StObject.set(x, "operatingSystemVersions", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemVersionsUndefined: Self = StObject.set(x, "operatingSystemVersions", js.undefined)
    
    inline def setOperatingSystemVersionsVarargs(value: SchemaOperatingSystemVersion*): Self = StObject.set(x, "operatingSystemVersions", js.Array(value :_*))
    
    inline def setOperatingSystems(value: js.Array[SchemaOperatingSystem]): Self = StObject.set(x, "operatingSystems", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemsUndefined: Self = StObject.set(x, "operatingSystems", js.undefined)
    
    inline def setOperatingSystemsVarargs(value: SchemaOperatingSystem*): Self = StObject.set(x, "operatingSystems", js.Array(value :_*))
    
    inline def setPlatformTypes(value: js.Array[SchemaPlatformType]): Self = StObject.set(x, "platformTypes", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypesUndefined: Self = StObject.set(x, "platformTypes", js.undefined)
    
    inline def setPlatformTypesVarargs(value: SchemaPlatformType*): Self = StObject.set(x, "platformTypes", js.Array(value :_*))
  }
}
