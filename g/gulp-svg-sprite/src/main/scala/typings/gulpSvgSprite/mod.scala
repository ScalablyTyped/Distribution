package typings.gulpSvgSprite

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import typings.svgSprite.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-svg-sprite", JSImport.Namespace)
  @js.native
  val ^ : SvgSprite = js.native
  
  type SvgSprite = js.Function1[/* options */ js.UndefOr[Config], ReadWriteStream]
  
  type _To = SvgSprite
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SvgSprite = ^
}
