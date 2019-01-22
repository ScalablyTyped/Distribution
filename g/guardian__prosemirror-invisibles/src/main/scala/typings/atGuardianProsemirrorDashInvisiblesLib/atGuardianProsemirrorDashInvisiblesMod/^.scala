package typings
package atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@guardian/prosemirror-invisibles", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createDeco(pos: scala.Double, `type`: java.lang.String): prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration = js.native
  def default(
    builders: js.Array[
      atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod.Builder
    ]
  ): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_] = js.native
  def hardBreak(): atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod.Builder = js.native
  def hardBreak(
    predicate: js.Function1[/* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_], scala.Boolean]
  ): atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod.Builder = js.native
  def paragraph(): atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod.Builder = js.native
  def paragraph(
    predicate: js.Function1[/* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_], scala.Boolean]
  ): atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod.Builder = js.native
  def space(): atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod.Builder = js.native
  def space(predicate: js.Function1[/* char */ java.lang.String, scala.Boolean]): atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod.Builder = js.native
  def textBetween(from: scala.Double, to: scala.Double, doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_]): js.Array[
    atGuardianProsemirrorDashInvisiblesLib.atGuardianProsemirrorDashInvisiblesMod.TextBetweenPosition
  ] = js.native
}

