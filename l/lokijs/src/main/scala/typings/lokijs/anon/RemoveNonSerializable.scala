package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveNonSerializable extends StObject {
  
  var removeNonSerializable: js.UndefOr[Boolean] = js.undefined
}
object RemoveNonSerializable {
  
  inline def apply(): RemoveNonSerializable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveNonSerializable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveNonSerializable] (val x: Self) extends AnyVal {
    
    inline def setRemoveNonSerializable(value: Boolean): Self = StObject.set(x, "removeNonSerializable", value.asInstanceOf[js.Any])
    
    inline def setRemoveNonSerializableUndefined: Self = StObject.set(x, "removeNonSerializable", js.undefined)
  }
}
