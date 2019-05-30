package typings
package kyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kyMod {
  type AfterResponseHook = js.Function1[
    /* response */ stdLib.Response, 
    stdLib.Response | scala.Unit | (js.Promise[stdLib.Response | scala.Unit])
  ]
  type BeforeRequestHook = js.Function1[/* options */ Options, scala.Unit | js.Promise[scala.Unit]]
}
