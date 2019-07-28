package typings.atMaterialAutoDashInit.atMaterialAutoDashInitMod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCAutoInit extends js.Object {
  def apply(): MDCAutoInit = js.native
  def apply(root: Document): MDCAutoInit = js.native
  def apply(root: Document, warn: MDCLogger): MDCAutoInit = js.native
  def deregister(componentName: String): Unit = js.native
  def deregisterAll(): Unit = js.native
  def register(componentName: String, Ctor: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def register(componentName: String, Ctor: js.Function1[/* repeated */ js.Any, _], warn: MDCLogger): Unit = js.native
}

