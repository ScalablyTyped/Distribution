package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccumKey extends StObject {
  
  var accumKey: Z
}
object AccumKey {
  
  inline def apply(accumKey: Z): AccumKey = {
    val __obj = js.Dynamic.literal(accumKey = accumKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccumKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccumKey] (val x: Self) extends AnyVal {
    
    inline def setAccumKey(value: Z): Self = StObject.set(x, "accumKey", value.asInstanceOf[js.Any])
  }
}
