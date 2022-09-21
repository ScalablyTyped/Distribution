package typings.gulpChange

import typings.eventStream.mod.MapStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(transformer: ChangeFunction): MapStream = ^.asInstanceOf[js.Dynamic].apply(transformer.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  @JSImport("gulp-change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* err */ Any, /* content */ String, Any]
  
  type ChangeFunction = js.Function2[/* content */ String, /* callback */ Callback, String | Unit]
}
