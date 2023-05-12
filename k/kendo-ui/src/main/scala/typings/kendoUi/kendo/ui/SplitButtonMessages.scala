package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitButtonMessages extends StObject {
  
  var labelSuffix: js.UndefOr[String] = js.undefined
}
object SplitButtonMessages {
  
  inline def apply(): SplitButtonMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitButtonMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitButtonMessages] (val x: Self) extends AnyVal {
    
    inline def setLabelSuffix(value: String): Self = StObject.set(x, "labelSuffix", value.asInstanceOf[js.Any])
    
    inline def setLabelSuffixUndefined: Self = StObject.set(x, "labelSuffix", js.undefined)
  }
}
