package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSdfdownloadtasksOperationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the operation resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceSdfdownloadtasksOperationsGet {
  
  inline def apply(): ParamsResourceSdfdownloadtasksOperationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSdfdownloadtasksOperationsGet]
  }
  
  extension [Self <: ParamsResourceSdfdownloadtasksOperationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
