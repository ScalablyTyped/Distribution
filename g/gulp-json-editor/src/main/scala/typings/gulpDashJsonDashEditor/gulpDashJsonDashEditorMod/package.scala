package typings.gulpDashJsonDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashJsonDashEditorMod {
  import typings.jsDashBeautify.JsBeautifyOptions
  import typings.node.NodeJSNs.ReadWriteStream

  type JEditor = js.Function2[
    /* mergeWith */ js.Any | (js.Function1[/* json */ js.Any, js.Any]), 
    /* jsBeautifyOptions */ js.UndefOr[JsBeautifyOptions], 
    ReadWriteStream
  ]
}
