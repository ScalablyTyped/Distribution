package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The data response corresponding to the request.
  */
trait SchemaReport extends StObject {
  
  /**
    * The column headers.
    */
  var columnHeader: js.UndefOr[SchemaColumnHeader] = js.undefined
  
  /**
    * Response data.
    */
  var data: js.UndefOr[SchemaReportData] = js.undefined
  
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaReport {
  
  @scala.inline
  def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  
  @scala.inline
  implicit class SchemaReportMutableBuilder[Self <: SchemaReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnHeader(value: SchemaColumnHeader): Self = StObject.set(x, "columnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeaderUndefined: Self = StObject.set(x, "columnHeader", js.undefined)
    
    @scala.inline
    def setData(value: SchemaReportData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
