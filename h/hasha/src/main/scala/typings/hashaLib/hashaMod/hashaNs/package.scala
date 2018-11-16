package typings
package hashaLib.hashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hashaNs {
  type HashaEncoding = ToStringEncoding | hashaLib.hashaLibStrings.buffer
  type HashaInput = java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
  type ToStringEncoding = js.UndefOr[
    hashaLib.hashaLibStrings.hex | hashaLib.hashaLibStrings.base64 | hashaLib.hashaLibStrings.latin1 | hashaLib.hashaLibStrings.binary
  ]
}
