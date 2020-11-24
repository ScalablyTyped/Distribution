package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Datafeed configuration data.
  */
@js.native
trait SchemaDatafeed extends js.Object {
  
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
  implicit class SchemaDatafeedOps[Self <: SchemaDatafeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeLanguage(value: String): Self = this.set("attributeLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeLanguage: Self = this.set("attributeLanguage", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setFetchSchedule(value: SchemaDatafeedFetchSchedule): Self = this.set("fetchSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchSchedule: Self = this.set("fetchSchedule", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setFormat(value: SchemaDatafeedFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIntendedDestinationsVarargs(value: String*): Self = this.set("intendedDestinations", js.Array(value :_*))
    
    @scala.inline
    def setIntendedDestinations(value: js.Array[String]): Self = this.set("intendedDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntendedDestinations: Self = this.set("intendedDestinations", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTargetCountry(value: String): Self = this.set("targetCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCountry: Self = this.set("targetCountry", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: SchemaDatafeedTarget*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: js.Array[SchemaDatafeedTarget]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
}
