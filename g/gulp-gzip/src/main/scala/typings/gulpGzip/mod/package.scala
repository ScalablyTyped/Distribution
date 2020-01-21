package typings.gulpGzip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Gzip = js.Function1[
    /* options */ js.UndefOr[typings.gulpGzip.mod.Options], 
    typings.node.NodeJS.ReadWriteStream
  ]
}
