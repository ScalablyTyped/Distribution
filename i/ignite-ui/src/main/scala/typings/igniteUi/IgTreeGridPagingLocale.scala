package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridPagingLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Sets/gets the text message shown while loading content of the context row(while processing breadcrumb/immediate parent row). It is set via $.html(). If set to null loading message is not shown.
    *
    */
  var contextRowLoadingText: js.UndefOr[String] = js.undefined
  
  /**
    * Sets/gets the content of the context row when the first record in the page is root(hasn't ancestors) record. It is set via $.html()
    *
    */
  var contextRowRootText: js.UndefOr[String] = js.undefined
}
object IgTreeGridPagingLocale {
  
  inline def apply(): IgTreeGridPagingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridPagingLocale]
  }
  
  extension [Self <: IgTreeGridPagingLocale](x: Self) {
    
    inline def setContextRowLoadingText(value: String): Self = StObject.set(x, "contextRowLoadingText", value.asInstanceOf[js.Any])
    
    inline def setContextRowLoadingTextUndefined: Self = StObject.set(x, "contextRowLoadingText", js.undefined)
    
    inline def setContextRowRootText(value: String): Self = StObject.set(x, "contextRowRootText", value.asInstanceOf[js.Any])
    
    inline def setContextRowRootTextUndefined: Self = StObject.set(x, "contextRowRootText", js.undefined)
  }
}
