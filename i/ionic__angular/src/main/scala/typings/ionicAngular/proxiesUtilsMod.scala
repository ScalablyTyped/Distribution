package typings.ionicAngular

import typings.ionicAngular.anon.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies-utils", JSImport.Namespace)
@js.native
object proxiesUtilsMod extends js.Object {
  def ProxyCmp(opts: Inputs): js.Function1[/* cls */ js.Any, _] = js.native
  def proxyInputs(Cmp: js.Any, inputs: js.Array[String]): Unit = js.native
  def proxyMethods(Cmp: js.Any, methods: js.Array[String]): Unit = js.native
  def proxyOutputs(instance: js.Any, el: js.Any, events: js.Array[String]): Unit = js.native
}

