package typings.gtmetrix.mod

import typings.gtmetrix.anon.ReadonlyBrowserFeatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowsersApi extends js.Object {
  def get(browserId: Double): js.Promise[ReadonlyBrowserFeatures] = js.native
  /**
    * Get details about a test browser
    */
  def get(
    browserId: Double,
    callback: js.Function2[/* error */ MetricsError, /* data */ ReadonlyBrowserFeatures, Unit]
  ): Unit = js.native
  def list(): js.Promise[js.Array[BrowserFeatures]] = js.native
  /**
    * Get a list of available test browsers.
    */
  def list(callback: js.Function2[/* error */ MetricsError, /* data */ js.Array[BrowserFeatures], Unit]): Unit = js.native
}

