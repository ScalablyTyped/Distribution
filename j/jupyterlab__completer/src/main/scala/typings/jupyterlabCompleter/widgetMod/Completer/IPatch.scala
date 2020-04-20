package typings.jupyterlabCompleter.widgetMod.Completer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object describing a completion option injection into text.
  */
trait IPatch extends js.Object {
  /**
    * The end of the range to be patched.
    */
  var end: Double
  /**
    * The start of the range to be patched.
    */
  var start: Double
  /**
    * The value to be patched in.
    */
  var value: String
}

object IPatch {
  @scala.inline
  def apply(end: Double, start: Double, value: String): IPatch = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPatch]
  }
}

