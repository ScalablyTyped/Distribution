package typings.jointjs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deep
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var deep: js.UndefOr[Boolean] = js.undefined
  
  var parentRelative: js.UndefOr[Boolean] = js.undefined
}
object Deep {
  
  inline def apply(): Deep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deep]
  }
  
  extension [Self <: Deep](x: Self) {
    
    inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    
    inline def setParentRelative(value: Boolean): Self = StObject.set(x, "parentRelative", value.asInstanceOf[js.Any])
    
    inline def setParentRelativeUndefined: Self = StObject.set(x, "parentRelative", js.undefined)
  }
}
