package typings.googleapis.v32Mod.dfareportingV32

import typings.googleapis.anon.ApiUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a File resource. A file contains the metadata for a report run.
  * It shows the status of the run and holds the URLs to the generated report
  * data if the run is finished and the status is &quot;REPORT_AVAILABLE&quot;.
  */
@js.native
trait SchemaFile extends StObject {
  
  /**
    * The date range for which the file has report data. The date range will
    * always be the absolute date range for which the report is run.
    */
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The filename of the file.
    */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * The output format of the report. Only available once the file is
    * available.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of this report file.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The kind of resource this is, in this case dfareporting#file.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The timestamp in milliseconds since epoch when this file was last
    * modified.
    */
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  /**
    * The ID of the report this file was generated from.
    */
  var reportId: js.UndefOr[String] = js.native
  
  /**
    * The status of the report file.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The URLs where the completed report file can be downloaded.
    */
  var urls: js.UndefOr[ApiUrl] = js.native
}
object SchemaFile {
  
  @scala.inline
  def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  
  @scala.inline
  implicit class SchemaFileMutableBuilder[Self <: SchemaFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
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
