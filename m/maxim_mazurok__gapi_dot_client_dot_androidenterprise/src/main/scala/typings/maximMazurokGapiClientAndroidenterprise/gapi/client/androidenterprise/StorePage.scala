package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorePage extends js.Object {
  
  /** Unique ID of this page. Assigned by the server. Immutable once assigned. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Ordered list of pages a user should be able to reach from this page. The list can't include this page. It is recommended that the basic pages are created first, before adding the
    * links between pages. The API doesn't verify that the pages exist or the pages are reachable.
    */
  var link: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Ordered list of localized strings giving the name of this page. The text displayed is the one that best matches the user locale, or the first entry if there is no good match. There
    * needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[LocalizedText]] = js.native
}
object StorePage {
  
  @scala.inline
  def apply(): StorePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorePage]
  }
  
  @scala.inline
  implicit class StorePageOps[Self <: StorePage] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: String*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[String]): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: LocalizedText*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[LocalizedText]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
