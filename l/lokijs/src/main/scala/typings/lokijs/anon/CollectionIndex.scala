package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionIndex extends js.Object {
  
  var collectionIndex: js.UndefOr[Double] = js.native
  
  var delimited: js.UndefOr[Boolean] = js.native
  
  var delimiter: js.UndefOr[String] = js.native
}
object CollectionIndex {
  
  @scala.inline
  def apply(): CollectionIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionIndex]
  }
  
  @scala.inline
  implicit class CollectionIndexOps[Self <: CollectionIndex] (val x: Self) extends AnyVal {
    
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
    def setCollectionIndex(value: Double): Self = this.set("collectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionIndex: Self = this.set("collectionIndex", js.undefined)
    
    @scala.inline
    def setDelimited(value: Boolean): Self = this.set("delimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimited: Self = this.set("delimited", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
  }
}
