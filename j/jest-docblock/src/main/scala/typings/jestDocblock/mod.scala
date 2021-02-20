package typings.jestDocblock

import typings.jestDocblock.anon.Comments
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-docblock", "extract")
  @js.native
  def extract(contents: String): String = js.native
  
  @JSImport("jest-docblock", "parse")
  @js.native
  def parse(docblock: String): Pragmas = js.native
  
  @JSImport("jest-docblock", "parseWithComments")
  @js.native
  def parseWithComments(docblock: String): Comments = js.native
  
  @JSImport("jest-docblock", "print")
  @js.native
  def print(hasCommentsPragmas: typings.jestDocblock.anon.Pragmas): String = js.native
  
  @JSImport("jest-docblock", "strip")
  @js.native
  def strip(contents: String): String = js.native
  
  type Pragmas = Record[String, String | js.Array[String]]
}
