package typings.latestDashVersion.latestDashVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		A semver range or [dist-tag](https://docs.npmjs.com/cli/dist-tag).
  		*/
  val version: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(version: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

