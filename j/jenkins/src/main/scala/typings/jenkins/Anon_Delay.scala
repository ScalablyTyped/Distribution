package typings.jenkins

import typings.jenkins.jenkinsStrings.html
import typings.jenkins.jenkinsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[text | html] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(delay: Int | Double = null, `type`: text | html = null): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delay]
  }
}

