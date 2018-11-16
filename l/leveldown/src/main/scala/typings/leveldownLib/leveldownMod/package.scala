package typings
package leveldownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object leveldownMod {
  type Bytes = java.lang.String | nodeLib.Buffer
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* size */ scala.Double, scala.Unit]
}
