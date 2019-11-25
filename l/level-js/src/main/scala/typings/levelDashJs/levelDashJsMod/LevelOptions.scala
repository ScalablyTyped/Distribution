package typings.levelDashJs.levelDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelOptions extends js.Object {
  val prefix: js.UndefOr[String] = js.undefined
  val version: js.UndefOr[String | Double] = js.undefined
}

object LevelOptions {
  @scala.inline
  def apply(prefix: String = null, version: String | Double = null): LevelOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelOptions]
  }
}

