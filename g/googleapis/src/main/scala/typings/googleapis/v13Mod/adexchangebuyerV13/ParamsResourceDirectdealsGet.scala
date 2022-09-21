package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDirectdealsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The direct deal id
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceDirectdealsGet {
  
  inline def apply(): ParamsResourceDirectdealsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDirectdealsGet]
  }
  
  extension [Self <: ParamsResourceDirectdealsGet](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
