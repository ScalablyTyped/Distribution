package typings.hexoFs.mod

import org.scalablytyped.runtime.TopLevel
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "access")
@js.native
object access
  extends TopLevel[
      js.UndefOr[
        js.Function2[/* path */ PathLike, /* mode */ js.UndefOr[Double], typings.bluebird.mod.^[Unit]]
      ]
    ]

