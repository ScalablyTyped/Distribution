package typings
package jsonldLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonldMod {
  type Callback[T] = js.Function2[/* err */ stdLib.Error, /* res */ T, scala.Unit]
  type DocCallback = Callback[jsonldLib.jsonldDashSpecMod.JsonLd]
  // Some typealiases for better readability and some placeholders
  type MimeNQuad = jsonldLib.jsonldLibStrings.`application/n-quads`
  type RdfOrString = jsonldLib.RdfDataSet | java.lang.String
}
