package typings
package gulpDashJsonDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashJsonDashEditorMod {
  type JEditor = js.Function2[
    /* mergeWith */ js.Any | (js.Function1[/* json */ js.Any, js.Any]), 
    /* jsBeautifyOptions */ js.UndefOr[jsDashBeautifyLib.JsBeautifyOptions], 
    nodeLib.NodeJSNs.ReadWriteStream
  ]
}
