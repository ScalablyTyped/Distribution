package typings.hashring

import typings.hashring.hashringStrings.hash_ring
import typings.hashring.hashringStrings.ketama
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<hashring.hashring.HashRingOptions> */
  trait PartialHashRingOptions extends StObject {
    
    var compatibility: js.UndefOr[hash_ring | ketama] = js.undefined
    
    var `default port`: js.UndefOr[Double] = js.undefined
    
    var `max cache size`: js.UndefOr[Double] = js.undefined
    
    var replicas: js.UndefOr[Double] = js.undefined
    
    var `vnode count`: js.UndefOr[Double] = js.undefined
  }
  object PartialHashRingOptions {
    
    inline def apply(): PartialHashRingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHashRingOptions]
    }
    
    extension [Self <: PartialHashRingOptions](x: Self) {
      
      inline def setCompatibility(value: hash_ring | ketama): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
      
      inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
      
      inline def `setDefault port`(value: Double): Self = StObject.set(x, "default port", value.asInstanceOf[js.Any])
      
      inline def `setDefault portUndefined`: Self = StObject.set(x, "default port", js.undefined)
      
      inline def `setMax cache size`(value: Double): Self = StObject.set(x, "max cache size", value.asInstanceOf[js.Any])
      
      inline def `setMax cache sizeUndefined`: Self = StObject.set(x, "max cache size", js.undefined)
      
      inline def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
      
      inline def `setVnode count`(value: Double): Self = StObject.set(x, "vnode count", value.asInstanceOf[js.Any])
      
      inline def `setVnode countUndefined`: Self = StObject.set(x, "vnode count", js.undefined)
    }
  }
  
  /* Inlined std.Partial<hashring.hashring.ServerConfig> */
  trait PartialServerConfig extends StObject {
    
    var vnodes: js.UndefOr[Double] = js.undefined
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object PartialServerConfig {
    
    inline def apply(): PartialServerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServerConfig]
    }
    
    extension [Self <: PartialServerConfig](x: Self) {
      
      inline def setVnodes(value: Double): Self = StObject.set(x, "vnodes", value.asInstanceOf[js.Any])
      
      inline def setVnodesUndefined: Self = StObject.set(x, "vnodes", js.undefined)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
}
