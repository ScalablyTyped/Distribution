package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAptSettings extends StObject {
  
  /**
    * List of packages to exclude from update. These packages will be excluded
    */
  var excludes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field cannot be specified with any other patch configuration fields.
    */
  var exclusivePackages: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * By changing the type to DIST, the patching is performed using `apt-get dist-upgrade` instead.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAptSettings {
  
  inline def apply(): SchemaAptSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAptSettings]
  }
  
  extension [Self <: SchemaAptSettings](x: Self) {
    
    inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesNull: Self = StObject.set(x, "excludes", null)
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setExclusivePackages(value: js.Array[String]): Self = StObject.set(x, "exclusivePackages", value.asInstanceOf[js.Any])
    
    inline def setExclusivePackagesNull: Self = StObject.set(x, "exclusivePackages", null)
    
    inline def setExclusivePackagesUndefined: Self = StObject.set(x, "exclusivePackages", js.undefined)
    
    inline def setExclusivePackagesVarargs(value: String*): Self = StObject.set(x, "exclusivePackages", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
