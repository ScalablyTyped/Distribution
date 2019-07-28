package typings.liftoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object liftoffStrings {
  @js.native
  sealed trait require extends js.Object
  
  @js.native
  sealed trait requireFail extends js.Object
  
  @js.native
  sealed trait respawn extends js.Object
  
  @scala.inline
  def require: require = "require".asInstanceOf[require]
  @scala.inline
  def requireFail: requireFail = "requireFail".asInstanceOf[requireFail]
  @scala.inline
  def respawn: respawn = "respawn".asInstanceOf[respawn]
}

