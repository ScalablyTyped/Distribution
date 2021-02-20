package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var ok: typings.gun.gunNumbers.`0` = js.native
}
object `0` {
  
  @scala.inline
  def apply(ok: typings.gun.gunNumbers.`0`): `0` = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOk(value: typings.gun.gunNumbers.`0`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
