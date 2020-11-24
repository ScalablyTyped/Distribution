package typings.gulpCleanDest.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-clean-dest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Removes files from the dest directory prior to building.
    * @param destination The name of the dest directory
    * @param options Options for the cleaning process
    */
  def apply(destination: String): ReadWriteStream = js.native
  def apply(destination: String, options: Options): ReadWriteStream = js.native
}
