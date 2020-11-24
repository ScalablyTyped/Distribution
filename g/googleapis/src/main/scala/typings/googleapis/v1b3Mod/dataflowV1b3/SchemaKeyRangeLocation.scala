package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location information for a specific key-range of a sharded computation.
  * Currently we only support UTF-8 character splits to simplify encoding into
  * JSON.
  */
@js.native
trait SchemaKeyRangeLocation extends js.Object {
  
  /**
    * The name of the data disk where data for this range is stored. This name
    * is local to the Google Cloud Platform project and uniquely identifies the
    * disk within that project, for example
    * &quot;myproject-1014-104817-4c2-harness-0-disk-1&quot;.
    */
  var dataDisk: js.UndefOr[String] = js.native
  
  /**
    * The physical location of this range assignment to be used for streaming
    * computation cross-worker message delivery.
    */
  var deliveryEndpoint: js.UndefOr[String] = js.native
  
  /**
    * DEPRECATED. The location of the persistent state for this range, as a
    * persistent directory in the worker local filesystem.
    */
  var deprecatedPersistentDirectory: js.UndefOr[String] = js.native
  
  /**
    * The end (exclusive) of the key range.
    */
  var end: js.UndefOr[String] = js.native
  
  /**
    * The start (inclusive) of the key range.
    */
  var start: js.UndefOr[String] = js.native
}
object SchemaKeyRangeLocation {
  
  @scala.inline
  def apply(): SchemaKeyRangeLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyRangeLocation]
  }
  
  @scala.inline
  implicit class SchemaKeyRangeLocationOps[Self <: SchemaKeyRangeLocation] (val x: Self) extends AnyVal {
    
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
    def setDataDisk(value: String): Self = this.set("dataDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDisk: Self = this.set("dataDisk", js.undefined)
    
    @scala.inline
    def setDeliveryEndpoint(value: String): Self = this.set("deliveryEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryEndpoint: Self = this.set("deliveryEndpoint", js.undefined)
    
    @scala.inline
    def setDeprecatedPersistentDirectory(value: String): Self = this.set("deprecatedPersistentDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedPersistentDirectory: Self = this.set("deprecatedPersistentDirectory", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
