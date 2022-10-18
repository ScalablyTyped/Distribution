package typings.gulpBabel

import typings.gulpBabel.anon.Ast
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  inline def apply(options: Ast): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
