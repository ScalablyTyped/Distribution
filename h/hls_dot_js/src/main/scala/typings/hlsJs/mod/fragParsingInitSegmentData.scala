package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fragParsingInitSegmentData extends js.Object {
  
  var codecs: js.Any = js.native
  
  var frag: Fragment = js.native
  
  var id: String = js.native
  
  var moov: js.Any = js.native
}
object fragParsingInitSegmentData {
  
  @scala.inline
  def apply(codecs: js.Any, frag: Fragment, id: String, moov: js.Any): fragParsingInitSegmentData = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moov = moov.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragParsingInitSegmentData]
  }
  
  @scala.inline
  implicit class fragParsingInitSegmentDataOps[Self <: fragParsingInitSegmentData] (val x: Self) extends AnyVal {
    
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
    def setCodecs(value: js.Any): Self = this.set("codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrag(value: Fragment): Self = this.set("frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoov(value: js.Any): Self = this.set("moov", value.asInstanceOf[js.Any])
  }
}
