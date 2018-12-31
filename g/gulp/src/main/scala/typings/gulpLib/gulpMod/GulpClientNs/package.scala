package typings
package gulpLib.gulpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GulpClientNs {
  type Globs = java.lang.String | js.Array[java.lang.String]
  /**
    * @deprecated - Now use `TaskFunction`.
    */
  type TaskCallback = TaskFunction
  type TaskFunction = undertakerLib.undertakerMod.UndertakerNs.TaskFunction
}
