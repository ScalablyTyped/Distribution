package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Download line items response.
  */
trait SchemaDownloadLineItemsResponse extends StObject {
  
  /**
    * Retrieved line items in CSV format. For more information about file
    * formats, see  Entity Write File Format.
    */
  var lineItems: js.UndefOr[String] = js.undefined
}
object SchemaDownloadLineItemsResponse {
  
  inline def apply(): SchemaDownloadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadLineItemsResponse]
  }
  
  extension [Self <: SchemaDownloadLineItemsResponse](x: Self) {
    
    inline def setLineItems(value: String): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
  }
}
