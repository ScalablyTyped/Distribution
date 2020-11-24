package typings.koa2Ratelimit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<koa2-ratelimit.koa2-ratelimit/src/MongodbStore.MongodbStoreOptions> */
@js.native
trait PartialMongodbStoreOption extends js.Object {
  
  var collectionAbuseName: js.UndefOr[String] = js.native
  
  var collectionName: js.UndefOr[String] = js.native
}
object PartialMongodbStoreOption {
  
  @scala.inline
  def apply(): PartialMongodbStoreOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMongodbStoreOption]
  }
  
  @scala.inline
  implicit class PartialMongodbStoreOptionOps[Self <: PartialMongodbStoreOption] (val x: Self) extends AnyVal {
    
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
    def setCollectionAbuseName(value: String): Self = this.set("collectionAbuseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionAbuseName: Self = this.set("collectionAbuseName", js.undefined)
    
    @scala.inline
    def setCollectionName(value: String): Self = this.set("collectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionName: Self = this.set("collectionName", js.undefined)
  }
}
