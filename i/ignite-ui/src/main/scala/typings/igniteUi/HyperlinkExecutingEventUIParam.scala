package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperlinkExecutingEventUIParam extends StObject {
  
  /**
    * Get the [hyperlink](ig.excel.WorksheetHyperlink) to be executed.
    */
  var hyperlink: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object HyperlinkExecutingEventUIParam {
  
  inline def apply(): HyperlinkExecutingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkExecutingEventUIParam]
  }
  
  extension [Self <: HyperlinkExecutingEventUIParam](x: Self) {
    
    inline def setHyperlink(value: Any): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
