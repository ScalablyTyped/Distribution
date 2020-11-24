package typings.googleapis.customsearchV1Mod.customsearchV1

import typings.googleapis.anon.Anchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaContext extends js.Object {
  
  var facets: js.UndefOr[js.Array[js.Array[Anchor]]] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SchemaContext {
  
  @scala.inline
  def apply(): SchemaContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContext]
  }
  
  @scala.inline
  implicit class SchemaContextOps[Self <: SchemaContext] (val x: Self) extends AnyVal {
    
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
    def setFacetsVarargs(value: js.Array[Anchor]*): Self = this.set("facets", js.Array(value :_*))
    
    @scala.inline
    def setFacets(value: js.Array[js.Array[Anchor]]): Self = this.set("facets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacets: Self = this.set("facets", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
