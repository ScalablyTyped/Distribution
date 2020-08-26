package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApkListing extends js.Object {
  /**
    * The language code, in BCP 47 format (eg &quot;en-US&quot;).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Describe what&#39;s new in your APK.
    */
  var recentChanges: js.UndefOr[String] = js.native
}

object SchemaApkListing {
  @scala.inline
  def apply(): SchemaApkListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkListing]
  }
  @scala.inline
  implicit class SchemaApkListingOps[Self <: SchemaApkListing] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setRecentChanges(value: String): Self = this.set("recentChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecentChanges: Self = this.set("recentChanges", js.undefined)
  }
  
}

