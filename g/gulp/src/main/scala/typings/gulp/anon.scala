package typings.gulp

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import typings.vinylFs.anon.Cwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(folder: String): ReadWriteStream = js.native
    def apply(folder: String, opts: Cwd): ReadWriteStream = js.native
    def apply(folder: js.Function1[/* File */ File, String]): ReadWriteStream = js.native
    def apply(folder: js.Function1[/* File */ File, String], opts: Cwd): ReadWriteStream = js.native
  }
}
