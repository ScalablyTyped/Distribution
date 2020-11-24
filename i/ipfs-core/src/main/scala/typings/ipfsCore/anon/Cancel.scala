package typings.ipfsCore.anon

import typings.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends js.Object {
  
  def cancel(name: String): js.Promise[Canceled] = js.native
  def cancel(name: String, options: AbortOptions): js.Promise[Canceled] = js.native
  
  def state(): js.Promise[Enabled] = js.native
  def state(_options: AbortOptions): js.Promise[Enabled] = js.native
  
  def subs(): js.Promise[js.Array[String]] = js.native
  def subs(options: AbortOptions): js.Promise[js.Array[String]] = js.native
}
