package typings.jenkins.anon

import typings.jenkins.jenkinsStrings.html
import typings.jenkins.jenkinsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[text | html] = js.undefined
}

object Delay {
  @scala.inline
  def apply(delay: js.UndefOr[Double] = js.undefined, `type`: text | html = null): Delay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
}

