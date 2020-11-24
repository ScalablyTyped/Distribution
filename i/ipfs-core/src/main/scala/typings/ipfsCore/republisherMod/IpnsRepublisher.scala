package typings.ipfsCore.republisherMod

import typings.ipfsCore.anon.InflightTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpnsRepublisher extends js.Object {
  
  var _datastore: js.Any = js.native
  
  def _getPreviousValue(peerId: js.Any): js.Promise[_] = js.native
  
  var _keychain: js.Any = js.native
  
  var _peerId: js.Any = js.native
  
  var _publisher: js.Any = js.native
  
  def _republishEntries(privateKey: js.Any, pass: js.Any): js.Promise[Unit] = js.native
  
  def _republishEntry(privateKey: js.Any): js.Promise[Unit] = js.native
  
  var _republishHandle: InflightTask | Null = js.native
  
  def start(): js.Promise[Unit] = js.native
  
  def stop(): js.Promise[Unit] = js.native
}
object IpnsRepublisher {
  
  @scala.inline
  def apply(
    _datastore: js.Any,
    _getPreviousValue: js.Any => js.Promise[_],
    _keychain: js.Any,
    _peerId: js.Any,
    _publisher: js.Any,
    _republishEntries: (js.Any, js.Any) => js.Promise[Unit],
    _republishEntry: js.Any => js.Promise[Unit],
    start: () => js.Promise[Unit],
    stop: () => js.Promise[Unit]
  ): IpnsRepublisher = {
    val __obj = js.Dynamic.literal(_datastore = _datastore.asInstanceOf[js.Any], _getPreviousValue = js.Any.fromFunction1(_getPreviousValue), _keychain = _keychain.asInstanceOf[js.Any], _peerId = _peerId.asInstanceOf[js.Any], _publisher = _publisher.asInstanceOf[js.Any], _republishEntries = js.Any.fromFunction2(_republishEntries), _republishEntry = js.Any.fromFunction1(_republishEntry), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IpnsRepublisher]
  }
  
  @scala.inline
  implicit class IpnsRepublisherOps[Self <: IpnsRepublisher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_datastore(value: js.Any): Self = this.set("_datastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_getPreviousValue(value: js.Any => js.Promise[_]): Self = this.set("_getPreviousValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_keychain(value: js.Any): Self = this.set("_keychain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_peerId(value: js.Any): Self = this.set("_peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_publisher(value: js.Any): Self = this.set("_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_republishEntries(value: (js.Any, js.Any) => js.Promise[Unit]): Self = this.set("_republishEntries", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_republishEntry(value: js.Any => js.Promise[Unit]): Self = this.set("_republishEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => js.Promise[Unit]): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => js.Promise[Unit]): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_republishHandle(value: InflightTask): Self = this.set("_republishHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_republishHandleNull: Self = this.set("_republishHandle", null)
  }
}
