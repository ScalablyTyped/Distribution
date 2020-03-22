package typings.jestDiff.printDiffsMod

import typings.jestDiff.typesMod.DiffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", "diffStringsUnified")
@js.native
object diffStringsUnified extends js.Object {
  def apply(a: String, b: String): String = js.native
  def apply(a: String, b: String, options: DiffOptions): String = js.native
}

