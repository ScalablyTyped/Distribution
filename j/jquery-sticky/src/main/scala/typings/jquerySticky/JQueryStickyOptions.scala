package typings.jquerySticky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStickyOptions extends js.Object {
  
  /**
    * Pixels between the page bottom and the element's bottom.
    * @default 0
    */
  var bottomSpacing: js.UndefOr[Double] = js.native
  
  /**
    * Boolean determining whether the sticky element should be horizontally centered in the page.
    * @default false
    */
  var center: js.UndefOr[Boolean] = js.native
  
  /**
    * CSS class added to the element's wrapper when "sticked".
    * @default is-sticky
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Selector of element referenced to set fixed width of "sticky" element.
    * @default ''
    */
  var getWidthFrom: js.UndefOr[String] = js.native
  
  /**
    * Boolean determining whether widths will be recalculated on window resize (using getWidthfrom).
    * @default false
    */
  var responsiveWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * Pixels between the page top and the element's top.
    * @default 0
    */
  var topSpacing: js.UndefOr[Double] = js.native
  
  /**
    * Boolean determining whether width of the "sticky" element should be updated to match the wrapper's width.
    * Wrapper is a placeholder for "sticky" element while it is fixed (out of static elements flow), and its width depends on the context and CSS rules.
    * Works only as long getWidthForm isn't set.
    * @default true
    */
  var widthFromWrapper: js.UndefOr[Boolean] = js.native
  
  /**
    * CSS class added to the wrapper.
    * @default 'sticky-wrapper'
    */
  var wrapperClassName: js.UndefOr[String] = js.native
  
  /**
    * Controls z-index of the sticked element.
    * @default inherit
    */
  var zIndex: js.UndefOr[String] = js.native
}
object JQueryStickyOptions {
  
  @scala.inline
  def apply(): JQueryStickyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStickyOptions]
  }
  
  @scala.inline
  implicit class JQueryStickyOptionsOps[Self <: JQueryStickyOptions] (val x: Self) extends AnyVal {
    
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
    def setBottomSpacing(value: Double): Self = this.set("bottomSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomSpacing: Self = this.set("bottomSpacing", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setGetWidthFrom(value: String): Self = this.set("getWidthFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetWidthFrom: Self = this.set("getWidthFrom", js.undefined)
    
    @scala.inline
    def setResponsiveWidth(value: Boolean): Self = this.set("responsiveWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveWidth: Self = this.set("responsiveWidth", js.undefined)
    
    @scala.inline
    def setTopSpacing(value: Double): Self = this.set("topSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopSpacing: Self = this.set("topSpacing", js.undefined)
    
    @scala.inline
    def setWidthFromWrapper(value: Boolean): Self = this.set("widthFromWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthFromWrapper: Self = this.set("widthFromWrapper", js.undefined)
    
    @scala.inline
    def setWrapperClassName(value: String): Self = this.set("wrapperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperClassName: Self = this.set("wrapperClassName", js.undefined)
    
    @scala.inline
    def setZIndex(value: String): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
