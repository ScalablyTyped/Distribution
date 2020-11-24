package typings.liftoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liftoffStrings {
  
  @scala.inline
  def require: require = "require".asInstanceOf[require]
  
  @scala.inline
  def requireFail: requireFail = "requireFail".asInstanceOf[requireFail]
  
  @scala.inline
  def respawn: respawn = "respawn".asInstanceOf[respawn]
  
  @js.native
  sealed trait require extends js.Object
  
  @js.native
  sealed trait requireFail extends js.Object
  
  @js.native
  sealed trait respawn extends js.Object
}
