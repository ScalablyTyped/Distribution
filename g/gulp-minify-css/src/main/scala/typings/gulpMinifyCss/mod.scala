package typings.gulpMinifyCss

import typings.cleanCss.mod.Options
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  inline def apply(options: Options): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-minify-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
