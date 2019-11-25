package typings.jwplayer.jwplayer

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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaylistItemParam]
  }
}

