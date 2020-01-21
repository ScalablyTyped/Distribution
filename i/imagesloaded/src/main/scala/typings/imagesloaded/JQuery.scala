package typings.imagesloaded

import typings.imagesloaded.ImagesLoaded_.ImagesLoaded
import typings.imagesloaded.ImagesLoaded_.ImagesLoadedCallback
import typings.imagesloaded.ImagesLoaded_.ImagesLoadedOptions
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def imagesLoaded(): JQueryDeferred[ImagesLoaded] = js.native
  def imagesLoaded(callback: ImagesLoadedCallback): JQueryDeferred[ImagesLoaded] = js.native
  def imagesLoaded(options: ImagesLoadedOptions): JQueryDeferred[ImagesLoaded] = js.native
  def imagesLoaded(options: ImagesLoadedOptions, callback: ImagesLoadedCallback): JQueryDeferred[ImagesLoaded] = js.native
}

