package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.maximMazurokGapiClientDfareporting.anon.ApiUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  /** The date range for which the file has report data. The date range will always be the absolute date range for which the report is run. */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The filename of the file. */
  var fileName: js.UndefOr[String] = js.undefined
  
  /** The output format of the report. Only available once the file is available. */
  var format: js.UndefOr[String] = js.undefined
  
  /** The unique ID of this report file. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#file". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The timestamp in milliseconds since epoch when this file was last modified. */
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  
  /** The ID of the report this file was generated from. */
  var reportId: js.UndefOr[String] = js.undefined
  
  /** The status of the report file. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The URLs where the completed report file can be downloaded. */
  var urls: js.UndefOr[ApiUrl] = js.undefined
}
object File {
  
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    @scala.inline
    def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUrls(value: ApiUrl): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
  }
}
