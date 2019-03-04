package typings
package jqueryDashValidationDashUnobtrusiveLib.MicrosoftJQueryUnobtrusiveValidationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  var adapt: js.Function
  var name: java.lang.String
  var params: js.Array[java.lang.String]
}

object Adapter {
  @scala.inline
  def apply(adapt: js.Function, name: java.lang.String, params: js.Array[java.lang.String]): Adapter = {
    val __obj = js.Dynamic.literal(adapt = adapt, name = name, params = params)
  
    __obj.asInstanceOf[Adapter]
  }
}

