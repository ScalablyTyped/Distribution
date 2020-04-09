package typings.ionicCore.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionicCore.ionicCoreStrings.parent
  - typings.ionicCore.ionicCoreStrings.body
  - typings.ionicCore.ionicCoreStrings.document
  - typings.ionicCore.ionicCoreStrings.window
*/
trait ListenTargetOptions extends js.Object

object ListenTargetOptions {
  @scala.inline
  def body: typings.ionicCore.ionicCoreStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typings.ionicCore.ionicCoreStrings.document = this.cast("document")
  @scala.inline
  def parent: typings.ionicCore.ionicCoreStrings.parent = this.cast("parent")
  @scala.inline
  def window: typings.ionicCore.ionicCoreStrings.window = this.cast("window")
}

