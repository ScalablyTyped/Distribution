package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/diff", JSImport.Namespace)
@js.native
object diffMod extends js.Object {
  
  def diffPatch(filename: String, text1: String, text2: String): js.Promise[String] = js.native
}
