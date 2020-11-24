package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferingEventUIParam extends js.Object {
  
  /**
    * Get buffered percentage.
    */
  var buffered: js.UndefOr[Double] = js.native
  
  /**
    * Get the url of the playing video.
    */
  var source: js.UndefOr[String] = js.native
}
object BufferingEventUIParam {
  
  @scala.inline
  def apply(): BufferingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferingEventUIParam]
  }
  
  @scala.inline
  implicit class BufferingEventUIParamOps[Self <: BufferingEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setBuffered(value: Double): Self = this.set("buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffered: Self = this.set("buffered", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
