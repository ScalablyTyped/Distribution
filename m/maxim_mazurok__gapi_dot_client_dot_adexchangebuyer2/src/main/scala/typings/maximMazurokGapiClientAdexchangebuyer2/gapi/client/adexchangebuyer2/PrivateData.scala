package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateData extends StObject {
  
  /** A buyer or seller specified reference ID. This can be queried in the list operations (max-length: 1024 unicode code units). */
  var referenceId: js.UndefOr[String] = js.undefined
}
object PrivateData {
  
  inline def apply(): PrivateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateData]
  }
  
  extension [Self <: PrivateData](x: Self) {
    
    inline def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    inline def setReferenceIdUndefined: Self = StObject.set(x, "referenceId", js.undefined)
  }
}
