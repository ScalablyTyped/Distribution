package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Download line items response.
  */
@js.native
trait SchemaDownloadLineItemsResponse extends StObject {
  
  /**
    * Retrieved line items in CSV format. For more information about file
    * formats, see  Entity Write File Format.
    */
  var lineItems: js.UndefOr[String] = js.native
}
object SchemaDownloadLineItemsResponse {
  
  @scala.inline
  def apply(): SchemaDownloadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadLineItemsResponse]
  }
  
  @scala.inline
  implicit class SchemaDownloadLineItemsResponseMutableBuilder[Self <: SchemaDownloadLineItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItems(value: String): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
  }
}
