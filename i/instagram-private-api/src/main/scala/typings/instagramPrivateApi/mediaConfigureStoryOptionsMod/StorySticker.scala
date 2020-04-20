package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorySticker extends js.Object {
  var height: Double
  var rotation: Double
  var width: Double
  var x: Double
  var y: Double
}

object StorySticker {
  @scala.inline
  def apply(height: Double, rotation: Double, width: Double, x: Double, y: Double): StorySticker = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorySticker]
  }
}

