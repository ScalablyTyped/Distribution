package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.googima
import typings.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdTimeParam extends js.Object {
  var client: vast | googima
  var creativetype: String
  var duration: Double
  var position: Double
  var sequence: Double
  var tag: String
}

object AdTimeParam {
  @scala.inline
  def apply(
    client: vast | googima,
    creativetype: String,
    duration: Double,
    position: Double,
    sequence: Double,
    tag: String
  ): AdTimeParam = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], creativetype = creativetype.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdTimeParam]
  }
}

