package typings.ioredisMock

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.ioredis.builtClusterClusterOptionsMod.ClusterOptions
import typings.ioredis.builtClusterMod.ClusterNode
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Redis
import typings.ioredisMock.anon.OmitRedisOptionsporthostp
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("ioredis-mock", JSImport.Default)
  @js.native
  open class default () extends Redis {
    def this(options: RedisOptions) = this()
    def this(path: String) = this()
    def this(port: Double) = this()
    def this(path: String, options: RedisOptions) = this()
    def this(port: Double, host: String) = this()
    def this(port: Double, options: RedisOptions) = this()
    def this(port: Double, host: String, options: RedisOptions) = this()
  }
  object default extends Shortcut {
    
    @JSImport("ioredis-mock", JSImport.Default)
    @js.native
    val ^ : js.Object & Constructor = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ioredis-mock", "default.Cluster")
    @js.native
    open class Cluster protected ()
      extends typings.ioredis.mod.Cluster {
      def this(startupNodes: js.Array[ClusterNode]) = this()
      def this(startupNodes: js.Array[ClusterNode], options: RedisClusterOptions) = this()
    }
    
    type _To = js.Object & Constructor
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: js.Object & Constructor = ^
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("ioredis-mock", "redisMock")
  @js.native
  open class redisMock () extends Redis {
    def this(options: RedisOptions) = this()
    def this(path: String) = this()
    def this(port: Double) = this()
    def this(path: String, options: RedisOptions) = this()
    def this(port: Double, host: String) = this()
    def this(port: Double, options: RedisOptions) = this()
    def this(port: Double, host: String, options: RedisOptions) = this()
  }
  object redisMock extends Shortcut {
    
    @JSImport("ioredis-mock", "redisMock")
    @js.native
    val ^ : js.Object & Constructor = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ioredis-mock", "redisMock.Cluster")
    @js.native
    open class Cluster protected ()
      extends typings.ioredis.mod.Cluster {
      def this(startupNodes: js.Array[ClusterNode]) = this()
      def this(startupNodes: js.Array[ClusterNode], options: RedisClusterOptions) = this()
    }
    
    type _To = js.Object & Constructor
    
    /* This means you don't have to write `^`, but can instead just say `redisMock.foo` */
    override def _to: js.Object & Constructor = ^
  }
  
  @js.native
  trait ClusterConstructor
    extends StObject
       with Instantiable1[/* startupNodes */ js.Array[ClusterNode], Cluster]
       with Instantiable2[/* startupNodes */ js.Array[ClusterNode], /* options */ RedisClusterOptions, Cluster]
  
  @js.native
  trait Constructor
    extends StObject
       with Instantiable0[Redis]
       with Instantiable1[(/* port */ Double) | (/* options */ RedisOptions) | (/* path */ String), Redis]
       with Instantiable2[
          (/* port */ Double) | (/* path */ String), 
          (/* options */ RedisOptions) | (/* host */ String), 
          Redis
        ]
       with Instantiable3[/* port */ Double, /* host */ String, /* options */ RedisOptions, Redis] {
    
    var Cluster: ClusterConstructor = js.native
  }
  
  trait RedisClusterOptions
    extends StObject
       with ClusterOptions {
    
    @JSName("redisOptions")
    var redisOptions_RedisClusterOptions: OmitRedisOptionsporthostp
  }
  object RedisClusterOptions {
    
    inline def apply(redisOptions: OmitRedisOptionsporthostp): RedisClusterOptions = {
      val __obj = js.Dynamic.literal(redisOptions = redisOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedisClusterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisClusterOptions] (val x: Self) extends AnyVal {
      
      inline def setRedisOptions(value: OmitRedisOptionsporthostp): Self = StObject.set(x, "redisOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait RedisOptions
    extends StObject
       with typings.ioredis.builtRedisRedisOptionsMod.RedisOptions {
    
    var data: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object RedisOptions {
    
    inline def apply(): RedisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
}
