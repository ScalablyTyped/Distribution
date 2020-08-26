package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of targeted and excluded URLs (e.g., google.com). For
  * Private Auction and AdX Preferred Deals, URLs are either included or
  * excluded. For Programmatic Guaranteed and Preferred Deals, this doesn&#39;t
  * apply.
  */
@js.native
trait SchemaUrlTargeting extends js.Object {
  /**
    * A list of URLs to be excluded.
    */
  var excludedUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of URLs to be included.
    */
  var targetedUrls: js.UndefOr[js.Array[String]] = js.native
}

object SchemaUrlTargeting {
  @scala.inline
  def apply(): SchemaUrlTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlTargeting]
  }
  @scala.inline
  implicit class SchemaUrlTargetingOps[Self <: SchemaUrlTargeting] (val x: Self) extends AnyVal {
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
    def setExcludedUrlsVarargs(value: String*): Self = this.set("excludedUrls", js.Array(value :_*))
    @scala.inline
    def setExcludedUrls(value: js.Array[String]): Self = this.set("excludedUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedUrls: Self = this.set("excludedUrls", js.undefined)
    @scala.inline
    def setTargetedUrlsVarargs(value: String*): Self = this.set("targetedUrls", js.Array(value :_*))
    @scala.inline
    def setTargetedUrls(value: js.Array[String]): Self = this.set("targetedUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetedUrls: Self = this.set("targetedUrls", js.undefined)
  }
  
}

