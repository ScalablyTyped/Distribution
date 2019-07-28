package typings.gulpDashUglify

import typings.gulpDashUglify.gulpDashUglifyMod.Options
import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object composerMod {
  type Composer = js.Function2[
    /* uglify */ Uglify, 
    /* log */ Logger, 
    js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  ]
}
