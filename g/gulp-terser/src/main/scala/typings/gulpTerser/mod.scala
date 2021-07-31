package typings.gulpTerser

import typings.node.NodeJS.ReadWriteStream
import typings.terser.mod.MinifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(options: MinifyOptions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-terser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
