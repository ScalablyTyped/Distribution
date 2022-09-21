package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCasesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The fully qualified name of a case to be retrieved.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceCasesGet {
  
  inline def apply(): ParamsResourceCasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCasesGet]
  }
  
  extension [Self <: ParamsResourceCasesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
