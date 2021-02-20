package typings.gulpChange

import typings.eventStream.mod.MapStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-change", JSImport.Namespace)
  @js.native
  def apply(transformer: ChangeFunction): MapStream = js.native
  
  type Callback = js.Function2[/* err */ js.Any, /* content */ String, js.Any]
  
  type ChangeFunction = js.Function2[/* content */ String, /* callback */ Callback, String | Unit]
}
