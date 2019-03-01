package typings
package jqueryDashJsonrpcclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var JsonRpcClient: JsonRpcClientFactory
}

object JQueryStatic {
  @scala.inline
  def apply(JsonRpcClient: JsonRpcClientFactory): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("JsonRpcClient")(JsonRpcClient)
    __obj.asInstanceOf[JQueryStatic]
  }
}

