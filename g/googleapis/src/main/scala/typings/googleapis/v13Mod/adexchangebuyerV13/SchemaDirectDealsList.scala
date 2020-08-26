package typings.googleapis.v13Mod.adexchangebuyerV13

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A direct deals feed lists Direct Deals the Ad Exchange buyer account has
  * access to. This includes direct deals set up for the buyer account as well
  * as its merged stream seats.
  */
@js.native
trait SchemaDirectDealsList extends js.Object {
  /**
    * A list of direct deals relevant for your account.
    */
  var directDeals: js.UndefOr[js.Array[SchemaDirectDeal]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDirectDealsList {
  @scala.inline
  def apply(): SchemaDirectDealsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectDealsList]
  }
  @scala.inline
  implicit class SchemaDirectDealsListOps[Self <: SchemaDirectDealsList] (val x: Self) extends AnyVal {
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
    def setDirectDealsVarargs(value: SchemaDirectDeal*): Self = this.set("directDeals", js.Array(value :_*))
    @scala.inline
    def setDirectDeals(value: js.Array[SchemaDirectDeal]): Self = this.set("directDeals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectDeals: Self = this.set("directDeals", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

