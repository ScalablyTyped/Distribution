package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.aircraft
import typings.hafasClient.hafasClientStrings.bicycle
import typings.hafasClient.hafasClientStrings.bus
import typings.hafasClient.hafasClientStrings.car
import typings.hafasClient.hafasClientStrings.gondola
import typings.hafasClient.hafasClientStrings.taxi
import typings.hafasClient.hafasClientStrings.train
import typings.hafasClient.hafasClientStrings.walking
import typings.hafasClient.hafasClientStrings.watercraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ProductType relates to how a means of transport "works" in local context.
  * Example: Even though S-Bahn and U-Bahn in Berlin are both trains, they have different operators, service patterns,
  * stations and look different. Therefore, they are two distinct products subway and suburban.
  */
trait ProductType extends js.Object {
  var id: String
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking
  var name: String
  var short: String
}

object ProductType {
  @scala.inline
  def apply(
    id: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    name: String,
    short: String
  ): ProductType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductType]
  }
}

