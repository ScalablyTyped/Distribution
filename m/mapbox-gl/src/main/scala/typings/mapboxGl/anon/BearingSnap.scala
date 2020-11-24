package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BearingSnap extends js.Object {
  
  var bearingSnap: js.UndefOr[Double] = js.native
  
  var pitchWithRotate: js.UndefOr[Boolean] = js.native
}
object BearingSnap {
  
  @scala.inline
  def apply(): BearingSnap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BearingSnap]
  }
  
  @scala.inline
  implicit class BearingSnapOps[Self <: BearingSnap] (val x: Self) extends AnyVal {
    
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
    def setBearingSnap(value: Double): Self = this.set("bearingSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearingSnap: Self = this.set("bearingSnap", js.undefined)
    
    @scala.inline
    def setPitchWithRotate(value: Boolean): Self = this.set("pitchWithRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitchWithRotate: Self = this.set("pitchWithRotate", js.undefined)
  }
}
