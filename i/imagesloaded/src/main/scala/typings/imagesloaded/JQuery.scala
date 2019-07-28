package typings.imagesloaded

import typings.imagesloaded.ImagesLoadedNs.ImagesLoaded
import typings.imagesloaded.ImagesLoadedNs.ImagesLoadedCallback
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def imagesLoaded(): JQueryDeferred[ImagesLoaded] = js.native
  def imagesLoaded(callback: ImagesLoadedCallback): JQueryDeferred[ImagesLoaded] = js.native
}

