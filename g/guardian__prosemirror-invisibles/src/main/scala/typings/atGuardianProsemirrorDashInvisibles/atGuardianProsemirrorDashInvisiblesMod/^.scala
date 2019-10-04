package typings.atGuardianProsemirrorDashInvisibles.atGuardianProsemirrorDashInvisiblesMod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Node
import typings.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import typings.prosemirrorDashView.prosemirrorDashViewMod.Decoration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@guardian/prosemirror-invisibles", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def character(`type`: String): js.Function1[/* predicate */ js.Function1[/* char */ String, Boolean], Builder] = js.native
  def createDeco(pos: Double, `type`: String): Decoration[StringDictionary[_]] = js.native
  def default(builders: js.Array[Builder]): Plugin[_, _] = js.native
  def hardBreak(): Builder = js.native
  def hardBreak(predicate: js.Function1[/* node */ Node[_], Boolean]): Builder = js.native
  def node(`type`: String, toPosition: js.Function2[/* node */ Node[_], /* pos */ Double, Double]): js.Function1[/* predicate */ js.Function1[/* node */ Node[_], Boolean], Builder] = js.native
  def paragraph(): Builder = js.native
  def paragraph(predicate: js.Function1[/* node */ Node[_], Boolean]): Builder = js.native
  def space(): Builder = js.native
  def space(predicate: js.Function1[/* char */ String, Boolean]): Builder = js.native
  def textBetween(from: Double, to: Double, doc: Node[_]): js.Array[TextBetweenPosition] = js.native
}

