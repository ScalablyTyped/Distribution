package typings
package hummusDashRecipeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hummusDashRecipeMod {
  type EndPDFCallback = EndPDFCallback1 | EndPDFCallback2
  type EndPDFCallback1 = js.Function0[js.Any]
  type EndPDFCallback2 = js.Function1[/* buffer */ nodeLib.Buffer, js.Any]
}
