package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A profile is a specific customisation for each endpoint.
  * It parses data from the API differently, add additional information, or enable non-default methods.
  */
@js.native
trait Profile extends js.Object {
  var endpoint: String = js.native
  var locale: String = js.native
  var products: js.Array[ProductType] = js.native
  var radar: js.UndefOr[Boolean] = js.native
  var reachableFrom: js.UndefOr[Boolean] = js.native
  var refreshJourney: js.UndefOr[Boolean] = js.native
  var timezone: String = js.native
  var trip: js.UndefOr[Boolean] = js.native
}

object Profile {
  @scala.inline
  def apply(endpoint: String, locale: String, products: js.Array[ProductType], timezone: String): Profile = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductsVarargs(value: ProductType*): Self = this.set("products", js.Array(value :_*))
    @scala.inline
    def setProducts(value: js.Array[ProductType]): Self = this.set("products", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadar(value: Boolean): Self = this.set("radar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadar: Self = this.set("radar", js.undefined)
    @scala.inline
    def setReachableFrom(value: Boolean): Self = this.set("reachableFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReachableFrom: Self = this.set("reachableFrom", js.undefined)
    @scala.inline
    def setRefreshJourney(value: Boolean): Self = this.set("refreshJourney", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshJourney: Self = this.set("refreshJourney", js.undefined)
    @scala.inline
    def setTrip(value: Boolean): Self = this.set("trip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrip: Self = this.set("trip", js.undefined)
  }
  
}

