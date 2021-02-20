package typings.javascriptStringify

import typings.javascriptStringify.typesMod.Next
import typings.std.PropertyKey
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quoteMod {
  
  @JSImport("javascript-stringify/dist/quote", "IS_VALID_IDENTIFIER")
  @js.native
  val IS_VALID_IDENTIFIER: RegExp = js.native
  
  @JSImport("javascript-stringify/dist/quote", "isValidVariableName")
  @js.native
  def isValidVariableName(name: PropertyKey): /* is string */ Boolean = js.native
  
  @JSImport("javascript-stringify/dist/quote", "quoteKey")
  @js.native
  def quoteKey(key: PropertyKey, next: Next): js.UndefOr[String] = js.native
  
  @JSImport("javascript-stringify/dist/quote", "quoteString")
  @js.native
  def quoteString(str: String): String = js.native
  
  @JSImport("javascript-stringify/dist/quote", "stringifyPath")
  @js.native
  def stringifyPath(path: js.Array[PropertyKey], next: Next): String = js.native
}
