package typings.jwplayer.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemParam extends js.Object {
  var index: Double
  var item: js.Any
}

object PlaylistItemParam {
  @scala.inline
  def apply(index: Double, item: js.Any): PlaylistItemParam = {
    val __obj = js.Dynamic.literal(index = index, item = item)
  
    __obj.asInstanceOf[PlaylistItemParam]
  }
}

