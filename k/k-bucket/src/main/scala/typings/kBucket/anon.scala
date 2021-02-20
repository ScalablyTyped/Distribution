package typings.kBucket

import typings.kBucket.mod.Arbiter_
import typings.kBucket.mod.Contact
import typings.kBucket.mod.Distance_
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Arbiter[T /* <: Contact */] extends StObject {
    
    var arbiter: js.UndefOr[Arbiter_[T]] = js.native
    
    var distance: js.UndefOr[Distance_] = js.native
    
    var localNodeId: js.UndefOr[Uint8Array] = js.native
    
    var metadata: js.UndefOr[js.Any] = js.native
    
    var numberOfNodesPerKBucket: js.UndefOr[Double] = js.native
    
    var numberOfNodesToPing: js.UndefOr[Double] = js.native
  }
  object Arbiter {
    
    @scala.inline
    def apply[T /* <: Contact */](): Arbiter[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Arbiter[T]]
    }
    
    @scala.inline
    implicit class ArbiterMutableBuilder[Self <: Arbiter[_], T /* <: Contact */] (val x: Self with Arbiter[T]) extends AnyVal {
      
      @scala.inline
      def setArbiter(value: (T, T) => T): Self = StObject.set(x, "arbiter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setArbiterUndefined: Self = StObject.set(x, "arbiter", js.undefined)
      
      @scala.inline
      def setDistance(value: (/* firstId */ Uint8Array, /* secondId */ Uint8Array) => Double): Self = StObject.set(x, "distance", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setLocalNodeId(value: Uint8Array): Self = StObject.set(x, "localNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalNodeIdUndefined: Self = StObject.set(x, "localNodeId", js.undefined)
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setNumberOfNodesPerKBucket(value: Double): Self = StObject.set(x, "numberOfNodesPerKBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfNodesPerKBucketUndefined: Self = StObject.set(x, "numberOfNodesPerKBucket", js.undefined)
      
      @scala.inline
      def setNumberOfNodesToPing(value: Double): Self = StObject.set(x, "numberOfNodesToPing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfNodesToPingUndefined: Self = StObject.set(x, "numberOfNodesToPing", js.undefined)
    }
  }
}
