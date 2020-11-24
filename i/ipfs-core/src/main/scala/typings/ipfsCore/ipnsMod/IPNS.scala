package typings.ipfsCore.ipnsMod

import typings.ipfsCore.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPNS extends js.Object {
  
  var cache: typings.ipfsCore.tlruMod.^[_] = js.native
  
  def initializeKeyspace(privKey: js.Any, value: js.Any): js.Promise[Value] = js.native
  
  def publish(privKey: js.Any, value: js.Any): js.Promise[Value] = js.native
  def publish(privKey: js.Any, value: js.Any, lifetime: Double): js.Promise[Value] = js.native
  
  var publisher: typings.ipfsCore.publisherMod.^ = js.native
  
  var republisher: typings.ipfsCore.republisherMod.^ = js.native
  
  def resolve(name: js.Any): js.Promise[_] = js.native
  def resolve(name: js.Any, options: js.Object): js.Promise[_] = js.native
  
  var resolver: typings.ipfsCore.resolverMod.^ = js.native
  
  var routing: js.Any = js.native
}
