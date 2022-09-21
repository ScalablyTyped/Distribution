package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaYumSettings extends StObject {
  
  /**
    * List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
    */
  var excludes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
    */
  var exclusivePackages: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Will cause patch to run `yum update-minimal` instead.
    */
  var minimal: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Adds the `--security` flag to `yum update`. Not supported on all platforms.
    */
  var security: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaYumSettings {
  
  inline def apply(): SchemaYumSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYumSettings]
  }
  
  extension [Self <: SchemaYumSettings](x: Self) {
    
    inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesNull: Self = StObject.set(x, "excludes", null)
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setExclusivePackages(value: js.Array[String]): Self = StObject.set(x, "exclusivePackages", value.asInstanceOf[js.Any])
    
    inline def setExclusivePackagesNull: Self = StObject.set(x, "exclusivePackages", null)
    
    inline def setExclusivePackagesUndefined: Self = StObject.set(x, "exclusivePackages", js.undefined)
    
    inline def setExclusivePackagesVarargs(value: String*): Self = StObject.set(x, "exclusivePackages", js.Array(value*))
    
    inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
    
    inline def setMinimalNull: Self = StObject.set(x, "minimal", null)
    
    inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
    
    inline def setSecurity(value: Boolean): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityNull: Self = StObject.set(x, "security", null)
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
  }
}
