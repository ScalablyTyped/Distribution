package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaZypperSettings extends StObject {
  
  /**
    * Install only patches with these categories. Common categories include security, recommended, and feature.
    */
  var categories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of patches to exclude from update.
    */
  var excludes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * An exclusive list of patches to be updated. These are the only patches that will be installed using 'zypper patch patch:' command. This field must not be used with any other patch configuration fields.
    */
  var exclusivePatches: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Install only patches with these severities. Common severities include critical, important, moderate, and low.
    */
  var severities: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Adds the `--with-optional` flag to `zypper patch`.
    */
  var withOptional: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Adds the `--with-update` flag, to `zypper patch`.
    */
  var withUpdate: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaZypperSettings {
  
  inline def apply(): SchemaZypperSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZypperSettings]
  }
  
  extension [Self <: SchemaZypperSettings](x: Self) {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesNull: Self = StObject.set(x, "excludes", null)
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setExclusivePatches(value: js.Array[String]): Self = StObject.set(x, "exclusivePatches", value.asInstanceOf[js.Any])
    
    inline def setExclusivePatchesNull: Self = StObject.set(x, "exclusivePatches", null)
    
    inline def setExclusivePatchesUndefined: Self = StObject.set(x, "exclusivePatches", js.undefined)
    
    inline def setExclusivePatchesVarargs(value: String*): Self = StObject.set(x, "exclusivePatches", js.Array(value*))
    
    inline def setSeverities(value: js.Array[String]): Self = StObject.set(x, "severities", value.asInstanceOf[js.Any])
    
    inline def setSeveritiesNull: Self = StObject.set(x, "severities", null)
    
    inline def setSeveritiesUndefined: Self = StObject.set(x, "severities", js.undefined)
    
    inline def setSeveritiesVarargs(value: String*): Self = StObject.set(x, "severities", js.Array(value*))
    
    inline def setWithOptional(value: Boolean): Self = StObject.set(x, "withOptional", value.asInstanceOf[js.Any])
    
    inline def setWithOptionalNull: Self = StObject.set(x, "withOptional", null)
    
    inline def setWithOptionalUndefined: Self = StObject.set(x, "withOptional", js.undefined)
    
    inline def setWithUpdate(value: Boolean): Self = StObject.set(x, "withUpdate", value.asInstanceOf[js.Any])
    
    inline def setWithUpdateNull: Self = StObject.set(x, "withUpdate", null)
    
    inline def setWithUpdateUndefined: Self = StObject.set(x, "withUpdate", js.undefined)
  }
}
