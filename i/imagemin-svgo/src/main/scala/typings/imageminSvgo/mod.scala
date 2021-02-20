package typings.imageminSvgo

import typings.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * SVGO imagemin plugin
    */
  @JSImport("imagemin-svgo", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("imagemin-svgo", JSImport.Namespace)
  @js.native
  def apply(options: Options): Plugin = js.native
  
  type Options = typings.svgo.mod.Options
}
