package typings.ldapjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ldapjsMod {
  type CallBack = js.Function2[/* error */ Error, /* result */ js.UndefOr[js.Any], Unit]
  type CompareCallback = js.Function2[/* error */ Error, /* matched */ js.UndefOr[Boolean], Unit]
  type Control = js.Any
  type ErrorCallback = js.Function1[/* error */ Error, Unit]
  type ExopCallback = js.Function3[/* error */ Error, /* value */ String, /* result */ js.UndefOr[js.Any], Unit]
  type SearchCallBack = js.Function2[/* error */ Error | Null, /* result */ SearchCallbackResponse, Unit]
  type SearchReference = js.Any
}
