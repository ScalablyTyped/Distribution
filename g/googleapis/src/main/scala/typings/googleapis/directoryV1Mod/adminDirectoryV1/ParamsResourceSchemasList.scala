package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSchemasList
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable ID of the Google Workspace account.
    */
  var customerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSchemasList {
  
  inline def apply(): ParamsResourceSchemasList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSchemasList]
  }
  
  extension [Self <: ParamsResourceSchemasList](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
