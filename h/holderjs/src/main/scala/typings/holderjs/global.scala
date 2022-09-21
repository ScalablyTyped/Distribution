package typings.holderjs

import typings.holderjs.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Holder {
    
    @JSGlobal("Holder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def run(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[Unit]
    inline def run(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
