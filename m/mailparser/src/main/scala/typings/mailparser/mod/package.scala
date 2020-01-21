package typings.mailparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HeaderLines = js.Array[typings.mailparser.AnonKey]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - typings.mailparser.mod.AddressObject
    - typings.std.Date
    - typings.mailparser.mod.StructuredHeader
  */
  type HeaderValue = typings.mailparser.mod._HeaderValue | js.Array[java.lang.String] | java.lang.String | typings.std.Date
  type Headers = typings.std.Map[java.lang.String, typings.mailparser.mod.HeaderValue]
  type Source = typings.node.Buffer | typings.node.streamMod.Stream | java.lang.String
}
