package typings.ionicCore.anon

import typings.ionicCore.interfaceMod.NavOutletElement
import typings.ionicCore.interfaceMod.RouteID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ids extends StObject {
  
  var ids: js.Array[RouteID]
  
  var outlet: js.UndefOr[NavOutletElement] = js.undefined
}
object Ids {
  
  inline def apply(ids: js.Array[RouteID]): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
  
  extension [Self <: Ids](x: Self) {
    
    inline def setIds(value: js.Array[RouteID]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: RouteID*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    inline def setOutlet(value: NavOutletElement): Self = StObject.set(x, "outlet", value.asInstanceOf[js.Any])
    
    inline def setOutletUndefined: Self = StObject.set(x, "outlet", js.undefined)
  }
}
