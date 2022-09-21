package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxLockObject extends StObject {
  
  var path: String
  
  def release(): Unit
}
object MailboxLockObject {
  
  inline def apply(path: String, release: () => Unit): MailboxLockObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[MailboxLockObject]
  }
  
  extension [Self <: MailboxLockObject](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
  }
}
