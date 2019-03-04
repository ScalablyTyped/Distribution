package typings
package loaderDashRunnerLib.loaderDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  var data: js.Any
  var normal: scala.Null | (js.Function1[/* request */ java.lang.String, java.lang.String])
  var normalExecuted: scala.Boolean
  var options: js.Any
  var path: java.lang.String
  var pitch: scala.Null | (js.Function1[/* request */ java.lang.String, java.lang.String])
  var pitchExecuted: scala.Boolean
  var query: java.lang.String
  var raw: java.lang.String
  var request: java.lang.String
}

object Loader {
  @scala.inline
  def apply(
    data: js.Any,
    normalExecuted: scala.Boolean,
    options: js.Any,
    path: java.lang.String,
    pitchExecuted: scala.Boolean,
    query: java.lang.String,
    raw: java.lang.String,
    request: java.lang.String,
    normal: js.Function1[/* request */ java.lang.String, java.lang.String] = null,
    pitch: js.Function1[/* request */ java.lang.String, java.lang.String] = null
  ): Loader = {
    val __obj = js.Dynamic.literal(data = data, normalExecuted = normalExecuted, options = options, path = path, pitchExecuted = pitchExecuted, query = query, raw = raw, request = request)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (pitch != null) __obj.updateDynamic("pitch")(pitch)
    __obj.asInstanceOf[Loader]
  }
}

