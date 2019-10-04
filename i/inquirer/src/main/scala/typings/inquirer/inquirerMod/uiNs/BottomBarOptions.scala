package typings.inquirer.inquirerMod.uiNs

import typings.inquirer.inquirerMod.StreamOptions
import typings.node.processMod.Global.NodeJSNs.ReadStream
import typings.node.processMod.Global.NodeJSNs.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the bottom-bar UI.
  */
trait BottomBarOptions extends StreamOptions {
  /**
    * The initial text to display.
    */
  var bottomBar: js.UndefOr[String] = js.undefined
}

object BottomBarOptions {
  @scala.inline
  def apply(bottomBar: String = null, input: ReadStream = null, output: WriteStream = null): BottomBarOptions = {
    val __obj = js.Dynamic.literal()
    if (bottomBar != null) __obj.updateDynamic("bottomBar")(bottomBar)
    if (input != null) __obj.updateDynamic("input")(input)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[BottomBarOptions]
  }
}

