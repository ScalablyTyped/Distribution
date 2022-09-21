package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBrandsResponse extends StObject {
  
  /**
    * Brands existing in the project.
    */
  var brands: js.UndefOr[js.Array[SchemaBrand]] = js.undefined
}
object SchemaListBrandsResponse {
  
  inline def apply(): SchemaListBrandsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBrandsResponse]
  }
  
  extension [Self <: SchemaListBrandsResponse](x: Self) {
    
    inline def setBrands(value: js.Array[SchemaBrand]): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
    
    inline def setBrandsUndefined: Self = StObject.set(x, "brands", js.undefined)
    
    inline def setBrandsVarargs(value: SchemaBrand*): Self = StObject.set(x, "brands", js.Array(value*))
  }
}
