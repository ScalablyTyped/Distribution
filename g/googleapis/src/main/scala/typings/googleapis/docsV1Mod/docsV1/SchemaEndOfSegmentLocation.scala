package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location at the end of a body, header, footer or footnote. The location is
  * immediately before the last newline in the document segment.
  */
@js.native
trait SchemaEndOfSegmentLocation extends js.Object {
  
  /**
    * The ID of the header, footer or footnote the location is in. An empty
    * segment ID signifies the document&#39;s body.
    */
  var segmentId: js.UndefOr[String] = js.native
}
object SchemaEndOfSegmentLocation {
  
  @scala.inline
  def apply(): SchemaEndOfSegmentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndOfSegmentLocation]
  }
  
  @scala.inline
  implicit class SchemaEndOfSegmentLocationOps[Self <: SchemaEndOfSegmentLocation] (val x: Self) extends AnyVal {
    
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
    def setSegmentId(value: String): Self = this.set("segmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentId: Self = this.set("segmentId", js.undefined)
  }
}
