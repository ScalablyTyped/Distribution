package typings.jsprintmanager.jsprintmanagerMod.JSPM

import typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Handshake
import typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Parity
import typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.StopBits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM.Serial")
@js.native
object Serial extends js.Object {
  @js.native
  sealed trait Handshake extends js.Object
  
  @js.native
  sealed trait Parity extends js.Object
  
  @js.native
  sealed trait StopBits extends js.Object
  
  @js.native
  object Handshake extends js.Object {
    @js.native
    sealed trait None extends Handshake
    
    @js.native
    sealed trait RequestToSend extends Handshake
    
    @js.native
    sealed trait RequestToSendXOnXOff extends Handshake
    
    @js.native
    sealed trait XOnXOff extends Handshake
    
    /* 0 */ val None: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Handshake.None with Double = js.native
    /* 1 */ val RequestToSend: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Handshake.RequestToSend with Double = js.native
    /* 2 */ val RequestToSendXOnXOff: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Handshake.RequestToSendXOnXOff with Double = js.native
    /* 3 */ val XOnXOff: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Handshake.XOnXOff with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Handshake with Double] = js.native
  }
  
  @js.native
  object Parity extends js.Object {
    @js.native
    sealed trait Even extends Parity
    
    @js.native
    sealed trait Mark extends Parity
    
    @js.native
    sealed trait None extends Parity
    
    @js.native
    sealed trait Odd extends Parity
    
    @js.native
    sealed trait Space extends Parity
    
    /* 2 */ val Even: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Parity.Even with Double = js.native
    /* 3 */ val Mark: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Parity.Mark with Double = js.native
    /* 0 */ val None: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Parity.None with Double = js.native
    /* 1 */ val Odd: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Parity.Odd with Double = js.native
    /* 4 */ val Space: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Parity.Space with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Parity with Double] = js.native
  }
  
  @js.native
  object StopBits extends js.Object {
    @js.native
    sealed trait None extends StopBits
    
    @js.native
    sealed trait One extends StopBits
    
    @js.native
    sealed trait OnePointFive extends StopBits
    
    @js.native
    sealed trait Two extends StopBits
    
    /* 0 */ val None: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.StopBits.None with Double = js.native
    /* 1 */ val One: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.StopBits.One with Double = js.native
    /* 3 */ val OnePointFive: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.StopBits.OnePointFive with Double = js.native
    /* 2 */ val Two: typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.StopBits.Two with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StopBits with Double] = js.native
  }
  
}

