package typings.handlebars.Handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HelperOptions extends js.Object {
  
  var data: js.UndefOr[js.Any] = js.native
  
  def fn(context: js.Any): String = js.native
  def fn(context: js.Any, options: RuntimeOptions): String = js.native
  @JSName("fn")
  var fn_Original: TemplateDelegate[_] = js.native
  
  var hash: js.Any = js.native
  
  def inverse(context: js.Any): String = js.native
  def inverse(context: js.Any, options: RuntimeOptions): String = js.native
  @JSName("inverse")
  var inverse_Original: TemplateDelegate[_] = js.native
}
