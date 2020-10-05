package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highlight.js", "registerLanguage")
@js.native
object registerLanguage extends js.Object {
  def apply(name: String, language: js.Function1[/* hljs */ js.UndefOr[HLJSStatic], IModeBase]): Unit = js.native
}

