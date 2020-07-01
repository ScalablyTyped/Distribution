package typings.gtmetrix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/fvdm/nodejs-gtmetrix#methods}
  */
trait GTmetrix extends js.Object {
  var account: AccountApi
  var browsers: BrowsersApi
  var locations: LocationsApi
  var test: TestApi
}

object GTmetrix {
  @scala.inline
  def apply(account: AccountApi, browsers: BrowsersApi, locations: LocationsApi, test: TestApi): GTmetrix = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], browsers = browsers.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[GTmetrix]
  }
}

