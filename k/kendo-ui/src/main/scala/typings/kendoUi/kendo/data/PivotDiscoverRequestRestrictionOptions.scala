package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDiscoverRequestRestrictionOptions extends StObject {
  
  var catalogName: String
  
  var cubeName: String
}
object PivotDiscoverRequestRestrictionOptions {
  
  inline def apply(catalogName: String, cubeName: String): PivotDiscoverRequestRestrictionOptions = {
    val __obj = js.Dynamic.literal(catalogName = catalogName.asInstanceOf[js.Any], cubeName = cubeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDiscoverRequestRestrictionOptions]
  }
  
  extension [Self <: PivotDiscoverRequestRestrictionOptions](x: Self) {
    
    inline def setCatalogName(value: String): Self = StObject.set(x, "catalogName", value.asInstanceOf[js.Any])
    
    inline def setCubeName(value: String): Self = StObject.set(x, "cubeName", value.asInstanceOf[js.Any])
  }
}
