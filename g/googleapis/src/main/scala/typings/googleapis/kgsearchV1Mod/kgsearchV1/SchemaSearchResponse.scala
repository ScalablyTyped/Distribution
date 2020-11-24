package typings.googleapis.kgsearchV1Mod.kgsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message includes the context and a list of matching results which
  * contain the detail of associated entities.
  */
@js.native
trait SchemaSearchResponse extends js.Object {
  
  /**
    * The local context applicable for the response. See more details at
    * http://www.w3.org/TR/json-ld/#context-definitions.
    */
  var `@context`: js.UndefOr[js.Any] = js.native
  
  /**
    * The schema type of top-level JSON-LD object, e.g. ItemList.
    */
  var `@type`: js.UndefOr[js.Any] = js.native
  
  /**
    * The item list of search results.
    */
  var itemListElement: js.UndefOr[js.Array[_]] = js.native
}
object SchemaSearchResponse {
  
  @scala.inline
  def apply(): SchemaSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchResponseOps[Self <: SchemaSearchResponse] (val x: Self) extends AnyVal {
    
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
    def `set@context`(value: js.Any): Self = this.set("@context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete@context`: Self = this.set("@context", js.undefined)
    
    @scala.inline
    def `set@type`(value: js.Any): Self = this.set("@type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete@type`: Self = this.set("@type", js.undefined)
    
    @scala.inline
    def setItemListElementVarargs(value: js.Any*): Self = this.set("itemListElement", js.Array(value :_*))
    
    @scala.inline
    def setItemListElement(value: js.Array[_]): Self = this.set("itemListElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemListElement: Self = this.set("itemListElement", js.undefined)
  }
}
