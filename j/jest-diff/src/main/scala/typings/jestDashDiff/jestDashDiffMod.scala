package typings.jestDashDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff", JSImport.Namespace)
@js.native
object jestDashDiffMod extends js.Object {
  var getStringDiff: js.Function3[
    /* expected */ String, 
    /* received */ String, 
    /* options */ js.UndefOr[typings.jestDashDiff.buildTypesMod.DiffOptions], 
    Anon_AnnotatedDiff | Anon_A | Null
  ] = js.native
  def apply(a: js.Any, b: js.Any): String | Null = js.native
  def apply(a: js.Any, b: js.Any, options: typings.jestDashDiff.buildTypesMod.DiffOptions): String | Null = js.native
  type DiffOptions = typings.jestDashDiff.buildTypesMod.DiffOptions
}

