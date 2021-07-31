package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoftimeout extends StObject {
  
  val socket: Boolean
}
object Typeoftimeout {
  
  @scala.inline
  def apply(socket: Boolean): Typeoftimeout = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftimeout]
  }
  
  @scala.inline
  implicit class TypeoftimeoutMutableBuilder[Self <: Typeoftimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocket(value: Boolean): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
