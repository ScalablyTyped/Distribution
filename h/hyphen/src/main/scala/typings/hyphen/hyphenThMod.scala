package typings.hyphen

import typings.hyphen.mod.HyphenationFunctionAsync
import typings.hyphen.mod.HyphenationFunctionSync
import typings.hyphen.mod.PatternsDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyphen/th", JSImport.Namespace)
@js.native
object hyphenThMod extends js.Object {
  
  val hyphenate: HyphenationFunctionAsync = js.native
  
  val hyphenateHTML: HyphenationFunctionAsync = js.native
  
  val hyphenateHTMLSync: HyphenationFunctionSync = js.native
  
  val hyphenateSync: HyphenationFunctionSync = js.native
  
  val patterns: PatternsDefinition = js.native
}
