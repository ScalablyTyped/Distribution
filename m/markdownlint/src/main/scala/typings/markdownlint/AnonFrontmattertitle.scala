package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrontmattertitle extends js.Object {
  var front_matter_title: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
}

object AnonFrontmattertitle {
  @scala.inline
  def apply(front_matter_title: String = null, level: Int | Double = null): AnonFrontmattertitle = {
    val __obj = js.Dynamic.literal()
    if (front_matter_title != null) __obj.updateDynamic("front_matter_title")(front_matter_title.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrontmattertitle]
  }
}

