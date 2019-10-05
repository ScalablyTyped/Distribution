package typings.imagesloaded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImagesLoaded {
  import typings.std.Element
  import typings.std.NodeList

  type ElementSelector = Element | NodeList | js.Array[Element] | String
  type ImagesLoadedCallback = js.Function1[/* instance */ js.UndefOr[typings.imagesloaded.ImagesLoaded.ImagesLoaded], Unit]
  type ImagesLoadedListener = js.Function2[
    /* instance */ typings.imagesloaded.ImagesLoaded.ImagesLoaded, 
    /* image */ js.UndefOr[LoadingImage], 
    Unit
  ]
}
