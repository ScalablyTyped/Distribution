package typings.mapboxMapboxSdk.matrixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixResponse extends js.Object {
  var code: String
  var destinations: js.Array[Destination]
  var distances: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var durations: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var sources: js.Array[Destination]
}

object MatrixResponse {
  @scala.inline
  def apply(
    code: String,
    destinations: js.Array[Destination],
    sources: js.Array[Destination],
    distances: js.Array[js.Array[Double]] = null,
    durations: js.Array[js.Array[Double]] = null
  ): MatrixResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    if (distances != null) __obj.updateDynamic("distances")(distances.asInstanceOf[js.Any])
    if (durations != null) __obj.updateDynamic("durations")(durations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixResponse]
  }
}

