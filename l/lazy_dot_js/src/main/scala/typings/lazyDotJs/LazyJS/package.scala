package typings.lazyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LazyJS {
  type Callback = js.Function0[Unit]
  type CompareCallback = js.Function2[/* x */ js.Any, /* y */ js.Any, Double]
  type ErrorCallback = js.Function1[/* error */ js.Any, Unit]
  type Flatten[T, Shallow /* <: Boolean */] = (/* import warning: importer.ImportType#apply Failed type conversion: lazy.js.Anon_0<T>[T extends lazy.js.LazyJS.Sequence<any> ? 0 : 1] */ js.Any) | T
  type GeneratorCallback[T] = js.Function1[/* index */ Double, T]
  type GetKeyCallback[T] = js.Function1[/* value */ T, String]
  type MapCallback[T, U] = js.Function1[/* value */ T, U]
  type MapStringCallback = js.Function1[/* value */ String, String]
  type MemoCallback[T, U] = js.Function2[/* memo */ U, /* value */ T, U]
  type NumberCallback[T] = js.Function1[/* value */ T, Double]
  type TestCallback[T, U] = js.Function2[/* value */ T, /* index */ U, Boolean]
  type ValueCallback[T] = js.Function1[/* value */ T, Unit]
}
