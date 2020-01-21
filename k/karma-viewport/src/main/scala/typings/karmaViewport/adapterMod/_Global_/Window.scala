package typings.karmaViewport.adapterMod._Global_

import typings.karmaViewport.viewportMod.Viewport
import typings.karmaViewport.viewportMod.ViewportConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var __viewport__ : ViewportConfiguration
  var viewport: Viewport
}

object Window {
  @scala.inline
  def apply(__viewport__ : ViewportConfiguration, viewport: Viewport): Window = {
    val __obj = js.Dynamic.literal(__viewport__ = __viewport__.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

