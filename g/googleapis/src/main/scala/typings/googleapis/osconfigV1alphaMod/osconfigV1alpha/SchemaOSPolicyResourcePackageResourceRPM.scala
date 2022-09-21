package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourcePackageResourceRPM extends StObject {
  
  /**
    * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
    */
  var pullDeps: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. An rpm package.
    */
  var source: js.UndefOr[SchemaOSPolicyResourceFile] = js.undefined
}
object SchemaOSPolicyResourcePackageResourceRPM {
  
  inline def apply(): SchemaOSPolicyResourcePackageResourceRPM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourcePackageResourceRPM]
  }
  
  extension [Self <: SchemaOSPolicyResourcePackageResourceRPM](x: Self) {
    
    inline def setPullDeps(value: Boolean): Self = StObject.set(x, "pullDeps", value.asInstanceOf[js.Any])
    
    inline def setPullDepsNull: Self = StObject.set(x, "pullDeps", null)
    
    inline def setPullDepsUndefined: Self = StObject.set(x, "pullDeps", js.undefined)
    
    inline def setSource(value: SchemaOSPolicyResourceFile): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
