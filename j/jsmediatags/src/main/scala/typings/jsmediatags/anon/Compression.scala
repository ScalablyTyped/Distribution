package typings.jsmediatags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compression extends js.Object {
  
  var compression: Boolean = js.native
  
  var data_length_indicator: Boolean = js.native
  
  var encryption: Boolean = js.native
  
  var grouping_identity: Boolean = js.native
  
  var unsynchronisation: Boolean = js.native
}
object Compression {
  
  @scala.inline
  def apply(
    compression: Boolean,
    data_length_indicator: Boolean,
    encryption: Boolean,
    grouping_identity: Boolean,
    unsynchronisation: Boolean
  ): Compression = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], data_length_indicator = data_length_indicator.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], grouping_identity = grouping_identity.asInstanceOf[js.Any], unsynchronisation = unsynchronisation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compression]
  }
  
  @scala.inline
  implicit class CompressionOps[Self <: Compression] (val x: Self) extends AnyVal {
    
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
    def setCompression(value: Boolean): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_length_indicator(value: Boolean): Self = this.set("data_length_indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: Boolean): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrouping_identity(value: Boolean): Self = this.set("grouping_identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsynchronisation(value: Boolean): Self = this.set("unsynchronisation", value.asInstanceOf[js.Any])
  }
}
