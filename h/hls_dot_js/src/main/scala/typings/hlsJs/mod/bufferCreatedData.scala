package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bufferCreatedData extends js.Object {
  var tracks: Tracks
}

object bufferCreatedData {
  @scala.inline
  def apply(tracks: Tracks): bufferCreatedData = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[bufferCreatedData]
  }
}

