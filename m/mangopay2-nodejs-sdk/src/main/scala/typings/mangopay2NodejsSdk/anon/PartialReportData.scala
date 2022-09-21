package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTION
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WALLET
import typings.mangopay2NodejsSdk.reportMod.report.Column
import typings.mangopay2NodejsSdk.reportMod.report.Filters
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/report.report.ReportData> */
trait PartialReportData extends StObject {
  
  var CallbackURL: js.UndefOr[String] = js.undefined
  
  var Columns: js.UndefOr[js.Array[Column]] = js.undefined
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var DownloadFormat: js.UndefOr[CSV] = js.undefined
  
  var DownloadURL: js.UndefOr[String] = js.undefined
  
  var Filters: js.UndefOr[typings.mangopay2NodejsSdk.reportMod.report.Filters] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var Preview: js.UndefOr[Boolean] = js.undefined
  
  var ReportDate: js.UndefOr[Timestamp] = js.undefined
  
  var ReportType: js.UndefOr[TRANSACTION | WALLET] = js.undefined
  
  var ResultCode: js.UndefOr[String] = js.undefined
  
  var ResultMessage: js.UndefOr[String] = js.undefined
  
  var Sort: js.UndefOr[String] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
}
object PartialReportData {
  
  inline def apply(): PartialReportData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReportData]
  }
  
  extension [Self <: PartialReportData](x: Self) {
    
    inline def setCallbackURL(value: String): Self = StObject.set(x, "CallbackURL", value.asInstanceOf[js.Any])
    
    inline def setCallbackURLUndefined: Self = StObject.set(x, "CallbackURL", js.undefined)
    
    inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDownloadFormat(value: CSV): Self = StObject.set(x, "DownloadFormat", value.asInstanceOf[js.Any])
    
    inline def setDownloadFormatUndefined: Self = StObject.set(x, "DownloadFormat", js.undefined)
    
    inline def setDownloadURL(value: String): Self = StObject.set(x, "DownloadURL", value.asInstanceOf[js.Any])
    
    inline def setDownloadURLUndefined: Self = StObject.set(x, "DownloadURL", js.undefined)
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "Preview", js.undefined)
    
    inline def setReportDate(value: Timestamp): Self = StObject.set(x, "ReportDate", value.asInstanceOf[js.Any])
    
    inline def setReportDateUndefined: Self = StObject.set(x, "ReportDate", js.undefined)
    
    inline def setReportType(value: TRANSACTION | WALLET): Self = StObject.set(x, "ReportType", value.asInstanceOf[js.Any])
    
    inline def setReportTypeUndefined: Self = StObject.set(x, "ReportType", js.undefined)
    
    inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    inline def setResultCodeUndefined: Self = StObject.set(x, "ResultCode", js.undefined)
    
    inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
    
    inline def setResultMessageUndefined: Self = StObject.set(x, "ResultMessage", js.undefined)
    
    inline def setSort(value: String): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
