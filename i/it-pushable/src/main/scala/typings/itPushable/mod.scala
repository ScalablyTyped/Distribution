package typings.itPushable

import typings.itPushable.anon.ByteLength
import typings.itPushable.itPushableBooleans.`false`
import typings.itPushable.itPushableBooleans.`true`
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pushable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pushable[T /* <: ByteLength */](): Pushable_[T, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushable")().asInstanceOf[Pushable_[T, Unit, Any]]
  inline def pushable[T /* <: ByteLength */](options: BytePushableOptions): Pushable_[T, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushable")(options.asInstanceOf[js.Any]).asInstanceOf[Pushable_[T, Unit, Any]]
  inline def pushable[T](options: ObjectPushableOptions): Pushable_[T, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushable")(options.asInstanceOf[js.Any]).asInstanceOf[Pushable_[T, Unit, Any]]
  
  inline def pushableV[T /* <: ByteLength */](): PushableV_[T, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushableV")().asInstanceOf[PushableV_[T, Unit, Any]]
  inline def pushableV[T /* <: ByteLength */](options: BytePushableOptions): PushableV_[T, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushableV")(options.asInstanceOf[js.Any]).asInstanceOf[PushableV_[T, Unit, Any]]
  inline def pushableV[T](options: ObjectPushableOptions): PushableV_[T, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushableV")(options.asInstanceOf[js.Any]).asInstanceOf[PushableV_[T, Unit, Any]]
  
  @js.native
  trait BasePushable[T] extends StObject {
    
    /**
      * End the iterable after all values in the buffer (if any) have been yielded. If an
      * error is passed the buffer is cleared immediately and the next iteration will
      * throw the passed error
      */
    def end(): this.type = js.native
    def end(err: js.Error): this.type = js.native
    
    /**
      * Push a value into the iterable. Values are yielded from the iterable in the order
      * they are pushed. Values not yet consumed from the iterable are buffered.
      */
    def push(value: T): this.type = js.native
    
    /**
      * This property contains the number of bytes (or objects) in the queue ready to be read.
      *
      * If `objectMode` is true, this is the number of objects in the queue, if false it's the
      * total number of bytes in the queue.
      */
    var readableLength: Double = js.native
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
    
    /**
      * A boolean value that means non-`Uint8Array`s will be passed to `.push`, default: `false`
      */
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function called after *all* values have been yielded from the iterator (including
      * buffered values). In the case when the iterator is ended with an error it will be
      * passed the error as a parameter.
      */
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
  trait PushableV_[T, R, N]
    extends StObject
       with AsyncGenerator[js.Array[T], R, N]
       with BasePushable[T]
  
  @js.native
  trait Pushable_[T, R, N]
    extends StObject
       with AsyncGenerator[T, R, N]
       with BasePushable[T]
}
