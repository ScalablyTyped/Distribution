package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTaxonomiesExport
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the project that the exported taxonomies belong to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Serialized export taxonomies that contain all the policy tags as nested protocol buffers.
    */
  var serializedTaxonomies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Resource names of the taxonomies to export.
    */
  var taxonomies: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceProjectsLocationsTaxonomiesExport {
  
  inline def apply(): ParamsResourceProjectsLocationsTaxonomiesExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTaxonomiesExport]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTaxonomiesExport](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSerializedTaxonomies(value: Boolean): Self = StObject.set(x, "serializedTaxonomies", value.asInstanceOf[js.Any])
    
    inline def setSerializedTaxonomiesUndefined: Self = StObject.set(x, "serializedTaxonomies", js.undefined)
    
    inline def setTaxonomies(value: js.Array[String]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: String*): Self = StObject.set(x, "taxonomies", js.Array(value*))
  }
}
