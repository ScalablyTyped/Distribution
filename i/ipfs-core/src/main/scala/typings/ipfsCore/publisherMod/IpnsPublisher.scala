package typings.ipfsCore.publisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpnsPublisher extends js.Object {
  
  var _datastore: js.Any = js.native
  
  def _getPublished(peerId: js.Any): js.Promise[_] = js.native
  def _getPublished(peerId: js.Any, options: js.Object): js.Promise[_] = js.native
  
  def _publishEntry(key: js.Any, entry: js.Any): js.Promise[_] = js.native
  
  def _publishPublicKey(key: js.Any, publicKey: js.Any): js.Promise[_] = js.native
  
  def _putRecordToRouting(record: js.Any, peerId: js.Any): js.Promise[_] = js.native
  
  var _routing: js.Any = js.native
  
  def _unmarshalData(data: js.Any): js.Any = js.native
  
  def _updateOrCreateRecord(privKey: js.Any, value: js.Any, validity: js.Any, peerId: js.Any): js.Promise[_] = js.native
  
  def publish(privKey: js.Any, value: js.Any): js.Promise[_] = js.native
  
  def publishWithEOL(privKey: js.Any, value: js.Any, lifetime: js.Any): js.Promise[_] = js.native
}
