package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleLayout
  extends Layout
     with _AnyLayout {
  
  var `circle-sort-key`: js.UndefOr[Double | Expression] = js.native
}
object CircleLayout {
  
  @scala.inline
  def apply(): CircleLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleLayout]
  }
  
  @scala.inline
  implicit class CircleLayoutOps[Self <: CircleLayout] (val x: Self) extends AnyVal {
    
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
    def `setCircle-sort-key`(value: Double | Expression): Self = this.set("circle-sort-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-sort-key`: Self = this.set("circle-sort-key", js.undefined)
  }
}
