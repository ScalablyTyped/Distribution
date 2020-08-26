package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleapis.anon.MaximumQps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration data for an Ad Exchange buyer account.
  */
@js.native
trait SchemaAccount extends js.Object {
  /**
    * Your bidder locations that have distinct URLs.
    */
  var bidderLocation: js.UndefOr[js.Array[MaximumQps]] = js.native
  /**
    * The nid parameter value used in cookie match requests. Please contact
    * your technical account manager if you need to change this.
    */
  var cookieMatchingNid: js.UndefOr[String] = js.native
  /**
    * The base URL used in cookie match requests.
    */
  var cookieMatchingUrl: js.UndefOr[String] = js.native
  /**
    * Account id.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The maximum number of active creatives that an account can have, where a
    * creative is active if it was inserted or bid with in the last 30 days.
    * Please contact your technical account manager if you need to change this.
    */
  var maximumActiveCreatives: js.UndefOr[Double] = js.native
  /**
    * The sum of all bidderLocation.maximumQps values cannot exceed this.
    * Please contact your technical account manager if you need to change this.
    */
  var maximumTotalQps: js.UndefOr[Double] = js.native
  /**
    * The number of creatives that this account inserted or bid with in the
    * last 30 days.
    */
  var numberActiveCreatives: js.UndefOr[Double] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  @scala.inline
  implicit class SchemaAccountOps[Self <: SchemaAccount] (val x: Self) extends AnyVal {
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
    def setBidderLocationVarargs(value: MaximumQps*): Self = this.set("bidderLocation", js.Array(value :_*))
    @scala.inline
    def setBidderLocation(value: js.Array[MaximumQps]): Self = this.set("bidderLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidderLocation: Self = this.set("bidderLocation", js.undefined)
    @scala.inline
    def setCookieMatchingNid(value: String): Self = this.set("cookieMatchingNid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieMatchingNid: Self = this.set("cookieMatchingNid", js.undefined)
    @scala.inline
    def setCookieMatchingUrl(value: String): Self = this.set("cookieMatchingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieMatchingUrl: Self = this.set("cookieMatchingUrl", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaximumActiveCreatives(value: Double): Self = this.set("maximumActiveCreatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumActiveCreatives: Self = this.set("maximumActiveCreatives", js.undefined)
    @scala.inline
    def setMaximumTotalQps(value: Double): Self = this.set("maximumTotalQps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumTotalQps: Self = this.set("maximumTotalQps", js.undefined)
    @scala.inline
    def setNumberActiveCreatives(value: Double): Self = this.set("numberActiveCreatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberActiveCreatives: Self = this.set("numberActiveCreatives", js.undefined)
  }
  
}

