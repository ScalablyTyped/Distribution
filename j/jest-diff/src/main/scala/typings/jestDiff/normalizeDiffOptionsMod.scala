package typings.jestDiff

import typings.jestDiff.typesMod.DiffOptions
import typings.jestDiff.typesMod.DiffOptionsNormalized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/normalizeDiffOptions", JSImport.Namespace)
@js.native
object normalizeDiffOptionsMod extends js.Object {
  def noColor(string: String): String = js.native
  def normalizeDiffOptions(): DiffOptionsNormalized = js.native
  def normalizeDiffOptions(options: DiffOptions): DiffOptionsNormalized = js.native
}

