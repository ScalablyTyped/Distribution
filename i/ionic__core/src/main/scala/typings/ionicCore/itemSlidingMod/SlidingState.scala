package typings.ionicCore.itemSlidingMod

import typings.ionicCore.ionicCoreNumbers.`16`
import typings.ionicCore.ionicCoreNumbers.`2`
import typings.ionicCore.ionicCoreNumbers.`32`
import typings.ionicCore.ionicCoreNumbers.`4`
import typings.ionicCore.ionicCoreNumbers.`64`
import typings.ionicCore.ionicCoreNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionicCore.ionicCoreNumbers.`2`
  - typings.ionicCore.ionicCoreNumbers.`4`
  - typings.ionicCore.ionicCoreNumbers.`8`
  - typings.ionicCore.ionicCoreNumbers.`16`
  - typings.ionicCore.ionicCoreNumbers.`32`
  - typings.ionicCore.ionicCoreNumbers.`64`
*/
trait SlidingState extends js.Object

object SlidingState {
  @scala.inline
  def Disabled: `2` = this.cast(2)
  @scala.inline
  def Enabled: `4` = this.cast(4)
  @scala.inline
  def End: `8` = this.cast(8)
  @scala.inline
  def Start: `16` = this.cast(16)
  @scala.inline
  def SwipeEnd: `32` = this.cast(32)
  @scala.inline
  def SwipeStart: `64` = this.cast(64)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

