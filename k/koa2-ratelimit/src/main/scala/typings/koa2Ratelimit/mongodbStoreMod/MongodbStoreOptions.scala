package typings.koa2Ratelimit.mongodbStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongodbStoreOptions extends js.Object {
  
  var collectionAbuseName: String = js.native
  
  var collectionName: String = js.native
}
object MongodbStoreOptions {
  
  @scala.inline
  def apply(collectionAbuseName: String, collectionName: String): MongodbStoreOptions = {
    val __obj = js.Dynamic.literal(collectionAbuseName = collectionAbuseName.asInstanceOf[js.Any], collectionName = collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongodbStoreOptions]
  }
  
  @scala.inline
  implicit class MongodbStoreOptionsOps[Self <: MongodbStoreOptions] (val x: Self) extends AnyVal {
    
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
    def setCollectionName(value: String): Self = this.set("collectionName", value.asInstanceOf[js.Any])
  }
}
