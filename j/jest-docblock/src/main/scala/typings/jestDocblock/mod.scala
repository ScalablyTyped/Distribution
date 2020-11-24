package typings.jestDocblock

import typings.jestDocblock.anon.Comments
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-docblock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def extract(contents: String): String = js.native
  
  def parse(docblock: String): Pragmas = js.native
  
  def parseWithComments(docblock: String): Comments = js.native
  
  def print(hasCommentsPragmas: typings.jestDocblock.anon.Pragmas): String = js.native
  
  def strip(contents: String): String = js.native
  
  type Pragmas = Record[String, String | js.Array[String]]
}
