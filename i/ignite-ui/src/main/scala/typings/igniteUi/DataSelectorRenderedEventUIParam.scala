package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSelectorRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the data selector.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DataSelectorRenderedEventUIParam {
  
  inline def apply(): DataSelectorRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSelectorRenderedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSelectorRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
