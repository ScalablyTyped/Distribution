package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Serial {
  
  @js.native
  sealed trait Handshake extends StObject
  @JSImport("jsprintmanager", "JSPM.Serial.Handshake")
  @js.native
  object Handshake extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Handshake & Double] = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with Handshake
    /* 0 */ val None: typings.jsprintmanager.mod.JSPM.Serial.Handshake.None & Double = js.native
    
    @js.native
    sealed trait RequestToSend
      extends StObject
         with Handshake
    /* 1 */ val RequestToSend: typings.jsprintmanager.mod.JSPM.Serial.Handshake.RequestToSend & Double = js.native
    
    @js.native
    sealed trait RequestToSendXOnXOff
      extends StObject
         with Handshake
    /* 2 */ val RequestToSendXOnXOff: typings.jsprintmanager.mod.JSPM.Serial.Handshake.RequestToSendXOnXOff & Double = js.native
    
    @js.native
    sealed trait XOnXOff
      extends StObject
         with Handshake
    /* 3 */ val XOnXOff: typings.jsprintmanager.mod.JSPM.Serial.Handshake.XOnXOff & Double = js.native
  }
  
  @js.native
  sealed trait Parity extends StObject
  @JSImport("jsprintmanager", "JSPM.Serial.Parity")
  @js.native
  object Parity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Parity & Double] = js.native
    
    @js.native
    sealed trait Even
      extends StObject
         with Parity
    /* 2 */ val Even: typings.jsprintmanager.mod.JSPM.Serial.Parity.Even & Double = js.native
    
    @js.native
    sealed trait Mark
      extends StObject
         with Parity
    /* 3 */ val Mark: typings.jsprintmanager.mod.JSPM.Serial.Parity.Mark & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with Parity
    /* 0 */ val None: typings.jsprintmanager.mod.JSPM.Serial.Parity.None & Double = js.native
    
    @js.native
    sealed trait Odd
      extends StObject
         with Parity
    /* 1 */ val Odd: typings.jsprintmanager.mod.JSPM.Serial.Parity.Odd & Double = js.native
    
    @js.native
    sealed trait Space
      extends StObject
         with Parity
    /* 4 */ val Space: typings.jsprintmanager.mod.JSPM.Serial.Parity.Space & Double = js.native
  }
  
  @js.native
  sealed trait StopBits extends StObject
  @JSImport("jsprintmanager", "JSPM.Serial.StopBits")
  @js.native
  object StopBits extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StopBits & Double] = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with StopBits
    /* 0 */ val None: typings.jsprintmanager.mod.JSPM.Serial.StopBits.None & Double = js.native
    
    @js.native
    sealed trait One
      extends StObject
         with StopBits
    /* 1 */ val One: typings.jsprintmanager.mod.JSPM.Serial.StopBits.One & Double = js.native
    
    @js.native
    sealed trait OnePointFive
      extends StObject
         with StopBits
    /* 3 */ val OnePointFive: typings.jsprintmanager.mod.JSPM.Serial.StopBits.OnePointFive & Double = js.native
    
    @js.native
    sealed trait Two
      extends StObject
         with StopBits
    /* 2 */ val Two: typings.jsprintmanager.mod.JSPM.Serial.StopBits.Two & Double = js.native
  }
}
