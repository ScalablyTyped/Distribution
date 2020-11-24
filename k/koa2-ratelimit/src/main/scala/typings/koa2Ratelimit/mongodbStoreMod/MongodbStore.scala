package typings.koa2Ratelimit.mongodbStoreMod

import typings.koa2Ratelimit.anon.Counter
import typings.koa2Ratelimit.anon.RateLimitOptionskeystring
import typings.koa2Ratelimit.mod.RateLimitOptions
import typings.koa2Ratelimit.storeMod.Store
import typings.mongoose.mod.Model_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongodbStore extends Store {
  
  var Abuse: Model_[_, js.Object] = js.native
  
  var Ratelimits: Model_[_, js.Object] = js.native
  
  var collectionAbuseName: String = js.native
  
  var collectionName: String = js.native
}
object MongodbStore {
  
  @scala.inline
  def apply(
    Abuse: Model_[_, js.Object],
    Ratelimits: Model_[_, js.Object],
    collectionAbuseName: String,
    collectionName: String,
    decrement: (String, RateLimitOptions, Double) => js.Promise[Unit],
    incr: (String, RateLimitOptions, Double) => js.Promise[Counter],
    saveAbuse: RateLimitOptionskeystring => js.Promise[Unit] | Unit
  ): MongodbStore = {
    val __obj = js.Dynamic.literal(Abuse = Abuse.asInstanceOf[js.Any], Ratelimits = Ratelimits.asInstanceOf[js.Any], collectionAbuseName = collectionAbuseName.asInstanceOf[js.Any], collectionName = collectionName.asInstanceOf[js.Any], decrement = js.Any.fromFunction3(decrement), incr = js.Any.fromFunction3(incr), saveAbuse = js.Any.fromFunction1(saveAbuse))
    __obj.asInstanceOf[MongodbStore]
  }
  
  @scala.inline
  implicit class MongodbStoreOps[Self <: MongodbStore] (val x: Self) extends AnyVal {
    
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
    def setAbuse(value: Model_[_, js.Object]): Self = this.set("Abuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatelimits(value: Model_[_, js.Object]): Self = this.set("Ratelimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionAbuseName(value: String): Self = this.set("collectionAbuseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionName(value: String): Self = this.set("collectionName", value.asInstanceOf[js.Any])
  }
}
