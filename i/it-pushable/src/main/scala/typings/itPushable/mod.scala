package typings.itPushable

import typings.itPushable.anon.ByteLength
import typings.itPushable.anon.Done
import typings.itPushable.distSrcFifoMod.Next
import typings.itPushable.itPushableBooleans.`false`
import typings.itPushable.itPushableBooleans.`true`
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pushable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pushable[T /* <: ByteLength */](): Pushable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushable")().asInstanceOf[Pushable_[T]]
  inline def pushable[T /* <: ByteLength */](options: BytePushableOptions): Pushable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushable")(options.asInstanceOf[js.Any]).asInstanceOf[Pushable_[T]]
  inline def pushable[T](options: ObjectPushableOptions): Pushable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushable")(options.asInstanceOf[js.Any]).asInstanceOf[Pushable_[T]]
  
  inline def pushableV[T /* <: ByteLength */](): PushableV_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushableV")().asInstanceOf[PushableV_[T]]
  inline def pushableV[T /* <: ByteLength */](options: BytePushableOptions): PushableV_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushableV")(options.asInstanceOf[js.Any]).asInstanceOf[PushableV_[T]]
  inline def pushableV[T](options: ObjectPushableOptions): PushableV_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushableV")(options.asInstanceOf[js.Any]).asInstanceOf[PushableV_[T]]
  
  @js.native
  trait BasePushable[T] extends StObject {
    
    def end(): this.type = js.native
    def end(err: js.Error): this.type = js.native
    
    def next(): js.Promise[Next[T]] = js.native
    
    def push(value: T): this.type = js.native
    
    /**
      * This property contains the number of bytes (or objects) in the queue ready to be read
      */
    var readableLength: Double = js.native
    
    def `return`(): Done = js.native
    
    def `throw`(err: js.Error): Done = js.native
  }
  
  trait BytePushableOptions
    extends StObject
       with Options {
    
    @JSName("objectMode")
    var objectMode_BytePushableOptions: js.UndefOr[`false`] = js.undefined
  }
  object BytePushableOptions {
    
    inline def apply(): BytePushableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BytePushableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BytePushableOptions] (val x: Self) extends AnyVal {
      
      inline def setObjectMode(value: `false`): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  trait ObjectPushableOptions
    extends StObject
       with Options {
    
    @JSName("objectMode")
    var objectMode_ObjectPushableOptions: `true`
  }
  object ObjectPushableOptions {
    
    inline def apply(): ObjectPushableOptions = {
      val __obj = js.Dynamic.literal(objectMode = true)
      __obj.asInstanceOf[ObjectPushableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectPushableOptions] (val x: Self) extends AnyVal {
      
      inline def setObjectMode(value: `true`): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setOnEnd(value: /* err */ js.UndefOr[js.Error] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    }
  }
  
  @js.native
  trait PushableV_[T]
    extends StObject
       with AsyncIterable[js.Array[T]]
       with BasePushable[T]
  
  @js.native
  trait Pushable_[T]
    extends StObject
       with AsyncIterable[T]
       with BasePushable[T]
}
