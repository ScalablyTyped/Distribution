package typings.imagesloaded

import typings.imagesloaded.ImagesLoaded.ImagesLoadedCallback
import typings.imagesloaded.ImagesLoaded.ImagesLoadedOptions
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def imagesLoaded(): JQueryDeferred[typings.imagesloaded.ImagesLoaded.ImagesLoaded] = js.native
  def imagesLoaded(callback: ImagesLoadedCallback): JQueryDeferred[typings.imagesloaded.ImagesLoaded.ImagesLoaded] = js.native
  def imagesLoaded(options: ImagesLoadedOptions): JQueryDeferred[typings.imagesloaded.ImagesLoaded.ImagesLoaded] = js.native
  def imagesLoaded(options: ImagesLoadedOptions, callback: ImagesLoadedCallback): JQueryDeferred[typings.imagesloaded.ImagesLoaded.ImagesLoaded] = js.native
}
