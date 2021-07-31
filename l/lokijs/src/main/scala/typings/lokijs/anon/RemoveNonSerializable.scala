package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveNonSerializable extends StObject {
  
  var removeNonSerializable: js.UndefOr[Boolean] = js.undefined
}
object RemoveNonSerializable {
  
  @scala.inline
  def apply(): RemoveNonSerializable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveNonSerializable]
  }
  
  @scala.inline
  implicit class RemoveNonSerializableMutableBuilder[Self <: RemoveNonSerializable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveNonSerializable(value: Boolean): Self = StObject.set(x, "removeNonSerializable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveNonSerializableUndefined: Self = StObject.set(x, "removeNonSerializable", js.undefined)
  }
}
