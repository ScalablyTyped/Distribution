package typings.jqueryMockjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  var mockjaxSettings: MockJaxSettings = js.native
  @JSName("mockjax")
  var mockjax_Original: MockJaxStatic = js.native
  def mockjax(options: js.Array[MockJaxSettings]): js.Array[Double] = js.native
  def mockjax(options: MockJaxSettings): Double = js.native
}

