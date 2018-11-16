package typings
package jqueryDashMockjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  var mockjaxSettings: MockJaxSettings = js.native
  @JSName("mockjax")
  var mockjax_Original: MockJaxStatic = js.native
  def mockjax(options: MockJaxSettings): scala.Double = js.native
  def mockjax(options: js.Array[MockJaxSettings]): js.Array[scala.Double] = js.native
}

