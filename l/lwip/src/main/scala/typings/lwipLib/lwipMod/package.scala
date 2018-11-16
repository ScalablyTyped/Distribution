package typings
package lwipLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lwipMod {
  type BufferCallback = js.Function2[/* err */ js.Any, /* buffer */ nodeLib.Buffer, scala.Unit]
  type Color = java.lang.String | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | ColorObject
  type ImageCallback = js.Function2[/* err */ js.Any, /* image */ Image, scala.Unit]
}
