package typings
package atMaterialDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dom", JSImport.Namespace)
@js.native
object atMaterialDomMod extends js.Object {
  @JSName("ponyfill")
  @js.native
  object ponyfillNs extends js.Object {
    def closest(element: stdLib.Element, selector: java.lang.String): stdLib.Element = js.native
    def matches(element: stdLib.Element, selector: java.lang.String): scala.Boolean = js.native
  }
  
}

