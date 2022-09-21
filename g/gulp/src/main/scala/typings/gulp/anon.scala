package typings.gulp

import typings.vinyl.mod.File
import typings.vinylFs.anon.Cwd
import typings.vinylFs.anon.DirMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(folder: String): Any = js.native
    def apply(folder: String, opts: Cwd): Any = js.native
    def apply(getFolderPath: js.Function1[/* File */ File, String]): Any = js.native
    def apply(getFolderPath: js.Function1[/* File */ File, String], opts: DirMode): Any = js.native
  }
}
