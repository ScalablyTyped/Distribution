package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnHoldResult extends StObject {
  
  var local: Boolean
  
  var remote: Boolean
}
object OnHoldResult {
  
  inline def apply(local: Boolean, remote: Boolean): OnHoldResult = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHoldResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnHoldResult] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
  }
}
