package typings.jquerySticky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStickyOptions extends StObject {
  
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
  implicit class JQueryStickyOptionsMutableBuilder[Self <: JQueryStickyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomSpacing(value: Double): Self = StObject.set(x, "bottomSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomSpacingUndefined: Self = StObject.set(x, "bottomSpacing", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setGetWidthFrom(value: String): Self = StObject.set(x, "getWidthFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWidthFromUndefined: Self = StObject.set(x, "getWidthFrom", js.undefined)
    
    @scala.inline
    def setResponsiveWidth(value: Boolean): Self = StObject.set(x, "responsiveWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveWidthUndefined: Self = StObject.set(x, "responsiveWidth", js.undefined)
    
    @scala.inline
    def setTopSpacing(value: Double): Self = StObject.set(x, "topSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopSpacingUndefined: Self = StObject.set(x, "topSpacing", js.undefined)
    
    @scala.inline
    def setWidthFromWrapper(value: Boolean): Self = StObject.set(x, "widthFromWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthFromWrapperUndefined: Self = StObject.set(x, "widthFromWrapper", js.undefined)
    
    @scala.inline
    def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
    
    @scala.inline
    def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
