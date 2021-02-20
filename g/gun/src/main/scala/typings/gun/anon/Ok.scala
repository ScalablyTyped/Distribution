package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ok extends StObject {
  
  var err: js.UndefOr[scala.Nothing] = js.native
  
  var ok: String = js.native
}
object Ok {
  
  @scala.inline
  def apply(ok: String): Ok = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok]
  }
  
  @scala.inline
  implicit class OkMutableBuilder[Self <: Ok] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
