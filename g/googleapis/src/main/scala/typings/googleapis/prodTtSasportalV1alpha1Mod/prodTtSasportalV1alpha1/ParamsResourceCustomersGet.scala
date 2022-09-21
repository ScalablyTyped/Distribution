package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the customer.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersGet {
  
  inline def apply(): ParamsResourceCustomersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersGet]
  }
  
  extension [Self <: ParamsResourceCustomersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
