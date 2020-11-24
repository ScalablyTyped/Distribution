package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prompt extends Dialog {
  
  @JSName("options")
  var options_Prompt: PromptOptions = js.native
  
  var result: JQueryPromise[_] = js.native
}
