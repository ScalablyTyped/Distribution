package typings.imageminDashSvgo

import typings.imagemin.imageminMod.Plugin
import typings.imageminDashSvgo.imageminDashSvgoMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imagemin-svgo", JSImport.Namespace)
@js.native
object imageminDashSvgoMod extends js.Object {
  def apply(): Plugin = js.native
  def apply(options: Options): Plugin = js.native
  type Options = typings.svgo.svgoMod.Options
}

