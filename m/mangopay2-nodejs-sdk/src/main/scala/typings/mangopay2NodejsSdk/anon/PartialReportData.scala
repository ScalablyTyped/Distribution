package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTIONS
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.report.Column
import typings.mangopay2NodejsSdk.mod.report.Filters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.ReportData> */
trait PartialReportData extends StObject {
  
  var CallbackURL: js.UndefOr[String] = js.undefined
  
  var Columns: js.UndefOr[js.Array[Column]] = js.undefined
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var DownloadFormat: js.UndefOr[CSV] = js.undefined
  
  var DownloadURL: js.UndefOr[String] = js.undefined
  
  var Filters: js.UndefOr[typings.mangopay2NodejsSdk.mod.report.Filters] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var Preview: js.UndefOr[Boolean] = js.undefined
  
  var ReportDate: js.UndefOr[Timestamp] = js.undefined
  
  var ReportType: js.UndefOr[TRANSACTIONS] = js.undefined
  
  var ResultCode: js.UndefOr[String] = js.undefined
  
  var ResultMessage: js.UndefOr[String] = js.undefined
  
  var Sort: js.UndefOr[String] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
}
object PartialReportData {
  
  @scala.inline
  def apply(): PartialReportData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReportData]
  }
  
  @scala.inline
  implicit class PartialReportDataMutableBuilder[Self <: PartialReportData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackURL(value: String): Self = StObject.set(x, "CallbackURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackURLUndefined: Self = StObject.set(x, "CallbackURL", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value :_*))
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDownloadFormat(value: CSV): Self = StObject.set(x, "DownloadFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadFormatUndefined: Self = StObject.set(x, "DownloadFormat", js.undefined)
    
    @scala.inline
    def setDownloadURL(value: String): Self = StObject.set(x, "DownloadURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadURLUndefined: Self = StObject.set(x, "DownloadURL", js.undefined)
    
    @scala.inline
    def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "Preview", js.undefined)
    
    @scala.inline
    def setReportDate(value: Timestamp): Self = StObject.set(x, "ReportDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportDateUndefined: Self = StObject.set(x, "ReportDate", js.undefined)
    
    @scala.inline
    def setReportType(value: TRANSACTIONS): Self = StObject.set(x, "ReportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTypeUndefined: Self = StObject.set(x, "ReportType", js.undefined)
    
    @scala.inline
    def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCodeUndefined: Self = StObject.set(x, "ResultCode", js.undefined)
    
    @scala.inline
    def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultMessageUndefined: Self = StObject.set(x, "ResultMessage", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
