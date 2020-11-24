package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video Offset
  */
@js.native
trait SchemaVideoOffset extends js.Object {
  
  /**
    * Duration, as a percentage of video duration. Do not set when
    * offsetSeconds is set. Acceptable values are 0 to 100, inclusive.
    */
  var offsetPercentage: js.UndefOr[Double] = js.native
  
  /**
    * Duration, in seconds. Do not set when offsetPercentage is set. Acceptable
    * values are 0 to 86399, inclusive.
    */
  var offsetSeconds: js.UndefOr[Double] = js.native
}
object SchemaVideoOffset {
  
  @scala.inline
  def apply(): SchemaVideoOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoOffset]
  }
  
  @scala.inline
  implicit class SchemaVideoOffsetOps[Self <: SchemaVideoOffset] (val x: Self) extends AnyVal {
    
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
    def setOffsetPercentage(value: Double): Self = this.set("offsetPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetPercentage: Self = this.set("offsetPercentage", js.undefined)
    
    @scala.inline
    def setOffsetSeconds(value: Double): Self = this.set("offsetSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetSeconds: Self = this.set("offsetSeconds", js.undefined)
  }
}
