package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jpushDashReactDashNativeLib {
  type JFailCallback = js.Function1[/* result */ Anon_ErrorCode, scala.Unit]
  type JResultCallback[T] = js.Function1[/* result */ T, scala.Unit]
  type JSuccessCallback[T] = js.Function1[/* result */ T, scala.Unit]
}
