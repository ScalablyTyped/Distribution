package typings
package imagesloadedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImagesLoadedNs {
  type ElementSelector = stdLib.Element | stdLib.NodeList | js.Array[stdLib.Element] | java.lang.String
  type ImagesLoadedCallback = js.Function1[/* instance */ js.UndefOr[ImagesLoaded], scala.Unit]
  type ImagesLoadedListener = js.Function2[/* instance */ ImagesLoaded, /* image */ js.UndefOr[LoadingImage], scala.Unit]
}
