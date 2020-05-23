package typings.imagesloaded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImagesLoaded {
  type ElementSelector = typings.std.Element | typings.std.NodeList | js.Array[typings.std.Element] | java.lang.String
  type ImagesLoadedCallback = js.Function1[
    /* instance */ js.UndefOr[typings.imagesloaded.ImagesLoaded.ImagesLoaded], 
    scala.Unit
  ]
  type ImagesLoadedListener = js.Function2[
    /* instance */ typings.imagesloaded.ImagesLoaded.ImagesLoaded, 
    /* image */ js.UndefOr[typings.imagesloaded.ImagesLoaded.LoadingImage], 
    scala.Unit
  ]
}
