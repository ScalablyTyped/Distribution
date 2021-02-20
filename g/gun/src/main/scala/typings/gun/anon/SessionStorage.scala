package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionStorage extends StObject {
  
  var sessionStorage: Boolean = js.native
}
object SessionStorage {
  
  @scala.inline
  def apply(sessionStorage: Boolean): SessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStorage]
  }
  
  @scala.inline
  implicit class SessionStorageMutableBuilder[Self <: SessionStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionStorage(value: Boolean): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
  }
}
