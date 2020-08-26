package typings.ink

import typings.ink.domMod.DOMElement
import typings.ink.domMod.TextNode
import typings.reactReconciler.mod.Reconciler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink/build/reconciler", JSImport.Namespace)
@js.native
object reconcilerMod extends js.Object {
  val default: Reconciler[DOMElement, DOMElement | TextNode, DOMElement, js.Any] = js.native
}

