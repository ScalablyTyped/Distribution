package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PretargetingConfigList extends StObject {
  
  /** A list of pretargeting configs */
  var items: js.UndefOr[js.Array[PretargetingConfig]] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}
object PretargetingConfigList {
  
  inline def apply(): PretargetingConfigList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PretargetingConfigList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PretargetingConfigList] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[PretargetingConfig]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PretargetingConfig*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
