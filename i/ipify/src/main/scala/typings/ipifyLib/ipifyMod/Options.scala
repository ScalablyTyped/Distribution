package typings
package ipifyLib.ipifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Custom API endpoint.
  		@default 'https://api.ipify.org'
  		*/
  val endpoint: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(endpoint: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    __obj.asInstanceOf[Options]
  }
}

