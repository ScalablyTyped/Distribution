package typings.jestDiff

import typings.jestDiff.typesMod.DiffOptions
import typings.jestDiff.typesMod.DiffOptionsNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeDiffOptionsMod {
  
  @JSImport("jest-diff/build/normalizeDiffOptions", "noColor")
  @js.native
  def noColor(string: String): String = js.native
  
  @JSImport("jest-diff/build/normalizeDiffOptions", "normalizeDiffOptions")
  @js.native
  def normalizeDiffOptions(): DiffOptionsNormalized = js.native
  @JSImport("jest-diff/build/normalizeDiffOptions", "normalizeDiffOptions")
  @js.native
  def normalizeDiffOptions(options: DiffOptions): DiffOptionsNormalized = js.native
}
