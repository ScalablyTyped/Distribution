package typings.ipfsCore.mod

import typings.ipfsCore.anon.DnsInit
import typings.ipfsCore.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src", "create")
@js.native
object create extends js.Object {
  
  def apply[Init /* <: Boolean | typings.ipfsCore.initMod.InitOptions */, Start /* <: Boolean */](): js.Promise[typings.ipfsCore.anon.Init | Key | DnsInit] = js.native
  def apply[Init /* <: Boolean | typings.ipfsCore.initMod.InitOptions */, Start /* <: Boolean */](options: CreateOptions[Init, Start]): js.Promise[typings.ipfsCore.anon.Init | Key | DnsInit] = js.native
}
