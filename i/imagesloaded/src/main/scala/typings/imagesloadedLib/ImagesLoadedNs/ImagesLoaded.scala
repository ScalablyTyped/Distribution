package typings
package imagesloadedLib.ImagesLoadedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesLoaded
  extends org.scalablytyped.runtime.Instantiable2[/* elem */ ElementSelector, /* callback */ ImagesLoadedCallback, ImagesLoaded] {
  var images: js.Array[LoadingImage] = js.native
  def off(event: java.lang.String, listener: ImagesLoadedListener): scala.Unit = js.native
  // event listeners
  def on(event: java.lang.String, listener: ImagesLoadedListener): scala.Unit = js.native
  def once(event: java.lang.String, listener: ImagesLoadedListener): scala.Unit = js.native
}

