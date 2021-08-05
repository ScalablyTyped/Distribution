package typings.itPushable

import typings.itPushable.itPushableBooleans.`false`
import typings.itPushable.itPushableBooleans.`true`
import typings.std.AsyncIterable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pushable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): Pushable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Pushable[T]]
  inline def default[T](options: Options): Pushable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Pushable[T]]
  inline def default[T](options: OptionsV): PushableV[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[PushableV[T]]
  
  trait Options extends StObject {
    
    var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], Unit]] = js.undefined
    
    var writev: js.UndefOr[`false`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnEnd(value: /* err */ js.UndefOr[Error] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setWritev(value: `false`): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      inline def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  trait OptionsV extends StObject {
    
    var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], Unit]] = js.undefined
    
    var writev: `true`
  }
  object OptionsV {
    
    inline def apply(): OptionsV = {
      val __obj = js.Dynamic.literal(writev = true)
      __obj.asInstanceOf[OptionsV]
    }
    
    extension [Self <: OptionsV](x: Self) {
      
      inline def setOnEnd(value: /* err */ js.UndefOr[Error] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setWritev(value: `true`): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pushable[T]
    extends StObject
       with AsyncIterable[T] {
    
    def end(): this.type = js.native
    def end(err: Error): this.type = js.native
    
    def push(value: T): this.type = js.native
  }
  
  @js.native
  trait PushableV[T]
    extends StObject
       with AsyncIterable[js.Array[T]] {
    
    def end(): this.type = js.native
    def end(err: Error): this.type = js.native
    
    def push(value: T): this.type = js.native
  }
}
