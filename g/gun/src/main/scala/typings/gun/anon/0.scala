package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var ok: typings.gun.gunInts.`0`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(ok = 0)
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setOk(value: typings.gun.gunInts.`0`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
