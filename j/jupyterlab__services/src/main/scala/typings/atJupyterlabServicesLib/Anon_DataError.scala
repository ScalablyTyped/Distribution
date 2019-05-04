package typings
package atJupyterlabServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataError extends js.Object {
  var data: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  var found: scala.Boolean
  var metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  var status: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.ok | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.error
}

object Anon_DataError {
  @scala.inline
  def apply(
    data: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    found: scala.Boolean,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    status: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.ok | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.error
  ): Anon_DataError = {
    val __obj = js.Dynamic.literal(data = data, found = found, metadata = metadata, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataError]
  }
}

