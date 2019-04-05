package typings
package isDashOnlineLib.isDashOnlineMod.isOnlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Milliseconds to wait for a server to respond.
  		@default 5000
  		*/
  val timeout: js.UndefOr[scala.Double] = js.undefined
  /**
  		Internet Protocol version to use. This is an advanced option that is usually not necessary to be set, but it can prove useful to specifically assert IPv6 connectivity.
  		@default 'v4'
  		*/
  val version: js.UndefOr[
    isDashOnlineLib.isDashOnlineLibStrings.v4 | isDashOnlineLib.isDashOnlineLibStrings.v6
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    timeout: scala.Int | scala.Double = null,
    version: isDashOnlineLib.isDashOnlineLibStrings.v4 | isDashOnlineLib.isDashOnlineLibStrings.v6 = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

