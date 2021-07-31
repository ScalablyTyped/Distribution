package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISessionChannel extends StObject {
  
  def onSession(session: Session): js.Any
  
  def sendSession(session: Session): Unit
}
object ISessionChannel {
  
  @scala.inline
  def apply(onSession: Session => js.Any, sendSession: Session => Unit): ISessionChannel = {
    val __obj = js.Dynamic.literal(onSession = js.Any.fromFunction1(onSession), sendSession = js.Any.fromFunction1(sendSession))
    __obj.asInstanceOf[ISessionChannel]
  }
  
  @scala.inline
  implicit class ISessionChannelMutableBuilder[Self <: ISessionChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSession(value: Session => js.Any): Self = StObject.set(x, "onSession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendSession(value: Session => Unit): Self = StObject.set(x, "sendSession", js.Any.fromFunction1(value))
  }
}
