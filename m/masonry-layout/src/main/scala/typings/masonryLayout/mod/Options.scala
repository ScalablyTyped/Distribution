package typings.masonryLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var columnWidth: js.UndefOr[js.Any] = js.native
  
  // setup
  var containerStyle: js.UndefOr[js.Object] = js.native
  
  var fitWidth: js.UndefOr[Boolean] = js.native
  
  var gutter: js.UndefOr[js.Any] = js.native
  
  var hiddenStyle: js.UndefOr[HiddenOrVisibleStyleOption] = js.native
  
  var horizontalOrder: js.UndefOr[Boolean] = js.native
  
  var initLayout: js.UndefOr[Boolean] = js.native
  
  // layout
  var itemSelector: js.UndefOr[String] = js.native
  
  var originLeft: js.UndefOr[Boolean] = js.native
  
  var originTop: js.UndefOr[Boolean] = js.native
  
  var percentPosition: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[Boolean] = js.native
  
  var stagger: js.UndefOr[String | Double] = js.native
  
  var stamp: js.UndefOr[String] = js.native
  
  var transitionDuration: js.UndefOr[js.Any] = js.native
  
  var visibleStyle: js.UndefOr[HiddenOrVisibleStyleOption] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setColumnWidth(value: js.Any): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: js.Object): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setFitWidth(value: Boolean): Self = this.set("fitWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitWidth: Self = this.set("fitWidth", js.undefined)
    
    @scala.inline
    def setGutter(value: js.Any): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setHiddenStyle(value: HiddenOrVisibleStyleOption): Self = this.set("hiddenStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenStyle: Self = this.set("hiddenStyle", js.undefined)
    
    @scala.inline
    def setHorizontalOrder(value: Boolean): Self = this.set("horizontalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOrder: Self = this.set("horizontalOrder", js.undefined)
    
    @scala.inline
    def setInitLayout(value: Boolean): Self = this.set("initLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitLayout: Self = this.set("initLayout", js.undefined)
    
    @scala.inline
    def setItemSelector(value: String): Self = this.set("itemSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSelector: Self = this.set("itemSelector", js.undefined)
    
    @scala.inline
    def setOriginLeft(value: Boolean): Self = this.set("originLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginLeft: Self = this.set("originLeft", js.undefined)
    
    @scala.inline
    def setOriginTop(value: Boolean): Self = this.set("originTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginTop: Self = this.set("originTop", js.undefined)
    
    @scala.inline
    def setPercentPosition(value: Boolean): Self = this.set("percentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentPosition: Self = this.set("percentPosition", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setStagger(value: String | Double): Self = this.set("stagger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStagger: Self = this.set("stagger", js.undefined)
    
    @scala.inline
    def setStamp(value: String): Self = this.set("stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStamp: Self = this.set("stamp", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: js.Any): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setVisibleStyle(value: HiddenOrVisibleStyleOption): Self = this.set("visibleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleStyle: Self = this.set("visibleStyle", js.undefined)
  }
}
