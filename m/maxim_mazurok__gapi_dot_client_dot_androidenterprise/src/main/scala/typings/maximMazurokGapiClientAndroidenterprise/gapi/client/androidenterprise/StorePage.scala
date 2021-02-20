package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorePage extends StObject {
  
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
  implicit class StorePageMutableBuilder[Self <: StorePage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLink(value: js.Array[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: String*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[LocalizedText]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: LocalizedText*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
