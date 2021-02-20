package typings.gulpIntercept

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-intercept", JSImport.Namespace)
  @js.native
  val ^ : Intercept = js.native
  
  type Intercept = js.Function1[/* interceptFunction */ InterceptFunction, ReadWriteStream]
  
  type InterceptFunction = js.Function1[/* file */ File, File]
  
  type _To = Intercept
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Intercept = ^
}
