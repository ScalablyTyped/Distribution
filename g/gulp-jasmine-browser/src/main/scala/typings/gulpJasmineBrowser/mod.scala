package typings.gulpJasmineBrowser

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-jasmine-browser", JSImport.Namespace)
  @js.native
  val ^ : IJasmineBrowser = js.native
  
  @js.native
  trait IJasmineBrowser extends StObject {
    
    def headless(): ReadWriteStream = js.native
    def headless(options: Any): ReadWriteStream = js.native
    
    def server(): ReadWriteStream = js.native
    def server(options: Any): ReadWriteStream = js.native
    
    def specRunner(): ReadWriteStream = js.native
    def specRunner(options: Any): ReadWriteStream = js.native
  }
  
  type _To = IJasmineBrowser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IJasmineBrowser = ^
}
