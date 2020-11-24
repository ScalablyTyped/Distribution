package typings.iframeResizer.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iframe-resizer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  // leave this declaration outside the namespace so the 'require'd import is still callable
  def apply(options: IFrameOptions, target: String): js.Array[IFrameComponent] = js.native
  def apply(options: IFrameOptions, target: HTMLElement): js.Array[IFrameComponent] = js.native
}
