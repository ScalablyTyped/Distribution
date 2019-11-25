package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var height: Double
  var width: Double
  var x: `0`
   // x and y will always be 0 according to https://developer.jwplayer.com/jw-player/docs/javascript-api-reference/#jwplayergetsaferegion
  var y: `0`
}

object Region {
  @scala.inline
  def apply(height: Double, width: Double, x: `0`, y: `0`): Region = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Region]
  }
}

