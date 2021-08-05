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
  
  extension [Self <: RemoveNonSerializable](x: Self) {
    
    inline def setRemoveNonSerializable(value: Boolean): Self = StObject.set(x, "removeNonSerializable", value.asInstanceOf[js.Any])
    
    inline def setRemoveNonSerializableUndefined: Self = StObject.set(x, "removeNonSerializable", js.undefined)
  }
}
