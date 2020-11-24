package typings.layuiSrc.layui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilBarOption extends js.Object {
  
  var bar1: js.UndefOr[Boolean | String] = js.native
  
  var bar2: js.UndefOr[Boolean | String] = js.native
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var click: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.native
  
  var css: js.UndefOr[StringDictionary[String | Double]] = js.native
  
  var showHeight: js.UndefOr[Double] = js.native
}
object UtilBarOption {
  
  @scala.inline
  def apply(): UtilBarOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilBarOption]
  }
  
  @scala.inline
  implicit class UtilBarOptionOps[Self <: UtilBarOption] (val x: Self) extends AnyVal {
    
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
    def setBar1(value: Boolean | String): Self = this.set("bar1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar1: Self = this.set("bar1", js.undefined)
    
    @scala.inline
    def setBar2(value: Boolean | String): Self = this.set("bar2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar2: Self = this.set("bar2", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    
    @scala.inline
    def setClick(value: /* type */ String => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setCss(value: StringDictionary[String | Double]): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setShowHeight(value: Double): Self = this.set("showHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeight: Self = this.set("showHeight", js.undefined)
  }
}
