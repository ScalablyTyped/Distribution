package typings.ioredis.anon

import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRedis extends StObject {
  
  /**
    * Create a Redis instance.
    * This is the same as `new Redis()` but is included for compatibility with node-redis.
    */
  /* static member */
  def createClient(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Redis> is not an array type */ args: ConstructorParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Redis */ js.Any
    ]
  ): typings.ioredis.redisMod.Redis
  
  /**
    * Default options
    */
  /* static member */
  var defaultOptions: Any
}
object TypeofRedis {
  
  inline def apply(
    createClient: ConstructorParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Redis */ js.Any
    ] => typings.ioredis.redisMod.Redis,
    defaultOptions: Any
  ): TypeofRedis = {
    val __obj = js.Dynamic.literal(createClient = js.Any.fromFunction1(createClient), defaultOptions = defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRedis]
  }
  
  extension [Self <: TypeofRedis](x: Self) {
    
    inline def setCreateClient(
      value: ConstructorParameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof Redis */ js.Any
        ] => typings.ioredis.redisMod.Redis
    ): Self = StObject.set(x, "createClient", js.Any.fromFunction1(value))
    
    inline def setDefaultOptions(value: Any): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
  }
}
