package typings.ignore.ignoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ignore", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Creates new ignore manager.
    */
  def apply(): Ignore = js.native
  def apply(options: Options): Ignore = js.native
  def isPathValid(pathname: String): Boolean = js.native
}

