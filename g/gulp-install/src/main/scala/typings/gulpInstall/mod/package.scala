package typings.gulpInstall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Install = js.Function1[
    /* options */ js.UndefOr[typings.gulpInstall.mod.Options], 
    typings.node.NodeJS.ReadWriteStream
  ]
}
