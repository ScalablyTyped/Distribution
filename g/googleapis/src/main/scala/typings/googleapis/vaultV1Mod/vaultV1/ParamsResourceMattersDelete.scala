package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The matter ID
    */
  var matterId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMattersDelete {
  
  inline def apply(): ParamsResourceMattersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersDelete]
  }
  
  extension [Self <: ParamsResourceMattersDelete](x: Self) {
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
  }
}
