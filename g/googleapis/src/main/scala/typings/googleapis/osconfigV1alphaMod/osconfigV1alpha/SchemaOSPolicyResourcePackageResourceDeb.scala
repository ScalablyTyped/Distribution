package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourcePackageResourceDeb extends StObject {
  
  /**
    * Whether dependencies should also be installed. - install when false: `dpkg -i package` - install when true: `apt-get update && apt-get -y install package.deb`
    */
  var pullDeps: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. A deb package.
    */
  var source: js.UndefOr[SchemaOSPolicyResourceFile] = js.undefined
}
object SchemaOSPolicyResourcePackageResourceDeb {
  
  inline def apply(): SchemaOSPolicyResourcePackageResourceDeb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourcePackageResourceDeb]
  }
  
  extension [Self <: SchemaOSPolicyResourcePackageResourceDeb](x: Self) {
    
    inline def setPullDeps(value: Boolean): Self = StObject.set(x, "pullDeps", value.asInstanceOf[js.Any])
    
    inline def setPullDepsNull: Self = StObject.set(x, "pullDeps", null)
    
    inline def setPullDepsUndefined: Self = StObject.set(x, "pullDeps", js.undefined)
    
    inline def setSource(value: SchemaOSPolicyResourceFile): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
