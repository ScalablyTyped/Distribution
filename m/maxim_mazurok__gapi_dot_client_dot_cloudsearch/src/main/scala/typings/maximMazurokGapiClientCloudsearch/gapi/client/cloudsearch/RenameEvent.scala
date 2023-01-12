package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameEvent extends StObject {
  
  var newName: js.UndefOr[String] = js.undefined
  
  var originalName: js.UndefOr[String] = js.undefined
}
object RenameEvent {
  
  inline def apply(): RenameEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenameEvent] (val x: Self) extends AnyVal {
    
    inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    inline def setNewNameUndefined: Self = StObject.set(x, "newName", js.undefined)
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
  }
}
