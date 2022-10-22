package typings.koaMongo

import typings.genericPool.mod.Options
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.MongoClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(connOptions: Unit, confOptions: MongoClientOptions): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(connOptions.asInstanceOf[js.Any], confOptions.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(connOptions: ConnectionOptions): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(connOptions.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(connOptions: ConnectionOptions, confOptions: MongoClientOptions): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(connOptions.asInstanceOf[js.Any], confOptions.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-mongo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ConnectionOptions
    extends StObject
       with Options {
    
    var authSource: js.UndefOr[String] = js.undefined
    
    var db: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setAuthSource(value: String): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
      
      inline def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
      
      inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait BaseContext extends StObject {
      
      var db: Db
      
      var mongo: MongoClient
    }
    object BaseContext {
      
      inline def apply(db: Db, mongo: MongoClient): BaseContext = {
        val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], mongo = mongo.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseContext]
      }
      
      extension [Self <: BaseContext](x: Self) {
        
        inline def setDb(value: Db): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
        
        inline def setMongo(value: MongoClient): Self = StObject.set(x, "mongo", value.asInstanceOf[js.Any])
      }
    }
  }
}
