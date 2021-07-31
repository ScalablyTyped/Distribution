package typings.jestDocblock

import typings.jestDocblock.anon.Comments
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-docblock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extract(contents: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(contents.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(docblock: String): Pragmas = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(docblock.asInstanceOf[js.Any]).asInstanceOf[Pragmas]
  
  @scala.inline
  def parseWithComments(docblock: String): Comments = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWithComments")(docblock.asInstanceOf[js.Any]).asInstanceOf[Comments]
  
  @scala.inline
  def print(hasCommentsPragmas: typings.jestDocblock.anon.Pragmas): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(hasCommentsPragmas.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def strip(contents: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strip")(contents.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Pragmas = Record[String, String | js.Array[String]]
}
