package typings
package jsonpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonpMod {
  type CancelFn = js.Function0[scala.Unit]
  type RequestCallback = js.Function2[/* error */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
}
