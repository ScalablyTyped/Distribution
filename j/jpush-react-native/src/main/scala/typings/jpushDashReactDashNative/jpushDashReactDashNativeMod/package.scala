package typings.jpushDashReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jpushDashReactDashNativeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jpushDashReactDashNative.Anon_ErrorCode

  type ExtraData = StringDictionary[js.Any]
  type JFailCallback = js.Function1[/* result */ Anon_ErrorCode, Unit]
  type JResultCallback[T] = js.Function1[/* result */ T, Unit]
  type JSuccessCallback[T] = js.Function1[/* result */ T, Unit]
}
