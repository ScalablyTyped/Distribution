package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonldLib {
  type Callback[T] = js.Function2[/* err */ stdLib.Error, /* res */ T, scala.Unit]
  type DocCallback = Callback[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JsonLd */ js.Any
  ]
  // Some typealiases for better readability and some placeholders
  type MimeNQuad = jsonldLib.jsonldLibStrings.`application/n-quads`
  type RdfDataSet = js.Object
  type RdfOrString = RdfDataSet | java.lang.String
}
