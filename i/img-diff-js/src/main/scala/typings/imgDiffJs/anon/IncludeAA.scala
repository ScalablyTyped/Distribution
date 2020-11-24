package typings.imgDiffJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeAA extends js.Object {
  
  /** {default:false} */
  var includeAA: js.UndefOr[Boolean] = js.native
  
  /** {default: 0.1} */
  var threshold: js.UndefOr[Double] = js.native
}
object IncludeAA {
  
  @scala.inline
  def apply(): IncludeAA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAA]
  }
  
  @scala.inline
  implicit class IncludeAAOps[Self <: IncludeAA] (val x: Self) extends AnyVal {
    
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
    def setIncludeAA(value: Boolean): Self = this.set("includeAA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAA: Self = this.set("includeAA", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
