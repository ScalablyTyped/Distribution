package typings.jestDocblock

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-docblock/build", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def extract(contents: String): String = js.native
  def parse(docblock: String): Pragmas = js.native
  def parseWithComments(docblock: String): AnonComments = js.native
  def print(hasCommentsPragmas: AnonPragmas): String = js.native
  def strip(contents: String): String = js.native
  type Pragmas = Record[String, String | js.Array[String]]
}

