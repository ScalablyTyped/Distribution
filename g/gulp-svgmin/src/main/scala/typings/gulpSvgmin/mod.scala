package typings.gulpSvgmin

import typings.node.streamMod.Transform
import typings.svgo.mod.Options
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-svgmin", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("gulp-svgmin", JSImport.Namespace)
  @js.native
  def apply(cb: js.Function1[/* file */ File, Options]): Transform = js.native
  @JSImport("gulp-svgmin", JSImport.Namespace)
  @js.native
  def apply(options: Options): Transform = js.native
}
