package typings.jestDashDiff.buildDiffLinesMod

import typings.jestDashDiff.buildTypesMod.DiffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/diffLines", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(a: String, b: String): String = js.native
  def apply(a: String, b: String, options: js.UndefOr[scala.Nothing], original: Original): String = js.native
  def apply(a: String, b: String, options: DiffOptions): String = js.native
  def apply(a: String, b: String, options: DiffOptions, original: Original): String = js.native
}

