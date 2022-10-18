package typings.gulpJsonEditor

import org.scalablytyped.runtime.Shortcut
import typings.jsBeautify.mod.JSBeautifyOptions
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-json-editor", JSImport.Namespace)
  @js.native
  val ^ : JEditor = js.native
  
  type JEditor = js.Function2[
    /* mergeWith */ Any | (js.Function1[/* json */ Any, Any]), 
    /* jsBeautifyOptions */ js.UndefOr[JSBeautifyOptions], 
    ReadWriteStream
  ]
  
  type _To = JEditor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JEditor = ^
}
