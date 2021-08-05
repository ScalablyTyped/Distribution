package typings.karmaJasmine

import typings.karmaJasmine.anon.EnvConfigurationtimeoutIn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ClientOptions extends StObject {
    
    var jasmine: js.UndefOr[EnvConfigurationtimeoutIn] = js.undefined
    
    /**
      * run a subset of the full set of specs.
      * Complete sharding support needs to be done in the process that calls karma,
      * and would need to support test result integration across shards.
      * See {@link https://github.com/karma-runner/karma-jasmine#sharding}
      *
      */
    var shardIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * run a subset of the full set of specs.
      * Complete sharding support needs to be done in the process that calls karma,
      * and would need to support test result integration across shards.
      * See {@link https://github.com/karma-runner/karma-jasmine#sharding}
      */
    var totalShards: js.UndefOr[Double] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setJasmine(value: EnvConfigurationtimeoutIn): Self = StObject.set(x, "jasmine", value.asInstanceOf[js.Any])
      
      inline def setJasmineUndefined: Self = StObject.set(x, "jasmine", js.undefined)
      
      inline def setShardIndex(value: Double): Self = StObject.set(x, "shardIndex", value.asInstanceOf[js.Any])
      
      inline def setShardIndexUndefined: Self = StObject.set(x, "shardIndex", js.undefined)
      
      inline def setTotalShards(value: Double): Self = StObject.set(x, "totalShards", value.asInstanceOf[js.Any])
      
      inline def setTotalShardsUndefined: Self = StObject.set(x, "totalShards", js.undefined)
    }
  }
}
