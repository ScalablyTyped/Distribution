package typings.atGuardianProsemirrorDashInvisibles.atGuardianProsemirrorDashInvisiblesMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@guardian/prosemirror-invisibles", "node")
@js.native
object node extends js.Object {
  def apply(`type`: String, toPosition: js.Function2[/* node */ Node[_], /* pos */ Double, Double]): js.Function1[/* predicate */ js.Function1[/* node */ Node[_], Boolean], Builder] = js.native
}

