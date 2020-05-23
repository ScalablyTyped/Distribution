package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.aircraft
import typings.hafasClient.hafasClientStrings.bicycle
import typings.hafasClient.hafasClientStrings.bus
import typings.hafasClient.hafasClientStrings.car
import typings.hafasClient.hafasClientStrings.gondola
import typings.hafasClient.hafasClientStrings.route
import typings.hafasClient.hafasClientStrings.taxi
import typings.hafasClient.hafasClientStrings.train
import typings.hafasClient.hafasClientStrings.walking
import typings.hafasClient.hafasClientStrings.watercraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var id: String
  var line: String
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking
  var stops: js.Array[String]
  var `type`: route
}

object Route {
  @scala.inline
  def apply(
    id: String,
    line: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    stops: js.Array[String],
    `type`: route
  ): Route = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

