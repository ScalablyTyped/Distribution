package typings.ipfsCore.configMod

import typings.ipfsCore.anon.Original
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profiles_ extends js.Object {
  
  @JSName("apply")
  def apply(name: String): js.Promise[Original] = js.native
  @JSName("apply")
  def apply(name: String, options: typings.ipfsCore.srcUtilsMod.AbortOptions with ApplyOptionsExt): js.Promise[Original] = js.native
  @JSName("apply")
  var apply_Original: ApplyProfile = js.native
  
  def list(): js.Promise[js.Array[Profile]] = js.native
  def list(options: typings.ipfsCore.srcUtilsMod.AbortOptions): js.Promise[js.Array[Profile]] = js.native
  @JSName("list")
  var list_Original: ListProfiles = js.native
}
