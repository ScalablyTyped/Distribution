package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourcePackageResourceMSI extends StObject {
  
  /**
    * Additional properties to use during installation. This should be in the format of Property=Setting. Appended to the defaults of `ACTION=INSTALL REBOOT=ReallySuppress`.
    */
  var properties: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The MSI package.
    */
  var source: js.UndefOr[SchemaOSPolicyResourceFile] = js.undefined
}
object SchemaOSPolicyResourcePackageResourceMSI {
  
  inline def apply(): SchemaOSPolicyResourcePackageResourceMSI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourcePackageResourceMSI]
  }
  
  extension [Self <: SchemaOSPolicyResourcePackageResourceMSI](x: Self) {
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setSource(value: SchemaOSPolicyResourceFile): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
