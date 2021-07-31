package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridAppendRowsOnDemandLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies caption text for the "load more data" button.
    *
    */
  var loadMoreDataButtonText: js.UndefOr[String] = js.undefined
}
object IgGridAppendRowsOnDemandLocale {
  
  @scala.inline
  def apply(): IgGridAppendRowsOnDemandLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridAppendRowsOnDemandLocale]
  }
  
  @scala.inline
  implicit class IgGridAppendRowsOnDemandLocaleMutableBuilder[Self <: IgGridAppendRowsOnDemandLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadMoreDataButtonText(value: String): Self = StObject.set(x, "loadMoreDataButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadMoreDataButtonTextUndefined: Self = StObject.set(x, "loadMoreDataButtonText", js.undefined)
  }
}
