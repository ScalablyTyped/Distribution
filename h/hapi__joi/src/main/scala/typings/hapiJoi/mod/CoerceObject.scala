package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoerceObject extends js.Object {
  
  var from: js.UndefOr[String | js.Array[String]] = js.native
  
  def method(value: js.Any, helpers: CustomHelpers[_]): CoerceResult = js.native
  @JSName("method")
  var method_Original: CoerceFunction = js.native
}
