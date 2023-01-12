package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPathFinder
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  var items: js.UndefOr[Any] = js.undefined
}
object IgPathFinder {
  
  inline def apply(): IgPathFinder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPathFinder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgPathFinder] (val x: Self) extends AnyVal {
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
  }
}
