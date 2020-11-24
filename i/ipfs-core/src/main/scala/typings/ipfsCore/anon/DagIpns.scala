package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.DAG_
import typings.ipfsCore.componentsMod.IsOnline_
import typings.ipfsCore.ipnsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DagIpns extends js.Object {
  
  var dag: DAG_ = js.native
  
  var ipns: ^ = js.native
  
  def isOnline(): Boolean = js.native
  @JSName("isOnline")
  var isOnline_Original: IsOnline_ = js.native
  
  var keychain: typings.ipfsCore.initMod.Keychain = js.native
  
  var peerId: typings.peerId.mod.^ = js.native
}
