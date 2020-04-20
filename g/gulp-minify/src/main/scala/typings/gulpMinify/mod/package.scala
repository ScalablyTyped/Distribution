package typings.gulpMinify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type minify = js.Function1[
    /* options */ js.UndefOr[typings.gulpMinify.mod.Options], 
    typings.node.NodeJS.ReadWriteStream
  ]
}
