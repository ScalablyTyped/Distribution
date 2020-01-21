package typings.lwip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BufferCallback = js.Function2[/* err */ js.Any, /* buffer */ typings.node.Buffer, scala.Unit]
  type Color = java.lang.String | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | typings.lwip.mod.ColorObject
  type ImageCallback = js.Function2[/* err */ js.Any, /* image */ typings.lwip.mod.Image, scala.Unit]
}
