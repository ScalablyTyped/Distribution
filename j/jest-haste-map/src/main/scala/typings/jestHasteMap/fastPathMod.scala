package typings.jestHasteMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-haste-map/build/lib/fast_path", JSImport.Namespace)
@js.native
object fastPathMod extends js.Object {
  def relative(rootDir: String, filename: String): String = js.native
  def resolve(rootDir: String, relativeFilename: String): String = js.native
}

