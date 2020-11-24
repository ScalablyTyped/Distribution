package typings.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITfIdfTokenMetadata extends js.Object {
  
  @JSName("$numDocumentOccurrences")
  var $numDocumentOccurrences: Double = js.native
  
  @JSName("$totalNumOccurrences")
  var $totalNumOccurrences: Double = js.native
  
  @JSName("$uidMap")
  var $uidMap: ITfIdfUidMap = js.native
}
object ITfIdfTokenMetadata {
  
  @scala.inline
  def apply($numDocumentOccurrences: Double, $totalNumOccurrences: Double, $uidMap: ITfIdfUidMap): ITfIdfTokenMetadata = {
    val __obj = js.Dynamic.literal($numDocumentOccurrences = $numDocumentOccurrences.asInstanceOf[js.Any], $totalNumOccurrences = $totalNumOccurrences.asInstanceOf[js.Any], $uidMap = $uidMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITfIdfTokenMetadata]
  }
  
  @scala.inline
  implicit class ITfIdfTokenMetadataOps[Self <: ITfIdfTokenMetadata] (val x: Self) extends AnyVal {
    
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
    def set$numDocumentOccurrences(value: Double): Self = this.set("$numDocumentOccurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$totalNumOccurrences(value: Double): Self = this.set("$totalNumOccurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$uidMap(value: ITfIdfUidMap): Self = this.set("$uidMap", value.asInstanceOf[js.Any])
  }
}
