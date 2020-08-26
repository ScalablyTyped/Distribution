package typings.guacamoleClient.clientMod.Client

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedState extends js.Object {
  var currentState: State = js.native
  var currentTimestamp: Double = js.native
  var layers: NumberDictionary[ExportLayer] = js.native
}

object ExportedState {
  @scala.inline
  def apply(currentState: State, currentTimestamp: Double, layers: NumberDictionary[ExportLayer]): ExportedState = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], currentTimestamp = currentTimestamp.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportedState]
  }
  @scala.inline
  implicit class ExportedStateOps[Self <: ExportedState] (val x: Self) extends AnyVal {
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
    def setCurrentState(value: State): Self = this.set("currentState", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTimestamp(value: Double): Self = this.set("currentTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayers(value: NumberDictionary[ExportLayer]): Self = this.set("layers", value.asInstanceOf[js.Any])
  }
  
}

