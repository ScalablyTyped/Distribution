package typings.jqueryAjaxfile.Chai

import typings.jqueryAjaxfile.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeComparison extends js.Object {
  
  def apply(`type`: String): Assertion = js.native
  def apply(`type`: String, message: String): Assertion = js.native
  
  def instanceOf(constructor: Object): Assertion = js.native
  def instanceOf(constructor: Object, message: String): Assertion = js.native
  @JSName("instanceOf")
  var instanceOf_Original: InstanceOf = js.native
  
  def instanceof(constructor: Object): Assertion = js.native
  def instanceof(constructor: Object, message: String): Assertion = js.native
  @JSName("instanceof")
  var instanceof_Original: InstanceOf = js.native
}
