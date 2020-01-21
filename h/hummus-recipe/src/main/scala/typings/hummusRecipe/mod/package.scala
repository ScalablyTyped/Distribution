package typings.hummusRecipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EndPDFCallback = typings.hummusRecipe.mod.EndPDFCallback1 | typings.hummusRecipe.mod.EndPDFCallback2
  type EndPDFCallback1 = js.Function0[js.Any]
  type EndPDFCallback2 = js.Function1[/* buffer */ typings.node.Buffer, js.Any]
}
