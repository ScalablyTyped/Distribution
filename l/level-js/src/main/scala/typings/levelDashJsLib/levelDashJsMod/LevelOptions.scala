package typings
package levelDashJsLib.levelDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelOptions extends js.Object {
  val prefix: js.UndefOr[java.lang.String] = js.undefined
  val version: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object LevelOptions {
  @scala.inline
  def apply(prefix: java.lang.String = null, version: java.lang.String | scala.Double = null): LevelOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelOptions]
  }
}

