package typings.ipfsCore.anon

import typings.ipfsCore.bootstrapUtilsMod.Peers
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.multiaddr.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends js.Object {
  
  def add(multiaddr: ^): js.Promise[Peers] = js.native
  def add(multiaddr: ^, options: AbortOptions): js.Promise[Peers] = js.native
  
  def list(): js.Promise[Peers] = js.native
  def list(options: AbortOptions): js.Promise[Peers] = js.native
  
  def rm(multiaddr: ^): js.Promise[Peers] = js.native
  def rm(multiaddr: ^, options: AbortOptions): js.Promise[Peers] = js.native
}
