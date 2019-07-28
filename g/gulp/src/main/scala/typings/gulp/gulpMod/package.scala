package typings.gulp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpMod {
  type Globs = String | js.Array[String]
  /**
    * @deprecated - Now use `TaskFunction`.
    */
  type TaskCallback = TaskFunction
  type TaskFunction = typings.undertaker.undertakerMod.TaskFunction
}
