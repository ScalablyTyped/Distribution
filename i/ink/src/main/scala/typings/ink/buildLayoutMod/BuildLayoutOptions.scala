package typings.ink.buildLayoutMod

import typings.yogaLayout.mod.YogaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildLayoutOptions extends js.Object {
  var config: YogaConfig = js.native
  var skipStaticElements: Boolean = js.native
  var terminalWidth: Double = js.native
}

object BuildLayoutOptions {
  @scala.inline
  def apply(config: YogaConfig, skipStaticElements: Boolean, terminalWidth: Double): BuildLayoutOptions = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], skipStaticElements = skipStaticElements.asInstanceOf[js.Any], terminalWidth = terminalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildLayoutOptions]
  }
  @scala.inline
  implicit class BuildLayoutOptionsOps[Self <: BuildLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: YogaConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipStaticElements(value: Boolean): Self = this.set("skipStaticElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerminalWidth(value: Double): Self = this.set("terminalWidth", value.asInstanceOf[js.Any])
  }
  
}

