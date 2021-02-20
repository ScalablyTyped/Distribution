package typings.jest.mod.jest

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jest.jest.jest.ChalkFunction & {  supportsColor :jest.jest.jest.ChalkColorSupport} */
@js.native
trait MatcherColorFn extends StObject {
  
  def apply(text: js.Any*): String = js.native
  def apply(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  var supportsColor: ChalkColorSupport = js.native
}
