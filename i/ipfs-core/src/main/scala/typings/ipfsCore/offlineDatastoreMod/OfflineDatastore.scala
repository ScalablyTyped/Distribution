package typings.ipfsCore.offlineDatastoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfflineDatastore extends js.Object {
  
  var _repo: js.Any = js.native
  
  def _routingKey(key: js.Any): js.Any = js.native
  
  /**
    * Get a value from the local datastore indexed by the received key properly encoded.
    *
    * @param {Uint8Array} key - identifier of the value to be obtained.
    * @returns {Promise<Uint8Array>}
    */
  def get(key: Uint8Array): js.Promise[Uint8Array] = js.native
  
  /**
    * Put a value to the local datastore indexed by the received key properly encoded.
    *
    * @param {Uint8Array} key - identifier of the value.
    * @param {Uint8Array} value - value to be stored.
    * @returns {Promise<void>}
    */
  def put(key: Uint8Array, value: Uint8Array): js.Promise[Unit] = js.native
}
object OfflineDatastore {
  
  @scala.inline
  def apply(
    _repo: js.Any,
    _routingKey: js.Any => js.Any,
    get: Uint8Array => js.Promise[Uint8Array],
    put: (Uint8Array, Uint8Array) => js.Promise[Unit]
  ): OfflineDatastore = {
    val __obj = js.Dynamic.literal(_repo = _repo.asInstanceOf[js.Any], _routingKey = js.Any.fromFunction1(_routingKey), get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[OfflineDatastore]
  }
  
  @scala.inline
  implicit class OfflineDatastoreOps[Self <: OfflineDatastore] (val x: Self) extends AnyVal {
    
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
    def set_repo(value: js.Any): Self = this.set("_repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_routingKey(value: js.Any => js.Any): Self = this.set("_routingKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: Uint8Array => js.Promise[Uint8Array]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(value: (Uint8Array, Uint8Array) => js.Promise[Unit]): Self = this.set("put", js.Any.fromFunction2(value))
  }
}
