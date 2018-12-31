package typings
package atMaterialAutoDashInitLib.autoDashInitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCAutoInit extends js.Object {
  def apply(): MDCAutoInit = js.native
  def apply(root: stdLib.Document): MDCAutoInit = js.native
  def apply(root: stdLib.Document, warn: MDCLogger): MDCAutoInit = js.native
  def deregister(componentName: java.lang.String): scala.Unit = js.native
  def deregisterAll(): scala.Unit = js.native
  def register(componentName: java.lang.String, Ctor: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def register(componentName: java.lang.String, Ctor: js.Function1[/* repeated */ js.Any, _], warn: MDCLogger): scala.Unit = js.native
}

