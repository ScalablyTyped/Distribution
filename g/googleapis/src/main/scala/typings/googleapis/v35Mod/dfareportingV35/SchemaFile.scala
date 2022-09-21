package typings.googleapis.v35Mod.dfareportingV35

import typings.googleapis.anon.ApiUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFile extends StObject {
  
  /**
    * The date range for which the file has report data. The date range will always be the absolute date range for which the report is run.
    */
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The filename of the file.
    */
  var fileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The output format of the report. Only available once the file is available.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID of this report file.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#file".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp in milliseconds since epoch when this file was last modified.
    */
  var lastModifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the report this file was generated from.
    */
  var reportId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the report file.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URLs where the completed report file can be downloaded.
    */
  var urls: js.UndefOr[ApiUrl | Null] = js.undefined
}
object SchemaFile {
  
  inline def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  
  extension [Self <: SchemaFile](x: Self) {
    
    inline def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdNull: Self = StObject.set(x, "reportId", null)
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUrls(value: ApiUrl): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsNull: Self = StObject.set(x, "urls", null)
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
  }
}
