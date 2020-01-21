package typings.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ typings.std.Error, /* res */ T, scala.Unit]
  type DocCallback = typings.jsonld.mod.Callback[typings.jsonld.jsonldSpecMod.JsonLd]
  // Some typealiases for better readability and some placeholders
  type MimeNQuad = typings.jsonld.jsonldStrings.`applicationSlashn-quads`
  type RdfDataSet = js.Object
  type RdfOrString = typings.jsonld.mod.RdfDataSet | java.lang.String
}
