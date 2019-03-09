package typings
package mailparserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mailparserMod {
  type HeaderValue = _HeaderValue | js.Array[java.lang.String] | java.lang.String | stdLib.Date
  type Headers = nodeLib.Map[java.lang.String, HeaderValue]
  type Source = nodeLib.Buffer | nodeLib.streamMod.Stream | java.lang.String
}
