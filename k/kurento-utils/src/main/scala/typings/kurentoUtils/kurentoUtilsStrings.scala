package typings.kurentoUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kurentoUtilsStrings {
  
  @scala.inline
  def recv: recv = "recv".asInstanceOf[recv]
  
  @scala.inline
  def send: send = "send".asInstanceOf[send]
  
  @scala.inline
  def sendRecv: sendRecv = "sendRecv".asInstanceOf[sendRecv]
  
  @js.native
  sealed trait recv extends js.Object
  
  @js.native
  sealed trait send extends js.Object
  
  @js.native
  sealed trait sendRecv extends js.Object
}
