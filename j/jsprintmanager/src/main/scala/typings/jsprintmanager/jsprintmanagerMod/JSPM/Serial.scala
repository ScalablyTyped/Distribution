package typings.jsprintmanager.jsprintmanagerMod.JSPM

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Handshake with Double] = js.native
    /* 0 */ @js.native
    object None extends TopLevel[None with Double]
    
    /* 1 */ @js.native
    object RequestToSend extends TopLevel[RequestToSend with Double]
    
    /* 2 */ @js.native
    object RequestToSendXOnXOff extends TopLevel[RequestToSendXOnXOff with Double]
    
    /* 3 */ @js.native
    object XOnXOff extends TopLevel[XOnXOff with Double]
    
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Parity with Double] = js.native
    /* 2 */ @js.native
    object Even extends TopLevel[Even with Double]
    
    /* 3 */ @js.native
    object Mark extends TopLevel[Mark with Double]
    
    /* 0 */ @js.native
    object None extends TopLevel[None with Double]
    
    /* 1 */ @js.native
    object Odd extends TopLevel[Odd with Double]
    
    /* 4 */ @js.native
    object Space extends TopLevel[Space with Double]
    
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StopBits with Double] = js.native
    /* 0 */ @js.native
    object None extends TopLevel[None with Double]
    
    /* 1 */ @js.native
    object One extends TopLevel[One with Double]
    
    /* 3 */ @js.native
    object OnePointFive extends TopLevel[OnePointFive with Double]
    
    /* 2 */ @js.native
    object Two extends TopLevel[Two with Double]
    
  }
  
}

