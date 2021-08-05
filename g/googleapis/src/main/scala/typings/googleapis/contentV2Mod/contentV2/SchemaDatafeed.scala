package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Datafeed configuration data.
  */
trait SchemaDatafeed extends StObject {
  
  /**
    * The two-letter ISO 639-1 language in which the attributes are defined in
    * the data feed.
    */
  var attributeLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * [DEPRECATED] Please use targets[].language instead. The two-letter ISO
    * 639-1 language of the items in the feed. Must be a valid language for
    * targetCountry.
    */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The type of data feed. For product inventory feeds, only feeds for local
    * stores, not online stores, are supported.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * Fetch schedule for the feed file.
    */
  var fetchSchedule: js.UndefOr[SchemaDatafeedFetchSchedule] = js.undefined
  
  /**
    * The filename of the feed. All feeds must have a unique file name.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Format of the feed file.
    */
  var format: js.UndefOr[SchemaDatafeedFormat] = js.undefined
  
  /**
    * The ID of the data feed.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [DEPRECATED] Please use targets[].includedDestinations instead. The list
    * of intended destinations (corresponds to checked check boxes in Merchant
    * Center).
    */
  var intendedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#datafeed&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A descriptive name of the data feed.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [DEPRECATED] Please use targets[].country instead. The country where the
    * items in the feed will be included in the search index, represented as a
    * CLDR territory code.
    */
  var targetCountry: js.UndefOr[String] = js.undefined
  
  /**
    * The targets this feed should apply to (country, language, destinations).
    */
  var targets: js.UndefOr[js.Array[SchemaDatafeedTarget]] = js.undefined
}
object SchemaDatafeed {
  
  inline def apply(): SchemaDatafeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeed]
  }
  
  extension [Self <: SchemaDatafeed](x: Self) {
    
    inline def setAttributeLanguage(value: String): Self = StObject.set(x, "attributeLanguage", value.asInstanceOf[js.Any])
    
    inline def setAttributeLanguageUndefined: Self = StObject.set(x, "attributeLanguage", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setFetchSchedule(value: SchemaDatafeedFetchSchedule): Self = StObject.set(x, "fetchSchedule", value.asInstanceOf[js.Any])
    
    inline def setFetchScheduleUndefined: Self = StObject.set(x, "fetchSchedule", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFormat(value: SchemaDatafeedFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIntendedDestinations(value: js.Array[String]): Self = StObject.set(x, "intendedDestinations", value.asInstanceOf[js.Any])
    
    inline def setIntendedDestinationsUndefined: Self = StObject.set(x, "intendedDestinations", js.undefined)
    
    inline def setIntendedDestinationsVarargs(value: String*): Self = StObject.set(x, "intendedDestinations", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    inline def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
    
    inline def setTargets(value: js.Array[SchemaDatafeedTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: SchemaDatafeedTarget*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
