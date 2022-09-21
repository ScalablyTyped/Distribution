package typings.gulpMuxml

import typings.muxml.mod.Options
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("gulp-muxml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
