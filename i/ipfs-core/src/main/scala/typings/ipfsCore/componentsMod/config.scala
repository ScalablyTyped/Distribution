package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Defaultnetworking
import typings.ipfsCore.anon.RepoAny
import typings.ipfsCore.configMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "config")
@js.native
object config extends js.Object {
  
  def apply(hasRepo: RepoAny): Config = js.native
  
  var profiles: Defaultnetworking = js.native
}
