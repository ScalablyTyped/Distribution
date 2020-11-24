package typings.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUrlHistory extends js.Object {
  
  /**
    * A list of URL resources.
    */
  var items: js.UndefOr[js.Array[SchemaUrl]] = js.native
  
  /**
    * Number of items returned with each full &quot;page&quot; of results. Note
    * that the last page could have fewer items than the
    * &quot;itemsPerPage&quot; value.
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * The fixed string &quot;urlshortener#urlHistory&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A token to provide to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Total number of short URLs associated with this user (may be
    * approximate).
    */
  var totalItems: js.UndefOr[Double] = js.native
}
object SchemaUrlHistory {
  
  @scala.inline
  def apply(): SchemaUrlHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlHistory]
  }
  
  @scala.inline
  implicit class SchemaUrlHistoryOps[Self <: SchemaUrlHistory] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: SchemaUrl*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SchemaUrl]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
}
