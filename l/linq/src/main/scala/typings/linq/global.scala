package typings.linq

import typings.linq.anon.Dictx
import typings.linq.anon.Key
import typings.linq.mod.IEnumerable
import typings.linq.mod.IEnumerator
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Enumerable {
    
    @JSGlobal("Enumerable")
    @js.native
    val ^ : js.Any = js.native
    
    object Utils {
      
      @JSGlobal("Enumerable.Utils")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createEnumerable[T](getEnumerator: js.Function0[IEnumerator[T]]): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEnumerable")(getEnumerator.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[T]]
      
      inline def createEnumerator[T](initialize: js.Function0[Unit], tryGetNext: js.Function0[Boolean], dispose: js.Function0[Unit]): IEnumerator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnumerator")(initialize.asInstanceOf[js.Any], tryGetNext.asInstanceOf[js.Any], dispose.asInstanceOf[js.Any])).asInstanceOf[IEnumerator[T]]
      
      inline def createLambda(expression: js.Any): js.Function1[/* repeated */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLambda")(expression.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
      
      inline def extendTo(`type`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendTo")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def hasNativeIteratorSupport(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasNativeIteratorSupport")().asInstanceOf[Boolean]
      
      inline def recallFrom(`type`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("recallFrom")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    inline def choice[T](params: T*): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")(params.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[T]]
    
    inline def cycle[T](params: T*): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cycle")(params.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[T]]
    
    inline def defer[T](enumerableFactory: js.Function0[IEnumerable[T]]): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(enumerableFactory.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[T]]
    
    inline def empty[T](): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[IEnumerable[T]]
    
    inline def from(): IEnumerable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[IEnumerable[js.Any]]
    inline def from(obj: String): IEnumerable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[String]]
    inline def from(obj: js.Any): IEnumerable[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[Key]]
    inline def from(obj: Boolean): IEnumerable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[Boolean]]
    inline def from(obj: Double): IEnumerable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[Double]]
    inline def from[T](obj: js.Array[T]): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[T]]
    inline def from[T](obj: Dictx[T]): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[T]]
    inline def from[T](obj: IEnumerable[T]): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[T]]
    
    inline def generate[T](func: js.Function0[T]): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(func.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[T]]
    inline def generate[T](func: js.Function0[T], count: Double): IEnumerable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(func.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[T]]
    
    inline def make[T](element: T): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(element.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[T]]
    
    inline def matches[T](input: String, pattern: String): IEnumerable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(input.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[T]]
    inline def matches[T](input: String, pattern: String, flags: String): IEnumerable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(input.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[T]]
    inline def matches[T](input: String, pattern: RegExp): IEnumerable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(input.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[T]]
    
    inline def range(start: Double, count: Double): IEnumerable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[Double]]
    inline def range(start: Double, count: Double, step: Double): IEnumerable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[Double]]
    
    inline def rangeDown(start: Double, count: Double): IEnumerable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeDown")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[Double]]
    inline def rangeDown(start: Double, count: Double, step: Double): IEnumerable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeDown")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[Double]]
    
    inline def rangeTo(start: Double, to: Double): IEnumerable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeTo")(start.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[Double]]
    inline def rangeTo(start: Double, to: Double, step: Double): IEnumerable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeTo")(start.asInstanceOf[js.Any], to.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[Double]]
    
    inline def repeat[T](element: T): IEnumerable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(element.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[T]]
    inline def repeat[T](element: T, count: Double): IEnumerable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(element.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[T]]
    
    inline def repeatWithFinalize[T](initializer: js.Function0[T], finalizer: js.Function1[/* element */ T, Unit]): IEnumerable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeatWithFinalize")(initializer.asInstanceOf[js.Any], finalizer.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[T]]
    
    inline def toInfinity(): IEnumerable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toInfinity")().asInstanceOf[IEnumerable[Double]]
    inline def toInfinity(start: Double): IEnumerable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toInfinity")(start.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[Double]]
    inline def toInfinity(start: Double, step: Double): IEnumerable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toInfinity")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[Double]]
    inline def toInfinity(start: Unit, step: Double): IEnumerable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toInfinity")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[Double]]
    
    inline def toNegativeInfinity(): IEnumerable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toNegativeInfinity")().asInstanceOf[IEnumerable[Double]]
    inline def toNegativeInfinity(start: Double): IEnumerable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toNegativeInfinity")(start.asInstanceOf[js.Any]).asInstanceOf[IEnumerable[Double]]
    inline def toNegativeInfinity(start: Double, step: Double): IEnumerable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toNegativeInfinity")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[Double]]
    inline def toNegativeInfinity(start: Unit, step: Double): IEnumerable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toNegativeInfinity")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[Double]]
    
    inline def unfold[T](seed: T, func: js.Function1[/* value */ T, T]): IEnumerable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unfold")(seed.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[IEnumerable[T]]
  }
}
