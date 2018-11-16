package typings
package ldapjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ldapjsMod {
  type CallBack = js.Function2[/* error */ Error, /* result */ js.UndefOr[js.Any], scala.Unit]
  type CompareCallback = js.Function2[/* error */ Error, /* matched */ js.UndefOr[scala.Boolean], scala.Unit]
  type Control = js.Any
  type ErrorCallback = js.Function1[/* error */ Error, scala.Unit]
  type ExopCallback = js.Function3[
    /* error */ Error, 
    /* value */ java.lang.String, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type SearchCallBack = js.Function2[/* error */ Error, /* result */ nodeLib.eventsMod.EventEmitter, scala.Unit]
}
