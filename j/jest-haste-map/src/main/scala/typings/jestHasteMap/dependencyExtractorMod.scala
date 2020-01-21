package typings.jestHasteMap

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-haste-map/build/lib/dependencyExtractor", JSImport.Namespace)
@js.native
object dependencyExtractorMod extends js.Object {
  def extract(code: String): Set[String] = js.native
}

