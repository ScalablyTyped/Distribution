package typings.koa2Ratelimit.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.koa2Ratelimit.mongodbStoreMod.^
import typings.koa2Ratelimit.sequelizeStoreMod.SequelizeStoreOptions
import typings.mongoose.mod.Connection_
import typings.redis.mod.ClientOpts
import typings.sequelize.mod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Memory extends js.Object {
  
  var Memory: TypeofMemoryStore = js.native
  
  var Mongodb: Instantiable2[/* mongodb */ Connection_, /* options */ js.UndefOr[PartialMongodbStoreOption], ^] = js.native
  
  var Redis: Instantiable1[/* config */ js.UndefOr[ClientOpts], typings.koa2Ratelimit.redisStoreMod.^] = js.native
  
  var Sequelize: Instantiable2[
    /* sequelize */ typings.sequelize.mod.Sequelize, 
    /* options */ js.UndefOr[SequelizeStoreOptions], 
    typings.koa2Ratelimit.sequelizeStoreMod.^
  ] = js.native
  
  var Store: Instantiable0[typings.koa2Ratelimit.storeMod.^] = js.native
}
object Memory {
  
  @scala.inline
  def apply(
    Memory: TypeofMemoryStore,
    Mongodb: Instantiable2[/* mongodb */ Connection_, /* options */ js.UndefOr[PartialMongodbStoreOption], ^],
    Redis: Instantiable1[/* config */ js.UndefOr[ClientOpts], typings.koa2Ratelimit.redisStoreMod.^],
    Sequelize: Instantiable2[
      /* sequelize */ Sequelize, 
      /* options */ js.UndefOr[SequelizeStoreOptions], 
      typings.koa2Ratelimit.sequelizeStoreMod.^
    ],
    Store: Instantiable0[typings.koa2Ratelimit.storeMod.^]
  ): Memory = {
    val __obj = js.Dynamic.literal(Memory = Memory.asInstanceOf[js.Any], Mongodb = Mongodb.asInstanceOf[js.Any], Redis = Redis.asInstanceOf[js.Any], Sequelize = Sequelize.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Memory]
  }
  
  @scala.inline
  implicit class MemoryOps[Self <: Memory] (val x: Self) extends AnyVal {
    
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
    def setMemory(value: TypeofMemoryStore): Self = this.set("Memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMongodb(
      value: Instantiable2[/* mongodb */ Connection_, /* options */ js.UndefOr[PartialMongodbStoreOption], ^]
    ): Self = this.set("Mongodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedis(value: Instantiable1[/* config */ js.UndefOr[ClientOpts], typings.koa2Ratelimit.redisStoreMod.^]): Self = this.set("Redis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequelize(
      value: Instantiable2[
          /* sequelize */ Sequelize, 
          /* options */ js.UndefOr[SequelizeStoreOptions], 
          typings.koa2Ratelimit.sequelizeStoreMod.^
        ]
    ): Self = this.set("Sequelize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: Instantiable0[typings.koa2Ratelimit.storeMod.^]): Self = this.set("Store", value.asInstanceOf[js.Any])
  }
}
