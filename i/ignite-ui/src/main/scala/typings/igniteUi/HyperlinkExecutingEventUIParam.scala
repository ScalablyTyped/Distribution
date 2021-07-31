package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperlinkExecutingEventUIParam extends StObject {
  
  /**
    * Get the [hyperlink](ig.excel.WorksheetHyperlink) to be executed.
    */
  var hyperlink: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object HyperlinkExecutingEventUIParam {
  
  @scala.inline
  def apply(): HyperlinkExecutingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkExecutingEventUIParam]
  }
  
  @scala.inline
  implicit class HyperlinkExecutingEventUIParamMutableBuilder[Self <: HyperlinkExecutingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHyperlink(value: js.Any): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
