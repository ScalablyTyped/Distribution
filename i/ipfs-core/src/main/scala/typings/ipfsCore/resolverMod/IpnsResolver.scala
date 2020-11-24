package typings.ipfsCore.resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpnsResolver extends js.Object {
  
  def _resolveName(name: js.Any): js.Promise[_] = js.native
  
  var _routing: js.Any = js.native
  
  def _validateRecord(peerId: js.Any, ipnsEntry: js.Any): js.Promise[_] = js.native
  
  def resolve(name: js.Any): js.Promise[_] = js.native
  def resolve(name: js.Any, options: js.Object): js.Promise[_] = js.native
  
  def resolver(name: js.Any, depth: js.Any): js.Any = js.native
}
