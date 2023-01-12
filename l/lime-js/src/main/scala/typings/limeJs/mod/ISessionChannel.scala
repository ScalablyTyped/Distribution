package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISessionChannel extends StObject {
  
  def onSession(session: Session): Any
  
  def sendSession(session: Session): Unit
}
object ISessionChannel {
  
  inline def apply(onSession: Session => Any, sendSession: Session => Unit): ISessionChannel = {
    val __obj = js.Dynamic.literal(onSession = js.Any.fromFunction1(onSession), sendSession = js.Any.fromFunction1(sendSession))
    __obj.asInstanceOf[ISessionChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISessionChannel] (val x: Self) extends AnyVal {
    
    inline def setOnSession(value: Session => Any): Self = StObject.set(x, "onSession", js.Any.fromFunction1(value))
    
    inline def setSendSession(value: Session => Unit): Self = StObject.set(x, "sendSession", js.Any.fromFunction1(value))
  }
}
