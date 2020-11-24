package typings.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAnalyticsSnapshot extends js.Object {
  
  /**
    * Top browsers, e.g. &quot;Chrome&quot;; sorted by (descending) click
    * counts. Only present if this data is available.
    */
  var browsers: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  
  /**
    * Top countries (expressed as country codes), e.g. &quot;US&quot; or
    * &quot;DE&quot;; sorted by (descending) click counts. Only present if this
    * data is available.
    */
  var countries: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  
  /**
    * Number of clicks on all goo.gl short URLs pointing to this long URL.
    */
  var longUrlClicks: js.UndefOr[String] = js.native
  
  /**
    * Top platforms or OSes, e.g. &quot;Windows&quot;; sorted by (descending)
    * click counts. Only present if this data is available.
    */
  var platforms: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  
  /**
    * Top referring hosts, e.g. &quot;www.google.com&quot;; sorted by
    * (descending) click counts. Only present if this data is available.
    */
  var referrers: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  
  /**
    * Number of clicks on this short URL.
    */
  var shortUrlClicks: js.UndefOr[String] = js.native
}
object SchemaAnalyticsSnapshot {
  
  @scala.inline
  def apply(): SchemaAnalyticsSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsSnapshot]
  }
  
  @scala.inline
  implicit class SchemaAnalyticsSnapshotOps[Self <: SchemaAnalyticsSnapshot] (val x: Self) extends AnyVal {
    
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
    def setBrowsersVarargs(value: SchemaStringCount*): Self = this.set("browsers", js.Array(value :_*))
    
    @scala.inline
    def setBrowsers(value: js.Array[SchemaStringCount]): Self = this.set("browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    
    @scala.inline
    def setCountriesVarargs(value: SchemaStringCount*): Self = this.set("countries", js.Array(value :_*))
    
    @scala.inline
    def setCountries(value: js.Array[SchemaStringCount]): Self = this.set("countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    
    @scala.inline
    def setLongUrlClicks(value: String): Self = this.set("longUrlClicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongUrlClicks: Self = this.set("longUrlClicks", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: SchemaStringCount*): Self = this.set("platforms", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: js.Array[SchemaStringCount]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
    
    @scala.inline
    def setReferrersVarargs(value: SchemaStringCount*): Self = this.set("referrers", js.Array(value :_*))
    
    @scala.inline
    def setReferrers(value: js.Array[SchemaStringCount]): Self = this.set("referrers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrers: Self = this.set("referrers", js.undefined)
    
    @scala.inline
    def setShortUrlClicks(value: String): Self = this.set("shortUrlClicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortUrlClicks: Self = this.set("shortUrlClicks", js.undefined)
  }
}
