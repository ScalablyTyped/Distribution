package typings.mapboxMapboxSdk.matrixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatrixResponse extends js.Object {
  var code: String = js.native
  var destinations: js.Array[Destination] = js.native
  var distances: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var durations: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var sources: js.Array[Destination] = js.native
}

object MatrixResponse {
  @scala.inline
  def apply(code: String, destinations: js.Array[Destination], sources: js.Array[Destination]): MatrixResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixResponse]
  }
  @scala.inline
  implicit class MatrixResponseOps[Self <: MatrixResponse] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationsVarargs(value: Destination*): Self = this.set("destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: js.Array[Destination]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: Destination*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[Destination]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistancesVarargs(value: js.Array[Double]*): Self = this.set("distances", js.Array(value :_*))
    @scala.inline
    def setDistances(value: js.Array[js.Array[Double]]): Self = this.set("distances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistances: Self = this.set("distances", js.undefined)
    @scala.inline
    def setDurationsVarargs(value: js.Array[Double]*): Self = this.set("durations", js.Array(value :_*))
    @scala.inline
    def setDurations(value: js.Array[js.Array[Double]]): Self = this.set("durations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurations: Self = this.set("durations", js.undefined)
  }
  
}

