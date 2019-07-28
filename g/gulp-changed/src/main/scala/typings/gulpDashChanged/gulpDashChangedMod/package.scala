package typings.gulpDashChanged

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashChangedMod {
  type IComparator = js.Function4[
    /* stream */ Transform, 
    /* callback */ js.Function, 
    /* sourceFile */ File, 
    /* destPath */ String, 
    Unit
  ]
  type IDestination = js.Function1[/* file */ String | Buffer, String]
}
