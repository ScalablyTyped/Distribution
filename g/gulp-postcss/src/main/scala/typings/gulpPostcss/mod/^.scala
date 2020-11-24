package typings.gulpPostcss.mod

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-postcss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): ReadWriteStream = js.native
  def apply(callback: js.Function1[/* file */ File, typings.gulpPostcss.anon.Options]): ReadWriteStream = js.native
  def apply(plugins: js.UndefOr[scala.Nothing], options: Options): ReadWriteStream = js.native
  def apply(plugins: js.Array[_]): ReadWriteStream = js.native
  def apply(plugins: js.Array[_], options: Options): ReadWriteStream = js.native
}
