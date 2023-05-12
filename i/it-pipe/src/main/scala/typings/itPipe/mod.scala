package typings.itPipe

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Sink
import typings.itStreamTypes.mod.Transform
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pipe[A /* <: PipeSource[Any] */](source: A): SingleItemPipeOutput[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any]).asInstanceOf[SingleItemPipeOutput[A]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeSink[PipeFnInput[A], Any] */](source: A, sink: B): PipeOutput[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[B]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeTransform[PipeFnInput[A], Any] */, C /* <: PipeSink[PipeFnInput[B], Any] */](source: A, transform1: B, sink: C): PipeOutput[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[C]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeTransform[PipeFnInput[A], Any] */, C /* <: PipeTransform[PipeFnInput[B], Any] */, D /* <: PipeSink[PipeFnInput[C], Any] */](source: A, transform1: B, transform2: C, sink: D): PipeOutput[D] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[D]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeTransform[PipeFnInput[A], Any] */, C /* <: PipeTransform[PipeFnInput[B], Any] */, D /* <: PipeTransform[PipeFnInput[C], Any] */, E /* <: PipeSink[PipeFnInput[D], Any] */](source: A, transform1: B, transform2: C, transform3: D, sink: E): PipeOutput[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[E]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeTransform[PipeFnInput[A], Any] */, C /* <: PipeTransform[PipeFnInput[B], Any] */, D /* <: PipeTransform[PipeFnInput[C], Any] */, E /* <: PipeTransform[PipeFnInput[D], Any] */, F /* <: PipeSink[PipeFnInput[E], Any] */](source: A, transform1: B, transform2: C, transform3: D, transform4: E, sink: F): PipeOutput[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[F]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeTransform[PipeFnInput[A], Any] */, C /* <: PipeTransform[PipeFnInput[B], Any] */, D /* <: PipeTransform[PipeFnInput[C], Any] */, E /* <: PipeTransform[PipeFnInput[D], Any] */, F /* <: PipeTransform[PipeFnInput[E], Any] */, G /* <: PipeSink[PipeFnInput[F], Any] */](source: A, transform1: B, transform2: C, transform3: D, transform4: E, transform5: F, sink: G): PipeOutput[G] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], transform5.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[G]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeTransform[PipeFnInput[A], Any] */, C /* <: PipeTransform[PipeFnInput[B], Any] */, D /* <: PipeTransform[PipeFnInput[C], Any] */, E /* <: PipeTransform[PipeFnInput[D], Any] */, F /* <: PipeTransform[PipeFnInput[E], Any] */, G /* <: PipeTransform[PipeFnInput[F], Any] */, H /* <: PipeSink[PipeFnInput[G], Any] */](
    source: A,
    transform1: B,
    transform2: C,
    transform3: D,
    transform4: E,
    transform5: F,
    transform6: G,
    sink: H
  ): PipeOutput[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], transform5.asInstanceOf[js.Any], transform6.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[H]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeTransform[PipeFnInput[A], Any] */, C /* <: PipeTransform[PipeFnInput[B], Any] */, D /* <: PipeTransform[PipeFnInput[C], Any] */, E /* <: PipeTransform[PipeFnInput[D], Any] */, F /* <: PipeTransform[PipeFnInput[E], Any] */, G /* <: PipeTransform[PipeFnInput[F], Any] */, H /* <: PipeTransform[PipeFnInput[G], Any] */, I /* <: PipeSink[PipeFnInput[H], Any] */](
    source: A,
    transform1: B,
    transform2: C,
    transform3: D,
    transform4: E,
    transform5: F,
    transform6: G,
    transform7: H,
    sink: I
  ): PipeOutput[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], transform5.asInstanceOf[js.Any], transform6.asInstanceOf[js.Any], transform7.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[I]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeTransform[PipeFnInput[A], Any] */, C /* <: PipeTransform[PipeFnInput[B], Any] */, D /* <: PipeTransform[PipeFnInput[C], Any] */, E /* <: PipeTransform[PipeFnInput[D], Any] */, F /* <: PipeTransform[PipeFnInput[E], Any] */, G /* <: PipeTransform[PipeFnInput[F], Any] */, H /* <: PipeTransform[PipeFnInput[G], Any] */, I /* <: PipeTransform[PipeFnInput[H], Any] */, J /* <: PipeSink[PipeFnInput[I], Any] */](
    source: A,
    transform1: B,
    transform2: C,
    transform3: D,
    transform4: E,
    transform5: F,
    transform6: G,
    transform7: H,
    transform8: I,
    sink: J
  ): PipeOutput[J] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], transform5.asInstanceOf[js.Any], transform6.asInstanceOf[js.Any], transform7.asInstanceOf[js.Any], transform8.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[J]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeTransform[PipeFnInput[A], Any] */, C /* <: PipeTransform[PipeFnInput[B], Any] */, D /* <: PipeTransform[PipeFnInput[C], Any] */, E /* <: PipeTransform[PipeFnInput[D], Any] */, F /* <: PipeTransform[PipeFnInput[E], Any] */, G /* <: PipeTransform[PipeFnInput[F], Any] */, H /* <: PipeTransform[PipeFnInput[G], Any] */, I /* <: PipeTransform[PipeFnInput[H], Any] */, J /* <: PipeTransform[PipeFnInput[I], Any] */, K /* <: PipeSink[PipeFnInput[J], Any] */](
    source: A,
    transform1: B,
    transform2: C,
    transform3: D,
    transform4: E,
    transform5: F,
    transform6: G,
    transform7: H,
    transform8: I,
    transform9: J,
    sink: K
  ): PipeOutput[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], transform5.asInstanceOf[js.Any], transform6.asInstanceOf[js.Any], transform7.asInstanceOf[js.Any], transform8.asInstanceOf[js.Any], transform9.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[K]]
  inline def pipe[A /* <: PipeSource[Any] */, B /* <: PipeTransform[PipeFnInput[A], Any] */, C /* <: PipeTransform[PipeFnInput[B], Any] */, D /* <: PipeTransform[PipeFnInput[C], Any] */, E /* <: PipeTransform[PipeFnInput[D], Any] */, F /* <: PipeTransform[PipeFnInput[E], Any] */, G /* <: PipeTransform[PipeFnInput[F], Any] */, H /* <: PipeTransform[PipeFnInput[G], Any] */, I /* <: PipeTransform[PipeFnInput[H], Any] */, J /* <: PipeTransform[PipeFnInput[I], Any] */, K /* <: PipeTransform[PipeFnInput[J], Any] */, L /* <: PipeSink[PipeFnInput[K], Any] */](
    source: A,
    transform1: B,
    transform2: C,
    transform3: D,
    transform4: E,
    transform5: F,
    transform6: G,
    transform7: H,
    transform8: I,
    transform9: J,
    transform10: K,
    sink: L
  ): PipeOutput[L] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], transform5.asInstanceOf[js.Any], transform6.asInstanceOf[js.Any], transform7.asInstanceOf[js.Any], transform8.asInstanceOf[js.Any], transform9.asInstanceOf[js.Any], transform10.asInstanceOf[js.Any], sink.asInstanceOf[js.Any])).asInstanceOf[PipeOutput[L]]
  
  inline def rawPipe(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type any is not an array type */ fns: Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rawPipe")(fns.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends std.Iterable<any> ? A : A extends std.AsyncIterable<any> ? A : A extends it-pipe.it-pipe.SourceFn<any> ? std.ReturnType<A> : A extends it-stream-types.it-stream-types.Transform<any, any> ? std.ReturnType<A> : A extends it-stream-types.it-stream-types.Duplex<any, any, any> ? A['source'] : never
    }}}
    */
  type PipeFnInput[A] = A
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    A extends it-stream-types.it-stream-types.Sink<any, unknown> ? std.ReturnType<A> : A extends it-stream-types.it-stream-types.Duplex<any, any, any> ? std.ReturnType<A['sink']> : never
    }}}
    */
  @js.native
  trait PipeOutput[A] extends StObject
  
  type PipeSink[A, B] = (Sink[A, B]) | (Duplex[Any, A, B])
  
  type PipeSource[A] = js.Iterable[A] | AsyncIterable[A] | SourceFn[A] | (Duplex[A, Any, Any])
  
  type PipeTransform[A, B] = (Transform[A, B]) | (Duplex[B, A, Any])
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends std.Iterable<any> ? A : A extends std.AsyncIterable<any> ? A : A extends it-pipe.it-pipe.SourceFn<any> ? std.ReturnType<A> : A extends it-stream-types.it-stream-types.Duplex<any, any, any> ? A['source'] : it-pipe.it-pipe.PipeOutput<A>
    }}}
    */
  type SingleItemPipeOutput[A] = A
  
  type SourceFn[A] = js.Function0[A]
}
