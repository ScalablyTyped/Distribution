package typings.ionicCore.stencilCoreMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLStencilElement extends HTMLElement {
  def componentOnReady(): js.Promise[this.type] = js.native
  def forceUpdate(): Unit = js.native
}

