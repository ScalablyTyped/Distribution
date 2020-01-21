package typings.gulpChanged

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IComparator = js.Function4[
    /* stream */ typings.node.streamMod.Transform, 
    /* callback */ js.Function, 
    /* sourceFile */ typings.vinyl.mod.File, 
    /* destPath */ java.lang.String, 
    scala.Unit
  ]
  type IDestination = js.Function1[/* file */ java.lang.String | typings.node.Buffer, java.lang.String]
}
