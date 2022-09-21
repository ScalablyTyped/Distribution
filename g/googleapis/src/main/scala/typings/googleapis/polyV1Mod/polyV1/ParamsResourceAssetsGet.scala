package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAssetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. An asset's name in the form `assets/{ASSET_ID\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAssetsGet {
  
  inline def apply(): ParamsResourceAssetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssetsGet]
  }
  
  extension [Self <: ParamsResourceAssetsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
