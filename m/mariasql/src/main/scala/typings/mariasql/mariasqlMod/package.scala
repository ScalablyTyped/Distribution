package typings.mariasql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mariasqlMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type Dictionary = StringDictionary[js.Any]
  type MariaCallBackBoolean = js.Function1[/* result */ Boolean, Unit]
  type MariaCallBackError = js.Function1[/* error */ Error, Unit]
  type MariaCallBackInfo = js.Function1[/* result */ MariaInfo, Unit]
  type MariaCallBackObject = js.Function1[/* result */ js.Object, Unit]
  type MariaCallBackResult = js.Function1[/* result */ MariaResult, Unit]
  type MariaCallBackRow = js.Function1[/* result */ js.Array[js.Any], Unit]
  type MariaCallBackVoid = js.Function0[Unit]
}
