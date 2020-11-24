package typings.imageminSvgo

import typings.imagemin.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("imagemin-svgo", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * SVGO imagemin plugin
    */
  def apply(): Plugin = js.native
  def apply(options: Options): Plugin = js.native
  
  type Options = typings.svgo.mod.Options
}
