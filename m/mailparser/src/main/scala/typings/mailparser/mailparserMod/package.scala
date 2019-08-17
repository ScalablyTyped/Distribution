package typings.mailparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mailparserMod {
  import typings.node.Buffer
  import typings.node.streamMod.Stream
  import typings.std.Date
  import typings.std.Map

  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - typings.mailparser.mailparserMod.AddressObject
    - typings.std.Date
    - typings.mailparser.mailparserMod.StructuredHeader
  */
  type HeaderValue = _HeaderValue | js.Array[String] | String | Date
  type Headers = Map[String, HeaderValue]
  type Source = Buffer | Stream | String
}
