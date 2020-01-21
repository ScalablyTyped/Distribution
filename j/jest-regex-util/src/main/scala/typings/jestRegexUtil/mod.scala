package typings.jestRegexUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-regex-util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def escapePathForRegex(dir: String): String = js.native
  def escapeStrForRegex(string: String): String = js.native
  def replacePathSepForRegex(string: String): String = js.native
}

