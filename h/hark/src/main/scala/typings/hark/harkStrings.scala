package typings.hark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object harkStrings {
  
  @scala.inline
  def speaking: speaking = "speaking".asInstanceOf[speaking]
  
  @scala.inline
  def state_change: state_change = "state_change".asInstanceOf[state_change]
  
  @scala.inline
  def stopped_speaking: stopped_speaking = "stopped_speaking".asInstanceOf[stopped_speaking]
  
  @scala.inline
  def volume_change: volume_change = "volume_change".asInstanceOf[volume_change]
  
  @js.native
  sealed trait speaking extends js.Object
  
  @js.native
  sealed trait state_change extends js.Object
  
  @js.native
  sealed trait stopped_speaking extends js.Object
  
  @js.native
  sealed trait volume_change extends js.Object
}
