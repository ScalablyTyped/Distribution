package typings.gulpTap

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-tap", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(tapFunction: js.Function2[/* file */ File, /* t */ js.UndefOr[js.Object], Unit]): ReadWriteStream = js.native
  
  type Tap = js.Function2[/* tapFunction */ TapFunction, /* t */ js.UndefOr[js.Any], ReadWriteStream]
  
  type TapFunction = js.Function1[/* file */ File, js.Any]
}
