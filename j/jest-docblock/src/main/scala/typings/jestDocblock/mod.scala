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
  
  inline def extract(contents: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(contents.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(docblock: String): Pragmas = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(docblock.asInstanceOf[js.Any]).asInstanceOf[Pragmas]
  
  inline def parseWithComments(docblock: String): Comments = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWithComments")(docblock.asInstanceOf[js.Any]).asInstanceOf[Comments]
  
  inline def print(param0: typings.jestDocblock.anon.Pragmas): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def strip(contents: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strip")(contents.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Pragmas = Record[String, String | js.Array[String]]
}
