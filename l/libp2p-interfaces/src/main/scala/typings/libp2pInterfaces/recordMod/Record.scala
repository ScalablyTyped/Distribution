package typings.libp2pInterfaces.recordMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Record is the base implementation of a record that can be used as the payload of a libp2p envelope.
  */
@js.native
trait Record extends js.Object {
  
  var codec: Uint8Array = js.native
  
  var domain: String = js.native
  
  /**
    * Verifies if the other provided Record is identical to this one.
    * @param {Record} other
    */
  def equals(other: Record): Unit = js.native
  
  /**
    * Marshal a record to be used in an envelope.
    */
  def marshal(): Unit = js.native
}
object Record {
  
  @scala.inline
  def apply(codec: Uint8Array, domain: String, equals: Record => Unit, marshal: () => Unit): Record = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), marshal = js.Any.fromFunction0(marshal))
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
    
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
    def setCodec(value: Uint8Array): Self = this.set("codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: Record => Unit): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarshal(value: () => Unit): Self = this.set("marshal", js.Any.fromFunction0(value))
  }
}
