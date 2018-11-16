package typings
package gulpLib.gulpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GulpClientNs {
  type DestMethod = js.Function1[
    /* getFolderPath */ js.Function1[/* file */ vinylLib.vinylMod.File, java.lang.String], 
    nodeLib.NodeJSNs.ReadWriteStream
  ]
  type Globs = java.lang.String | js.Array[java.lang.String]
  type SrcMethod = js.Function2[
    /* globs */ js.Array[java.lang.String], 
    /* opt */ vinylDashFsLib.vinylDashFsMod.SrcOptions, 
    nodeLib.NodeJSNs.ReadWriteStream
  ]
  /**
       * @deprecated - Now use `TaskFunction`.
       */
  type TaskCallback = TaskFunction
  type TaskFunction = undertakerLib.undertakerMod.UndertakerNs.TaskFunction
}
