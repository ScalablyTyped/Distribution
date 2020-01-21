package typings.gulpUseref

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Useref = js.Function2[
    /* options */ js.UndefOr[typings.gulpUseref.mod.Options], 
    /* repeated */ typings.node.NodeJS.ReadWriteStream, 
    typings.node.NodeJS.ReadWriteStream
  ]
}
