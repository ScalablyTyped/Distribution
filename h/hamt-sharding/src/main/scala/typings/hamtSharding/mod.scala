package typings.hamtSharding

import typings.hamtSharding.distSrcBucketMod.BucketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hamt-sharding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hamt-sharding", "Bucket")
  @js.native
  open class Bucket[T] protected ()
    extends typings.hamtSharding.distSrcBucketMod.Bucket[T] {
    def this(options: BucketOptions) = this()
    def this(options: BucketOptions, parent: typings.hamtSharding.distSrcBucketMod.Bucket[T]) = this()
    def this(options: BucketOptions, parent: Unit, posAtParent: Double) = this()
    def this(
      options: BucketOptions,
      parent: typings.hamtSharding.distSrcBucketMod.Bucket[T],
      posAtParent: Double
    ) = this()
  }
  
  inline def createHAMT[T](options: UserBucketOptions): typings.hamtSharding.distSrcBucketMod.Bucket[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHAMT")(options.asInstanceOf[js.Any]).asInstanceOf[typings.hamtSharding.distSrcBucketMod.Bucket[T]]
  
  trait UserBucketOptions extends StObject {
    
    var bits: js.UndefOr[Double] = js.undefined
    
    def hashFn(value: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array]
  }
  object UserBucketOptions {
    
    inline def apply(hashFn: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): UserBucketOptions = {
      val __obj = js.Dynamic.literal(hashFn = js.Any.fromFunction1(hashFn))
      __obj.asInstanceOf[UserBucketOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserBucketOptions] (val x: Self) extends AnyVal {
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      inline def setHashFn(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "hashFn", js.Any.fromFunction1(value))
    }
  }
}
