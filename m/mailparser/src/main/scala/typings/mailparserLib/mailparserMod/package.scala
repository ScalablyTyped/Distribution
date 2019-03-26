package typings
package mailparserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mailparserMod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - AddressObject
    - stdLib.Date
    - StructuredHeader
  */
  type HeaderValue = _HeaderValue | js.Array[java.lang.String] | java.lang.String | stdLib.Date
  type Headers = stdLib.Map[java.lang.String, HeaderValue]
  type Source = nodeLib.Buffer | nodeLib.streamMod.Stream | java.lang.String
}
