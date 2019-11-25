package typings.atJupyterlabCompleter.libWidgetMod.Completer

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A cursor span.
  */
trait ICursorSpan extends JSONObject {
  /**
    * The end position of the cursor.
    */
  var end: Double
  /**
    * The start position of the cursor.
    */
  var start: Double
}

object ICursorSpan {
  @scala.inline
  def apply(end: Double, start: Double): ICursorSpan = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICursorSpan]
  }
}

