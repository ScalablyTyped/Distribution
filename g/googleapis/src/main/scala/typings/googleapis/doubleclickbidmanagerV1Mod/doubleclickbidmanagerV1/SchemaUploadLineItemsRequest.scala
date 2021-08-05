package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to upload line items.
  */
trait SchemaUploadLineItemsRequest extends StObject {
  
  /**
    * Set to true to get upload status without actually persisting the line
    * items.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format the line items are in. Default to CSV.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Line items in CSV to upload. Refer to  Entity Write File Format for more
    * information on file format.
    */
  var lineItems: js.UndefOr[String] = js.undefined
}
object SchemaUploadLineItemsRequest {
  
  inline def apply(): SchemaUploadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadLineItemsRequest]
  }
  
  extension [Self <: SchemaUploadLineItemsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLineItems(value: String): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
  }
}
