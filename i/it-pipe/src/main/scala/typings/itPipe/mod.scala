package typings.itPipe

import typings.itStreamTypes.mod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDuplex[TSource, TSink, RSink](obj: Any): /* is it-stream-types.it-stream-types.Duplex<TSource, TSink, RSink> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuplex")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is it-stream-types.it-stream-types.Duplex<TSource, TSink, RSink> */ Boolean]
  
  inline def isIterable(obj: Any): /* is it-stream-types.it-stream-types.Source<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is it-stream-types.it-stream-types.Source<any> */ Boolean]
  
  inline def pipe[A](first: Source[A]): typings.itStreamTypes.mod.Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(first.asInstanceOf[js.Any]).asInstanceOf[typings.itStreamTypes.mod.Source[A]]
  inline def pipe[A, B](first: Source[A], second: Sink[A, B]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[B]
  inline def pipe[A, B, C](first: Source[A], second: Transform[A, B], third: Sink[B, C]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def pipe[A, B, C, D](first: Source[A], second: Transform[A, B], third: Transform[B, C], fourth: Sink[C, D]): D = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], fourth.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def pipe[A, B, C, D, E](
    first: Source[A],
    second: Transform[A, B],
    third: Transform[B, C],
    fourth: Transform[C, D],
    fifth: Sink[D, E]
  ): E = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], fourth.asInstanceOf[js.Any], fifth.asInstanceOf[js.Any])).asInstanceOf[E]
  inline def pipe[A, B, C, D, E, F](
    first: Source[A],
    second: Transform[A, B],
    third: Transform[B, C],
    fourth: Transform[C, D],
    fifth: Transform[D, E],
    sixth: Sink[E, F]
  ): F = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], fourth.asInstanceOf[js.Any], fifth.asInstanceOf[js.Any], sixth.asInstanceOf[js.Any])).asInstanceOf[F]
  inline def pipe[A, B, C, D, E, F, G](
    first: Source[A],
    second: Transform[A, B],
    third: Transform[B, C],
    fourth: Transform[C, D],
    fifth: Transform[D, E],
    sixth: Transform[E, F],
    seventh: Sink[F, G]
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], fourth.asInstanceOf[js.Any], fifth.asInstanceOf[js.Any], sixth.asInstanceOf[js.Any], seventh.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def pipe[A, B, C, D, E, F, G, H](
    first: Source[A],
    second: Transform[A, B],
    third: Transform[B, C],
    fourth: Transform[C, D],
    fifth: Transform[D, E],
    sixth: Transform[E, F],
    seventh: Transform[F, G],
    eighth: Sink[G, H]
  ): H = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], fourth.asInstanceOf[js.Any], fifth.asInstanceOf[js.Any], sixth.asInstanceOf[js.Any], seventh.asInstanceOf[js.Any], eighth.asInstanceOf[js.Any])).asInstanceOf[H]
  inline def pipe[A, B, C, D, E, F, G, H, I](
    first: Source[A],
    second: Transform[A, B],
    third: Transform[B, C],
    fourth: Transform[C, D],
    fifth: Transform[D, E],
    sixth: Transform[E, F],
    seventh: Transform[F, G],
    eighth: Transform[G, H],
    ninth: Sink[H, I]
  ): I = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], fourth.asInstanceOf[js.Any], fifth.asInstanceOf[js.Any], sixth.asInstanceOf[js.Any], seventh.asInstanceOf[js.Any], eighth.asInstanceOf[js.Any], ninth.asInstanceOf[js.Any])).asInstanceOf[I]
  inline def pipe[A, B, C, D, E, F, G, H, I, J](
    first: Source[A],
    second: Transform[A, B],
    third: Transform[B, C],
    fourth: Transform[C, D],
    fifth: Transform[D, E],
    sixth: Transform[E, F],
    seventh: Transform[F, G],
    eighth: Transform[G, H],
    ninth: Transform[H, I],
    tenth: Sink[I, J]
  ): J = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], fourth.asInstanceOf[js.Any], fifth.asInstanceOf[js.Any], sixth.asInstanceOf[js.Any], seventh.asInstanceOf[js.Any], eighth.asInstanceOf[js.Any], ninth.asInstanceOf[js.Any], tenth.asInstanceOf[js.Any])).asInstanceOf[J]
  
  inline def rawPipe(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type any is not an array type */ fns: Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawPipe")(fns.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type Sink[A, B] = (typings.itStreamTypes.mod.Sink[A, B]) | (Duplex[Any, A, B])
  
  type Source[A] = typings.itStreamTypes.mod.Source[A] | js.Function0[typings.itStreamTypes.mod.Source[A]] | (Duplex[A, Any, Any])
  
  type Transform[A, B] = (typings.itStreamTypes.mod.Transform[A, B]) | (Duplex[B, A, Any])
}
