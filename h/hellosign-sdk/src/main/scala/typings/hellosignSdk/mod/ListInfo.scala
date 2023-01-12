package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Numpages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInfo extends StObject {
  
  var list_info: Numpages
}
object ListInfo {
  
  inline def apply(list_info: Numpages): ListInfo = {
    val __obj = js.Dynamic.literal(list_info = list_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInfo] (val x: Self) extends AnyVal {
    
    inline def setList_info(value: Numpages): Self = StObject.set(x, "list_info", value.asInstanceOf[js.Any])
  }
}
