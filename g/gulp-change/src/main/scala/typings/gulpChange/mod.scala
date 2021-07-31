package typings.gulpChange

import typings.eventStream.mod.MapStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(transformer: ChangeFunction): MapStream = ^.asInstanceOf[js.Dynamic].apply(transformer.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  @JSImport("gulp-change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* err */ js.Any, /* content */ String, js.Any]
  
  type ChangeFunction = js.Function2[/* content */ String, /* callback */ Callback, String | Unit]
}
