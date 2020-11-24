package typings.guardianProsemirrorInvisibles.mod

import typings.prosemirrorModel.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@guardian/prosemirror-invisibles", "node")
@js.native
object node extends js.Object {
  
  def apply(`type`: String, toPosition: js.Function2[/* node */ Node[_], /* pos */ Double, Double]): js.Function1[/* predicate */ js.Function1[/* node */ Node[_], Boolean], Builder] = js.native
}
