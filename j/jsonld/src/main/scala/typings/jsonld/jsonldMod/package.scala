package typings.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonldMod {
  import typings.jsonld.jsonldDashSpecMod.JsonLd
  import typings.jsonld.jsonldStrings.`applicationSlashn-quads`
  import typings.std.Error

  type Callback[T] = js.Function2[/* err */ Error, /* res */ T, Unit]
  type DocCallback = Callback[JsonLd]
  // Some typealiases for better readability and some placeholders
  type MimeNQuad = `applicationSlashn-quads`
  type RdfDataSet = js.Object
  type RdfOrString = RdfDataSet | String
}
