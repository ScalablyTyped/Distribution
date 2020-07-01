package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.aircraft
import typings.hafasClient.hafasClientStrings.bicycle
import typings.hafasClient.hafasClientStrings.bus
import typings.hafasClient.hafasClientStrings.car
import typings.hafasClient.hafasClientStrings.gondola
import typings.hafasClient.hafasClientStrings.schedule
import typings.hafasClient.hafasClientStrings.taxi
import typings.hafasClient.hafasClientStrings.train
import typings.hafasClient.hafasClientStrings.walking
import typings.hafasClient.hafasClientStrings.watercraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * There are many ways to format schedules of public transport routes.
  * This one tries to balance the amount of data and consumability.
  * It is specifically geared towards urban public transport, with frequent trains and homogenous travels.
  */
trait Schedule extends js.Object {
  var id: String
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking
  var route: String
  var sequence: js.Array[ArrivalDeparture]
  /** array of Unix timestamps */
  var starts: js.Array[String]
  var `type`: schedule
}

object Schedule {
  @scala.inline
  def apply(
    id: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    route: String,
    sequence: js.Array[ArrivalDeparture],
    starts: js.Array[String],
    `type`: schedule
  ): Schedule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], starts = starts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
}

