package typings.gulpJasmineBrowser

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-jasmine-browser", JSImport.Namespace)
  @js.native
  val ^ : IJasmineBrowser = js.native
  
  @js.native
  trait IJasmineBrowser extends StObject {
    
    def headless(): Any = js.native
    def headless(options: Any): Any = js.native
    
    def server(): Any = js.native
    def server(options: Any): Any = js.native
    
    def specRunner(): Any = js.native
    def specRunner(options: Any): Any = js.native
  }
  
  type _To = IJasmineBrowser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IJasmineBrowser = ^
}
