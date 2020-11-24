package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridPagingLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Sets/gets the text message shown while loading content of the context row(while processing breadcrumb/immediate parent row). It is set via $.html(). If set to null loading message is not shown.
    *
    */
  var contextRowLoadingText: js.UndefOr[String] = js.native
  
  /**
    * Sets/gets the content of the context row when the first record in the page is root(hasn't ancestors) record. It is set via $.html()
    *
    */
  var contextRowRootText: js.UndefOr[String] = js.native
}
object IgTreeGridPagingLocale {
  
  @scala.inline
  def apply(): IgTreeGridPagingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridPagingLocale]
  }
  
  @scala.inline
  implicit class IgTreeGridPagingLocaleOps[Self <: IgTreeGridPagingLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContextRowLoadingText(value: String): Self = this.set("contextRowLoadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextRowLoadingText: Self = this.set("contextRowLoadingText", js.undefined)
    
    @scala.inline
    def setContextRowRootText(value: String): Self = this.set("contextRowRootText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextRowRootText: Self = this.set("contextRowRootText", js.undefined)
  }
}
