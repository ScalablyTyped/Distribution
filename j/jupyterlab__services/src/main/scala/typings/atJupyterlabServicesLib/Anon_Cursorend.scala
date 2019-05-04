package typings
package atJupyterlabServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cursorend extends js.Object {
  var cursor_end: scala.Double
  var cursor_start: scala.Double
  var matches: js.Array[java.lang.String]
  var metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  var status: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.ok | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.error
}

object Anon_Cursorend {
  @scala.inline
  def apply(
    cursor_end: scala.Double,
    cursor_start: scala.Double,
    matches: js.Array[java.lang.String],
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    status: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.ok | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.error
  ): Anon_Cursorend = {
    val __obj = js.Dynamic.literal(cursor_end = cursor_end, cursor_start = cursor_start, matches = matches, metadata = metadata, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cursorend]
  }
}

