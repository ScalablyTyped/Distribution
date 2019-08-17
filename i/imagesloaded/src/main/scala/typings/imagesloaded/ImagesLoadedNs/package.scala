package typings.imagesloaded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImagesLoadedNs {
  import typings.std.Element
  import typings.std.NodeList

  type ElementSelector = Element | NodeList | js.Array[Element] | String
  type ImagesLoadedCallback = js.Function1[/* instance */ js.UndefOr[ImagesLoaded], Unit]
  type ImagesLoadedListener = js.Function2[/* instance */ ImagesLoaded, /* image */ js.UndefOr[LoadingImage], Unit]
}
