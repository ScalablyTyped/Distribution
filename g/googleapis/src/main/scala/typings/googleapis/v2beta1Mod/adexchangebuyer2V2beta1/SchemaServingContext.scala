package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The serving context for this restriction.
  */
@js.native
trait SchemaServingContext extends js.Object {
  /**
    * Matches all contexts.
    */
  var all: js.UndefOr[String] = js.native
  /**
    * Matches impressions for a particular app type.
    */
  var appType: js.UndefOr[SchemaAppContext] = js.native
  /**
    * Matches impressions for a particular auction type.
    */
  var auctionType: js.UndefOr[SchemaAuctionContext] = js.native
  /**
    * Matches impressions coming from users *or* publishers in a specific
    * location.
    */
  var location: js.UndefOr[SchemaLocationContext] = js.native
  /**
    * Matches impressions coming from a particular platform.
    */
  var platform: js.UndefOr[SchemaPlatformContext] = js.native
  /**
    * Matches impressions for a particular security type.
    */
  var securityType: js.UndefOr[SchemaSecurityContext] = js.native
}

object SchemaServingContext {
  @scala.inline
  def apply(): SchemaServingContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingContext]
  }
  @scala.inline
  implicit class SchemaServingContextOps[Self <: SchemaServingContext] (val x: Self) extends AnyVal {
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
    def setAll(value: String): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setAppType(value: SchemaAppContext): Self = this.set("appType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppType: Self = this.set("appType", js.undefined)
    @scala.inline
    def setAuctionType(value: SchemaAuctionContext): Self = this.set("auctionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuctionType: Self = this.set("auctionType", js.undefined)
    @scala.inline
    def setLocation(value: SchemaLocationContext): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPlatform(value: SchemaPlatformContext): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setSecurityType(value: SchemaSecurityContext): Self = this.set("securityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityType: Self = this.set("securityType", js.undefined)
  }
  
}

