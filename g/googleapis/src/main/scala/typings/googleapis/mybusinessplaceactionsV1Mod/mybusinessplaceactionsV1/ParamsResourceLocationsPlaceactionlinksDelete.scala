package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsPlaceactionlinksDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the place action link to remove from the location.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsPlaceactionlinksDelete {
  
  inline def apply(): ParamsResourceLocationsPlaceactionlinksDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsPlaceactionlinksDelete]
  }
  
  extension [Self <: ParamsResourceLocationsPlaceactionlinksDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
