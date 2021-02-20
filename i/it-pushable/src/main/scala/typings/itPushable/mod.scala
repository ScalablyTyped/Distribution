package typings.itPushable

import typings.itPushable.itPushableBooleans.`false`
import typings.itPushable.itPushableBooleans.`true`
import typings.std.AsyncIterable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pushable", JSImport.Default)
  @js.native
  def default[T](): Pushable[T] = js.native
  @JSImport("it-pushable", JSImport.Default)
  @js.native
  def default[T](options: Options): Pushable[T] = js.native
  @JSImport("it-pushable", JSImport.Default)
  @js.native
  def default[T](options: OptionsV): PushableV[T] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], Unit]] = js.native
    
    var writev: js.UndefOr[`false`] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnEnd(value: /* err */ js.UndefOr[Error] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setWritev(value: `false`): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  @js.native
  trait OptionsV extends StObject {
    
    var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], Unit]] = js.native
    
    var writev: `true` = js.native
  }
  object OptionsV {
    
    @scala.inline
    def apply(writev: `true`): OptionsV = {
      val __obj = js.Dynamic.literal(writev = writev.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsV]
    }
    
    @scala.inline
    implicit class OptionsVMutableBuilder[Self <: OptionsV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnEnd(value: /* err */ js.UndefOr[Error] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setWritev(value: `true`): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pushable[T] extends AsyncIterable[T] {
    
    def end(): this.type = js.native
    def end(err: Error): this.type = js.native
    
    def push(value: T): this.type = js.native
  }
  
  @js.native
  trait PushableV[T]
    extends AsyncIterable[js.Array[T]] {
    
    def end(): this.type = js.native
    def end(err: Error): this.type = js.native
    
    def push(value: T): this.type = js.native
  }
}
