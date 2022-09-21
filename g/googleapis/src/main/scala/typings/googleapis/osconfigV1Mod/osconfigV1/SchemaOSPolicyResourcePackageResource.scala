package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourcePackageResource extends StObject {
  
  /**
    * A package managed by Apt.
    */
  var apt: js.UndefOr[SchemaOSPolicyResourcePackageResourceAPT] = js.undefined
  
  /**
    * A deb package file.
    */
  var deb: js.UndefOr[SchemaOSPolicyResourcePackageResourceDeb] = js.undefined
  
  /**
    * Required. The desired state the agent should maintain for this package.
    */
  var desiredState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A package managed by GooGet.
    */
  var googet: js.UndefOr[SchemaOSPolicyResourcePackageResourceGooGet] = js.undefined
  
  /**
    * An MSI package.
    */
  var msi: js.UndefOr[SchemaOSPolicyResourcePackageResourceMSI] = js.undefined
  
  /**
    * An rpm package file.
    */
  var rpm: js.UndefOr[SchemaOSPolicyResourcePackageResourceRPM] = js.undefined
  
  /**
    * A package managed by YUM.
    */
  var yum: js.UndefOr[SchemaOSPolicyResourcePackageResourceYUM] = js.undefined
  
  /**
    * A package managed by Zypper.
    */
  var zypper: js.UndefOr[SchemaOSPolicyResourcePackageResourceZypper] = js.undefined
}
object SchemaOSPolicyResourcePackageResource {
  
  inline def apply(): SchemaOSPolicyResourcePackageResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourcePackageResource]
  }
  
  extension [Self <: SchemaOSPolicyResourcePackageResource](x: Self) {
    
    inline def setApt(value: SchemaOSPolicyResourcePackageResourceAPT): Self = StObject.set(x, "apt", value.asInstanceOf[js.Any])
    
    inline def setAptUndefined: Self = StObject.set(x, "apt", js.undefined)
    
    inline def setDeb(value: SchemaOSPolicyResourcePackageResourceDeb): Self = StObject.set(x, "deb", value.asInstanceOf[js.Any])
    
    inline def setDebUndefined: Self = StObject.set(x, "deb", js.undefined)
    
    inline def setDesiredState(value: String): Self = StObject.set(x, "desiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateNull: Self = StObject.set(x, "desiredState", null)
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "desiredState", js.undefined)
    
    inline def setGooget(value: SchemaOSPolicyResourcePackageResourceGooGet): Self = StObject.set(x, "googet", value.asInstanceOf[js.Any])
    
    inline def setGoogetUndefined: Self = StObject.set(x, "googet", js.undefined)
    
    inline def setMsi(value: SchemaOSPolicyResourcePackageResourceMSI): Self = StObject.set(x, "msi", value.asInstanceOf[js.Any])
    
    inline def setMsiUndefined: Self = StObject.set(x, "msi", js.undefined)
    
    inline def setRpm(value: SchemaOSPolicyResourcePackageResourceRPM): Self = StObject.set(x, "rpm", value.asInstanceOf[js.Any])
    
    inline def setRpmUndefined: Self = StObject.set(x, "rpm", js.undefined)
    
    inline def setYum(value: SchemaOSPolicyResourcePackageResourceYUM): Self = StObject.set(x, "yum", value.asInstanceOf[js.Any])
    
    inline def setYumUndefined: Self = StObject.set(x, "yum", js.undefined)
    
    inline def setZypper(value: SchemaOSPolicyResourcePackageResourceZypper): Self = StObject.set(x, "zypper", value.asInstanceOf[js.Any])
    
    inline def setZypperUndefined: Self = StObject.set(x, "zypper", js.undefined)
  }
}
