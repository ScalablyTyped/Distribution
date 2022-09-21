package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsPlaceactionlinksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the place action link to fetch.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsPlaceactionlinksGet {
  
  inline def apply(): ParamsResourceLocationsPlaceactionlinksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsPlaceactionlinksGet]
  }
  
  extension [Self <: ParamsResourceLocationsPlaceactionlinksGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
