package typings
package mailparserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mailparserMod {
  type HeaderValue = java.lang.String | js.Array[java.lang.String] | AddressObject | stdLib.Date | StructuredHeader
  type Headers = stdLib.Map[java.lang.String, HeaderValue]
  type Source = nodeLib.Buffer | nodeLib.streamMod.Stream | java.lang.String
}
