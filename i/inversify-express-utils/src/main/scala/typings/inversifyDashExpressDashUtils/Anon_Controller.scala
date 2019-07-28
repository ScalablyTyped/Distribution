package typings.inversifyDashExpressDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Controller extends js.Object {
  var controller: js.Any
  var endpoints: js.Array[Anon_Args]
}

object Anon_Controller {
  @scala.inline
  def apply(controller: js.Any, endpoints: js.Array[Anon_Args]): Anon_Controller = {
    val __obj = js.Dynamic.literal(controller = controller, endpoints = endpoints)
  
    __obj.asInstanceOf[Anon_Controller]
  }
}

