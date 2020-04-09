package typings.ionicCore.stencilPublicRuntimeMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLStencilElement extends HTMLElement {
  def componentOnReady(): js.Promise[this.type] = js.native
  /** @deprecated */
  def forceUpdate(): Unit = js.native
}

