package typings.jsreportCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentStore extends js.Object {
  
  def collection(name: String): Collection = js.native
}
object DocumentStore {
  
  @scala.inline
  def apply(collection: String => Collection): DocumentStore = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection))
    __obj.asInstanceOf[DocumentStore]
  }
  
  @scala.inline
  implicit class DocumentStoreOps[Self <: DocumentStore] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: String => Collection): Self = this.set("collection", js.Any.fromFunction1(value))
  }
}
