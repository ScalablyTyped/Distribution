package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Datafeed configuration data.
  */
@js.native
trait SchemaDatafeed extends StObject {
  
  /**
    * The two-letter ISO 639-1 language in which the attributes are defined in
    * the data feed.
    */
  var attributeLanguage: js.UndefOr[String] = js.native
  
  /**
    * [DEPRECATED] Please use targets[].language instead. The two-letter ISO
    * 639-1 language of the items in the feed. Must be a valid language for
    * targetCountry.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  
  /**
    * The type of data feed. For product inventory feeds, only feeds for local
    * stores, not online stores, are supported.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * Fetch schedule for the feed file.
    */
  var fetchSchedule: js.UndefOr[SchemaDatafeedFetchSchedule] = js.native
  
  /**
    * The filename of the feed. All feeds must have a unique file name.
    */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * Format of the feed file.
    */
  var format: js.UndefOr[SchemaDatafeedFormat] = js.native
  
  /**
    * The ID of the data feed.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [DEPRECATED] Please use targets[].includedDestinations instead. The list
    * of intended destinations (corresponds to checked check boxes in Merchant
    * Center).
    */
  var intendedDestinations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#datafeed&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A descriptive name of the data feed.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [DEPRECATED] Please use targets[].country instead. The country where the
    * items in the feed will be included in the search index, represented as a
    * CLDR territory code.
    */
  var targetCountry: js.UndefOr[String] = js.native
  
  /**
    * The targets this feed should apply to (country, language, destinations).
    */
  var targets: js.UndefOr[js.Array[SchemaDatafeedTarget]] = js.native
}
object SchemaDatafeed {
  
  @scala.inline
  def apply(): SchemaDatafeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeed]
  }
  
  @scala.inline
  implicit class SchemaDatafeedMutableBuilder[Self <: SchemaDatafeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeLanguage(value: String): Self = StObject.set(x, "attributeLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeLanguageUndefined: Self = StObject.set(x, "attributeLanguage", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setFetchSchedule(value: SchemaDatafeedFetchSchedule): Self = StObject.set(x, "fetchSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchScheduleUndefined: Self = StObject.set(x, "fetchSchedule", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setFormat(value: SchemaDatafeedFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIntendedDestinations(value: js.Array[String]): Self = StObject.set(x, "intendedDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntendedDestinationsUndefined: Self = StObject.set(x, "intendedDestinations", js.undefined)
    
    @scala.inline
    def setIntendedDestinationsVarargs(value: String*): Self = StObject.set(x, "intendedDestinations", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
    
    @scala.inline
    def setTargets(value: js.Array[SchemaDatafeedTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: SchemaDatafeedTarget*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
