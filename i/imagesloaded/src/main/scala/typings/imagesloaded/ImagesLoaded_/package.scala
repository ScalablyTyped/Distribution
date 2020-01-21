package typings.imagesloaded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImagesLoaded_ {
  type ElementSelector = typings.std.Element | typings.std.NodeList | js.Array[typings.std.Element] | java.lang.String
  type ImagesLoadedCallback = js.Function1[
    /* instance */ js.UndefOr[typings.imagesloaded.ImagesLoaded_.ImagesLoaded], 
    scala.Unit
  ]
  type ImagesLoadedListener = js.Function2[
    /* instance */ typings.imagesloaded.ImagesLoaded_.ImagesLoaded, 
    /* image */ js.UndefOr[typings.imagesloaded.ImagesLoaded_.LoadingImage], 
    scala.Unit
  ]
}
