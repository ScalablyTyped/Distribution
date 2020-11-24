package typings.ionicAngular.interfacesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLStencilElement extends HTMLElement {
  
  def componentOnReady(): js.Promise[this.type] = js.native
  
  def forceUpdate(): Unit = js.native
}
