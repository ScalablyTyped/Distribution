package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventoryVersionedPackage extends StObject {
  
  /**
    * The system architecture this package is intended for.
    */
  var architecture: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the package.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the package.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventoryVersionedPackage {
  
  inline def apply(): SchemaInventoryVersionedPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryVersionedPackage]
  }
  
  extension [Self <: SchemaInventoryVersionedPackage](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureNull: Self = StObject.set(x, "architecture", null)
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
