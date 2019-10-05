package typings.imagesloaded

import typings.imagesloaded.ImagesLoaded.ImagesLoadedCallback
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def imagesLoaded(): JQueryDeferred[typings.imagesloaded.ImagesLoaded.ImagesLoaded] = js.native
  def imagesLoaded(callback: ImagesLoadedCallback): JQueryDeferred[typings.imagesloaded.ImagesLoaded.ImagesLoaded] = js.native
}

