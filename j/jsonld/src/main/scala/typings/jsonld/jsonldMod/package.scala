package typings.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonldMod {
  import typings.jsonld.RdfDataSet
  import typings.jsonld.jsonldDashSpecMod.JsonLd
  import typings.jsonld.jsonldStrings.`application/n-quads`
  import typings.std.Error

  type Callback[T] = js.Function2[/* err */ Error, /* res */ T, Unit]
  type DocCallback = Callback[JsonLd]
  // Some typealiases for better readability and some placeholders
  type MimeNQuad = `application/n-quads`
  type RdfOrString = RdfDataSet | String
}
