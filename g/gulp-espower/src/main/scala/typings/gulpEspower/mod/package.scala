package typings.gulpEspower

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Espower = js.Function1[
    /* options */ js.UndefOr[typings.gulpEspower.mod.Options], 
    typings.node.NodeJS.ReadWriteStream
  ]
}
