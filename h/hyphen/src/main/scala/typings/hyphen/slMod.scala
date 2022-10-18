package typings.hyphen

import typings.hyphen.mod.HyphenationFunctionAsync
import typings.hyphen.mod.HyphenationFunctionSync
import typings.hyphen.mod.PatternsDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slMod {
  
  @JSImport("hyphen/sl", "hyphenate")
  @js.native
  val hyphenate: HyphenationFunctionAsync = js.native
  
  @JSImport("hyphen/sl", "hyphenateHTML")
  @js.native
  val hyphenateHTML: HyphenationFunctionAsync = js.native
  
  @JSImport("hyphen/sl", "hyphenateHTMLSync")
  @js.native
  val hyphenateHTMLSync: HyphenationFunctionSync = js.native
  
  @JSImport("hyphen/sl", "hyphenateSync")
  @js.native
  val hyphenateSync: HyphenationFunctionSync = js.native
  
  @JSImport("hyphen/sl", "patterns")
  @js.native
  val patterns: PatternsDefinition = js.native
}
