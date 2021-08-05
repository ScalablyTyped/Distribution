package typings.jestWatcher

import typings.jestWatcher.anon.End
import typings.jestWatcher.typesMod.ScrollOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollMod {
  
  @JSImport("jest-watcher/build/lib/scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(size: Double, hasOffsetMax: ScrollOptions): End = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(size.asInstanceOf[js.Any], hasOffsetMax.asInstanceOf[js.Any])).asInstanceOf[End]
}
