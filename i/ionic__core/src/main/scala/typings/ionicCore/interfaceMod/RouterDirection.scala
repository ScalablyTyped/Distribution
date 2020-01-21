package typings.ionicCore.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionicCore.ionicCoreStrings.forward
  - typings.ionicCore.ionicCoreStrings.back
  - typings.ionicCore.ionicCoreStrings.root
*/
trait RouterDirection extends js.Object

object RouterDirection {
  @scala.inline
  def back: typings.ionicCore.ionicCoreStrings.back = this.cast("back")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forward: typings.ionicCore.ionicCoreStrings.forward = this.cast("forward")
  @scala.inline
  def root: typings.ionicCore.ionicCoreStrings.root = this.cast("root")
}

