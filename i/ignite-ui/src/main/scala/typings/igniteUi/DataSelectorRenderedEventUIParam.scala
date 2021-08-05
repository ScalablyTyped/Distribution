package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSelectorRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the data selector.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DataSelectorRenderedEventUIParam {
  
  inline def apply(): DataSelectorRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSelectorRenderedEventUIParam]
  }
  
  extension [Self <: DataSelectorRenderedEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
