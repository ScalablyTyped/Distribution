package typings.ionicCore.animationInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionicCore.ionicCoreStrings.normal
  - typings.ionicCore.ionicCoreStrings.reverse
  - typings.ionicCore.ionicCoreStrings.alternate
  - typings.ionicCore.ionicCoreStrings.`alternate-reverse`
*/
trait AnimationDirection extends js.Object

object AnimationDirection {
  @scala.inline
  def alternate: typings.ionicCore.ionicCoreStrings.alternate = this.cast("alternate")
  @scala.inline
  def `alternate-reverse`: typings.ionicCore.ionicCoreStrings.`alternate-reverse` = this.cast("alternate-reverse")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.ionicCore.ionicCoreStrings.normal = this.cast("normal")
  @scala.inline
  def reverse: typings.ionicCore.ionicCoreStrings.reverse = this.cast("reverse")
}

