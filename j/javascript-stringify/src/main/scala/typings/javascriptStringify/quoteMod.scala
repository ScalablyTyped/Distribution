package typings.javascriptStringify

import typings.javascriptStringify.typesMod.Next
import typings.std.PropertyKey
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quoteMod {
  
  @JSImport("javascript-stringify/dist/quote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("javascript-stringify/dist/quote", "IS_VALID_IDENTIFIER")
  @js.native
  val IS_VALID_IDENTIFIER: RegExp = js.native
  
  inline def isValidVariableName(name: PropertyKey): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidVariableName")(name.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def quoteKey(key: PropertyKey, next: Next): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("quoteKey")(key.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def quoteString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quoteString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyPath(path: js.Array[PropertyKey], next: Next): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPath")(path.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[String]
}
