package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to fetch stored line items.
  */
trait SchemaDownloadLineItemsRequest extends StObject {
  
  /**
    * File specification (column names, types, order) in which the line items
    * will be returned. Default to EWF.
    */
  var fileSpec: js.UndefOr[String] = js.undefined
  
  /**
    * Ids of the specified filter type used to filter line items to fetch. If
    * omitted, all the line items will be returned.
    */
  var filterIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Filter type used to filter line items to fetch.
    */
  var filterType: js.UndefOr[String] = js.undefined
  
  /**
    * Format in which the line items will be returned. Default to CSV.
    */
  var format: js.UndefOr[String] = js.undefined
}
object SchemaDownloadLineItemsRequest {
  
  @scala.inline
  def apply(): SchemaDownloadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadLineItemsRequest]
  }
  
  @scala.inline
  implicit class SchemaDownloadLineItemsRequestMutableBuilder[Self <: SchemaDownloadLineItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSpec(value: String): Self = StObject.set(x, "fileSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSpecUndefined: Self = StObject.set(x, "fileSpec", js.undefined)
    
    @scala.inline
    def setFilterIds(value: js.Array[String]): Self = StObject.set(x, "filterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIdsUndefined: Self = StObject.set(x, "filterIds", js.undefined)
    
    @scala.inline
    def setFilterIdsVarargs(value: String*): Self = StObject.set(x, "filterIds", js.Array(value :_*))
    
    @scala.inline
    def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
