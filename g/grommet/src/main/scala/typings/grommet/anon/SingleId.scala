package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleId extends StObject {
  
  var singleId: js.UndefOr[Boolean] = js.undefined
}
object SingleId {
  
  inline def apply(): SingleId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleId] (val x: Self) extends AnyVal {
    
    inline def setSingleId(value: Boolean): Self = StObject.set(x, "singleId", value.asInstanceOf[js.Any])
    
    inline def setSingleIdUndefined: Self = StObject.set(x, "singleId", js.undefined)
  }
}
