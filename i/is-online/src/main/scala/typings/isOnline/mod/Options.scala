package typings.isOnline.mod

import typings.isOnline.isOnlineStrings.v4
import typings.isOnline.isOnlineStrings.v6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Milliseconds to wait for a server to respond.
  		@default 5000
  		*/
  val timeout: js.UndefOr[Double] = js.undefined
  /**
  		Internet Protocol version to use. This is an advanced option that is usually not necessary to be set, but it can prove useful to specifically assert IPv6 connectivity.
  		@default 'v4'
  		*/
  val version: js.UndefOr[v4 | v6] = js.undefined
}

object Options {
  @scala.inline
  def apply(timeout: Int | Double = null, version: v4 | v6 = null): Options = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

