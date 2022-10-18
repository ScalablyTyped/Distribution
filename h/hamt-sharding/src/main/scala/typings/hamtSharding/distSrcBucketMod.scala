package typings.hamtSharding

import typings.hamtSharding.distSrcConsumableHashMod.InfiniteHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBucketMod {
  
  @JSImport("hamt-sharding/dist/src/bucket", "Bucket")
  @js.native
  open class Bucket[T] protected () extends StObject {
    def this(options: BucketOptions) = this()
    def this(options: BucketOptions, parent: Bucket[T]) = this()
    def this(options: BucketOptions, parent: Unit, posAtParent: Double) = this()
    def this(options: BucketOptions, parent: Bucket[T], posAtParent: Double) = this()
    
    def _at(index: Double): Bucket[T] | BucketChild[T] = js.native
    
    var _children: SA[Bucket[T] | BucketChild[T]] = js.native
    
    def _delAt(pos: Double): Unit = js.native
    
    def _findChild(key: String): js.Promise[js.UndefOr[BucketChild[T]]] = js.native
    
    def _findNewBucketAndPos(key: String): js.Promise[BucketPosition[T]] = js.native
    def _findNewBucketAndPos(key: InfiniteHash): js.Promise[BucketPosition[T]] = js.native
    
    def _findPlace(key: String): js.Promise[BucketPosition[T]] = js.native
    def _findPlace(key: InfiniteHash): js.Promise[BucketPosition[T]] = js.native
    
    def _level(): Unit = js.native
    
    var _options: BucketOptions = js.native
    
    var _parent: js.UndefOr[Bucket[T]] = js.native
    
    var _popCount: Double = js.native
    
    var _posAtParent: Double = js.native
    
    def _putAt(place: BucketPosition[T], key: String, value: T): Unit = js.native
    
    def _putObjectAt(pos: Double, `object`: Bucket[T]): Unit = js.native
    def _putObjectAt(pos: Double, `object`: BucketChild[T]): Unit = js.native
    
    def asyncTransform(
      asyncMap: js.Function1[/* value */ BucketChild[T], js.Promise[js.Array[T]]],
      asyncReduce: js.Function1[/* reduced */ Any, js.Promise[Any]]
    ): js.Promise[Any] = js.native
    
    def childrenCount(): Double = js.native
    
    def del(key: String): js.Promise[Unit] = js.native
    
    def eachLeafSeries(): js.Iterable[BucketChild[T]] = js.native
    
    def get(key: String): js.Promise[js.UndefOr[T]] = js.native
    
    var key: String | Null = js.native
    
    def leafCount(): Double = js.native
    
    def onlyChild(): Bucket[T] | BucketChild[T] = js.native
    
    def prettyPrint(): String = js.native
    
    def put(key: String, value: T): js.Promise[Unit] = js.native
    
    def serialize(
      map: js.Function2[/* value */ BucketChild[T], /* index */ Double, T],
      reduce: js.Function1[/* reduced */ Any, Any]
    ): Any = js.native
    
    def tableSize(): Double = js.native
    
    def toJSON(): Any = js.native
  }
  
  trait BucketChild[V] extends StObject {
    
    var hash: InfiniteHash
    
    var key: String
    
    var value: V
  }
  object BucketChild {
    
    inline def apply[V](hash: InfiniteHash, key: String, value: V): BucketChild[V] = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketChild[V]]
    }
    
    extension [Self <: BucketChild[?], V](x: Self & BucketChild[V]) {
      
      inline def setHash(value: InfiniteHash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BucketOptions extends StObject {
    
    var bits: Double = js.native
    
    def hash(value: js.typedarray.Uint8Array): InfiniteHash = js.native
    def hash(value: InfiniteHash): InfiniteHash = js.native
  }
  
  trait BucketPosition[T] extends StObject {
    
    var bucket: Bucket[T]
    
    var existingChild: js.UndefOr[BucketChild[T]] = js.undefined
    
    var hash: InfiniteHash
    
    var pos: Double
  }
  object BucketPosition {
    
    inline def apply[T](bucket: Bucket[T], hash: InfiniteHash, pos: Double): BucketPosition[T] = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketPosition[T]]
    }
    
    extension [Self <: BucketPosition[?], T](x: Self & BucketPosition[T]) {
      
      inline def setBucket(value: Bucket[T]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setExistingChild(value: BucketChild[T]): Self = StObject.set(x, "existingChild", value.asInstanceOf[js.Any])
      
      inline def setExistingChildUndefined: Self = StObject.set(x, "existingChild", js.undefined)
      
      inline def setHash(value: InfiniteHash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait SA[B] extends StObject {
    
    def bitField(): js.Array[Double]
    
    def compactArray(): js.Array[B]
    
    def find(fn: js.Function1[/* item */ B, Boolean]): js.UndefOr[B]
    
    def get(i: Double): B
    
    var length: Double
    
    def reduce[A](fn: js.Function3[/* acc */ A, /* curr */ B, /* index */ Double, A], initial: A): B
    
    def set(i: Double, value: B): Unit
    
    def unset(i: Double): Unit
  }
  object SA {
    
    inline def apply[B](
      bitField: () => js.Array[Double],
      compactArray: () => js.Array[B],
      find: js.Function1[/* item */ B, Boolean] => js.UndefOr[B],
      get: Double => B,
      length: Double,
      reduce: (js.Function3[Any, /* curr */ B, /* index */ Double, Any], Any) => B,
      set: (Double, B) => Unit,
      unset: Double => Unit
    ): SA[B] = {
      val __obj = js.Dynamic.literal(bitField = js.Any.fromFunction0(bitField), compactArray = js.Any.fromFunction0(compactArray), find = js.Any.fromFunction1(find), get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce), set = js.Any.fromFunction2(set), unset = js.Any.fromFunction1(unset))
      __obj.asInstanceOf[SA[B]]
    }
    
    extension [Self <: SA[?], B](x: Self & SA[B]) {
      
      inline def setBitField(value: () => js.Array[Double]): Self = StObject.set(x, "bitField", js.Any.fromFunction0(value))
      
      inline def setCompactArray(value: () => js.Array[B]): Self = StObject.set(x, "compactArray", js.Any.fromFunction0(value))
      
      inline def setFind(value: js.Function1[/* item */ B, Boolean] => js.UndefOr[B]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setGet(value: Double => B): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setReduce(value: (js.Function3[Any, /* curr */ B, /* index */ Double, Any], Any) => B): Self = StObject.set(x, "reduce", js.Any.fromFunction2(value))
      
      inline def setSet(value: (Double, B) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setUnset(value: Double => Unit): Self = StObject.set(x, "unset", js.Any.fromFunction1(value))
    }
  }
}
