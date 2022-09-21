package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTransfersGet
  extends StObject
     with StandardParameters {
  
  /**
    * ID of the resource to be retrieved. This is returned in the response from the insert method.
    */
  var dataTransferId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTransfersGet {
  
  inline def apply(): ParamsResourceTransfersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransfersGet]
  }
  
  extension [Self <: ParamsResourceTransfersGet](x: Self) {
    
    inline def setDataTransferId(value: String): Self = StObject.set(x, "dataTransferId", value.asInstanceOf[js.Any])
    
    inline def setDataTransferIdUndefined: Self = StObject.set(x, "dataTransferId", js.undefined)
  }
}
