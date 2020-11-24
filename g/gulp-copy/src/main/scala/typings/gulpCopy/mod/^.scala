package typings.gulpCopy.mod

import typings.through.mod.ThroughStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-copy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Copy files to destination and expose those files as source streams for the gulp pipeline.
    *
    * @param outDirectory The name of the destination directory. If this directory
    *                     does not exist, it will be created atomatically.
    */
  def apply(outDirectory: String): ThroughStream = js.native
  /**
    * Copy files to destination and expose those files as source streams for the gulp pipeline.
    *
    * @param outDirectory The name of the destination directory. If this directory
    *                     does not exist, it will be created atomatically.
    * @param options Override values for available settings.
    */
  def apply(outDirectory: String, options: GulpCopyOptions): ThroughStream = js.native
}
