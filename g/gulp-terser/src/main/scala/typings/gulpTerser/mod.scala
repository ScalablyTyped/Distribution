package typings.gulpTerser

import typings.terser.mod.MinifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(options: MinifyOptions): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("gulp-terser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
