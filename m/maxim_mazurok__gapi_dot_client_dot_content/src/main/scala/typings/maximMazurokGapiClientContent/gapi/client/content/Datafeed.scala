package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datafeed extends StObject {
  
  /** The two-letter ISO 639-1 language in which the attributes are defined in the data feed. */
  var attributeLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The type of data feed. For product inventory feeds, only feeds for local stores, not online stores, are supported. Acceptable values are: - "`local products`" - "`product
    * inventory`" - "`products`"
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** Fetch schedule for the feed file. */
  var fetchSchedule: js.UndefOr[DatafeedFetchSchedule] = js.undefined
  
  /** Required. The filename of the feed. All feeds must have a unique file name. */
  var fileName: js.UndefOr[String] = js.undefined
  
  /** Format of the feed file. */
  var format: js.UndefOr[DatafeedFormat] = js.undefined
  
  /** Required for update. The ID of the data feed. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#datafeed`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Required for insert. A descriptive name of the data feed. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The targets this feed should apply to (country, language, destinations). */
  var targets: js.UndefOr[js.Array[DatafeedTarget]] = js.undefined
}
object Datafeed {
  
  @scala.inline
  def apply(): Datafeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datafeed]
  }
  
  @scala.inline
  implicit class DatafeedMutableBuilder[Self <: Datafeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeLanguage(value: String): Self = StObject.set(x, "attributeLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeLanguageUndefined: Self = StObject.set(x, "attributeLanguage", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setFetchSchedule(value: DatafeedFetchSchedule): Self = StObject.set(x, "fetchSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchScheduleUndefined: Self = StObject.set(x, "fetchSchedule", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setFormat(value: DatafeedFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTargets(value: js.Array[DatafeedTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: DatafeedTarget*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
