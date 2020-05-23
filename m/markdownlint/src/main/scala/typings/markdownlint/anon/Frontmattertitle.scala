package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frontmattertitle extends js.Object {
  var front_matter_title: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
}

object Frontmattertitle {
  @scala.inline
  def apply(front_matter_title: String = null, level: js.UndefOr[Double] = js.undefined): Frontmattertitle = {
    val __obj = js.Dynamic.literal()
    if (front_matter_title != null) __obj.updateDynamic("front_matter_title")(front_matter_title.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frontmattertitle]
  }
}

