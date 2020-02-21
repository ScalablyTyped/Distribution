package typings.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ typings.std.Error, /* res */ T, scala.Unit]
  // Some typealiases for better readability and some placeholders
  type MimeNQuad = typings.jsonld.jsonldStrings.`applicationSlashn-quads`
  type RdfDataSet = js.Object
}
