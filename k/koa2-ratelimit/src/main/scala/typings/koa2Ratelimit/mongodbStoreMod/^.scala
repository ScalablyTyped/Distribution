package typings.koa2Ratelimit.mongodbStoreMod

import typings.koa2Ratelimit.anon.PartialMongodbStoreOption
import typings.mongoose.mod.Connection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa2-ratelimit/src/MongodbStore", JSImport.Namespace)
@js.native
class ^ protected () extends MongodbStore {
  def this(mongodb: Connection_) = this()
  def this(mongodb: Connection_, options: PartialMongodbStoreOption) = this()
}
