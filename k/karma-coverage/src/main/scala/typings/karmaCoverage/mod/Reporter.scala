package typings.karmaCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var subdir: js.UndefOr[String | (js.Function1[/* browser */ String, String])] = js.undefined
  var `type`: ReporterType
}

object Reporter {
  @scala.inline
  def apply(
    `type`: ReporterType,
    dir: String = null,
    file: String = null,
    subdir: String | (js.Function1[/* browser */ String, String]) = null
  ): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (subdir != null) __obj.updateDynamic("subdir")(subdir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reporter]
  }
}

