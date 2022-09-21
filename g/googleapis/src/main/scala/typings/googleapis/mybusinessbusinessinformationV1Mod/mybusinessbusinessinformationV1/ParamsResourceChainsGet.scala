package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChainsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The chain's resource name, in the format `chains/{chain_place_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceChainsGet {
  
  inline def apply(): ParamsResourceChainsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChainsGet]
  }
  
  extension [Self <: ParamsResourceChainsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
