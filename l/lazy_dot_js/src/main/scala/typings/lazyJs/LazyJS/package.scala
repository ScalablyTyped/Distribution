package typings.lazyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object LazyJS {
  
  type Callback = js.Function0[scala.Unit]
  
  type CompareCallback = js.Function2[/* x */ js.Any, /* y */ js.Any, scala.Double]
  
  type ErrorCallback = js.Function1[/* error */ js.Any, scala.Unit]
  
  type Flatten[T, Shallow /* <: scala.Boolean */] = (/* import warning: importer.ImportType#apply Failed type conversion: lazy.js.anon.0<T>[T extends lazy.js.LazyJS.Sequence<any> ? 0 : T extends std.Array<any> ? 0 : T extends std.ReadonlyArray<any> ? 0 : 1] */ js.Any) | T
  
  type GeneratorCallback[T] = js.Function1[/* index */ scala.Double, T]
  
  type GetKeyCallback[T] = js.Function1[/* value */ T, java.lang.String]
  
  type MapCallback[T, U] = js.Function1[/* value */ T, U]
  
  type MapStringCallback = js.Function1[/* value */ java.lang.String, java.lang.String]
  
  type MemoCallback[T, U] = js.Function2[/* memo */ U, /* value */ T, U]
  
  type NumberCallback[T] = js.Function1[/* value */ T, scala.Double]
  
  type PushFront[TailT /* <: js.Array[_] */, FrontT] = js.Any
  
  type TestCallback[T, U] = js.Function2[/* value */ T, /* index */ U, scala.Boolean]
  
  type Tuple[ElementT, LengthT /* <: scala.Double */, OutputT /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: lazy.js.anon.1<ElementT, OutputT>[// LengthT is not compile-time constant
  number extends LengthT ? 0 : LengthT extends 0 ? 1 : OutputT['length'] extends LengthT ? 2 : 3] */ js.Any
  
  type ValueCallback[T] = js.Function1[/* value */ T, scala.Unit]
}
