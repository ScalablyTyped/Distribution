package typings.gulpHeader

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(text: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(text: String, data: js.Object): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
