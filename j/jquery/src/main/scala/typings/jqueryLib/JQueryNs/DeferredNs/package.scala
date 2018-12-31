package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DeferredNs {
  /**
    * @deprecated ​ Deprecated. Use \`{@link Callback }\`.
    */
  type AlwaysCallback[TResolve, TReject] = Callback[TResolve | TReject]
  type Callback[T] = js.Function1[/* repeated */ T, scala.Unit]
  type Callback3[T, U, V] = CallbackBase[T, U, V, scala.Nothing]
  type CallbackBase[T, U, V, R] = js.Function4[/* t */ T, /* u */ U, /* v */ V, /* repeated */ R, scala.Unit]
  /**
    * @deprecated ​ Deprecated. Use \`{@link Callback }\`.
    */
  type DoneCallback[TResolve] = Callback[TResolve]
  /**
    * @deprecated ​ Deprecated. Use \`{@link Callback }\`.
    */
  type FailCallback[TReject] = Callback[TReject]
  /**
    * @deprecated ​ Deprecated. Use \`{@link Callback }\`.
    */
  type ProgressCallback[TNotify] = Callback[TNotify]
}
