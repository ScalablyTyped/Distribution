package typings.loaderDashRunner.loaderDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  var data: js.Any
  var normal: Null | (js.Function1[/* request */ String, String])
  var normalExecuted: Boolean
  var options: js.Any
  var path: String
  var pitch: Null | (js.Function1[/* request */ String, String])
  var pitchExecuted: Boolean
  var query: String
  var raw: String
  var request: String
}

object Loader {
  @scala.inline
  def apply(
    data: js.Any,
    normalExecuted: Boolean,
    options: js.Any,
    path: String,
    pitchExecuted: Boolean,
    query: String,
    raw: String,
    request: String,
    normal: /* request */ String => String = null,
    pitch: /* request */ String => String = null
  ): Loader = {
    val __obj = js.Dynamic.literal(data = data, normalExecuted = normalExecuted, options = options, path = path, pitchExecuted = pitchExecuted, query = query, raw = raw, request = request)
    if (normal != null) __obj.updateDynamic("normal")(js.Any.fromFunction1(normal))
    if (pitch != null) __obj.updateDynamic("pitch")(js.Any.fromFunction1(pitch))
    __obj.asInstanceOf[Loader]
  }
}

