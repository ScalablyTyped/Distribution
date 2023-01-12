package typings.kBucket

import typings.kBucket.mod.Arbiter_
import typings.kBucket.mod.Contact
import typings.kBucket.mod.Distance_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Arbiter[T /* <: Contact */] extends StObject {
    
    var arbiter: js.UndefOr[Arbiter_[T]] = js.undefined
    
    var distance: js.UndefOr[Distance_] = js.undefined
    
    var localNodeId: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var metadata: js.UndefOr[Any] = js.undefined
    
    var numberOfNodesPerKBucket: js.UndefOr[Double] = js.undefined
    
    var numberOfNodesToPing: js.UndefOr[Double] = js.undefined
  }
  object Arbiter {
    
    inline def apply[T /* <: Contact */](): Arbiter[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Arbiter[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Arbiter[?], T /* <: Contact */] (val x: Self & Arbiter[T]) extends AnyVal {
      
      inline def setArbiter(value: (T, T) => T): Self = StObject.set(x, "arbiter", js.Any.fromFunction2(value))
      
      inline def setArbiterUndefined: Self = StObject.set(x, "arbiter", js.undefined)
      
      inline def setDistance(value: (/* firstId */ js.typedarray.Uint8Array, /* secondId */ js.typedarray.Uint8Array) => Double): Self = StObject.set(x, "distance", js.Any.fromFunction2(value))
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setLocalNodeId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "localNodeId", value.asInstanceOf[js.Any])
      
      inline def setLocalNodeIdUndefined: Self = StObject.set(x, "localNodeId", js.undefined)
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNumberOfNodesPerKBucket(value: Double): Self = StObject.set(x, "numberOfNodesPerKBucket", value.asInstanceOf[js.Any])
      
      inline def setNumberOfNodesPerKBucketUndefined: Self = StObject.set(x, "numberOfNodesPerKBucket", js.undefined)
      
      inline def setNumberOfNodesToPing(value: Double): Self = StObject.set(x, "numberOfNodesToPing", value.asInstanceOf[js.Any])
      
      inline def setNumberOfNodesToPingUndefined: Self = StObject.set(x, "numberOfNodesToPing", js.undefined)
    }
  }
}
