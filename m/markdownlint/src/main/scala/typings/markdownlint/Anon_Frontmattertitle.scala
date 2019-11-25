package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Frontmattertitle extends js.Object {
  var front_matter_title: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
}

object Anon_Frontmattertitle {
  @scala.inline
  def apply(front_matter_title: String = null, level: Int | Double = null): Anon_Frontmattertitle = {
    val __obj = js.Dynamic.literal()
    if (front_matter_title != null) __obj.updateDynamic("front_matter_title")(front_matter_title.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Frontmattertitle]
  }
}

