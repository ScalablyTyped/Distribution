package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var containerClassName: js.UndefOr[String] = js.native
  
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  
  var disableSwipeToOpen: js.UndefOr[Boolean] = js.native
  
  var docked: js.UndefOr[Boolean] = js.native
  
  var onRequestChange: js.UndefOr[js.Function2[/* opening */ Boolean, /* reason */ String, Unit]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var openSecondary: js.UndefOr[Boolean] = js.native
  
  var overlayClassName: js.UndefOr[String] = js.native
  
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var swipeAreaWidth: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var zDepth: js.UndefOr[Double] = js.native
}
object DrawerProps {
  
  @scala.inline
  def apply(): DrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerProps]
  }
  
  @scala.inline
  implicit class DrawerPropsMutableBuilder[Self <: DrawerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setDisableSwipeToOpen(value: Boolean): Self = StObject.set(x, "disableSwipeToOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSwipeToOpenUndefined: Self = StObject.set(x, "disableSwipeToOpen", js.undefined)
    
    @scala.inline
    def setDocked(value: Boolean): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
    
    @scala.inline
    def setOnRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Unit): Self = StObject.set(x, "onRequestChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRequestChangeUndefined: Self = StObject.set(x, "onRequestChange", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenSecondary(value: Boolean): Self = StObject.set(x, "openSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenSecondaryUndefined: Self = StObject.set(x, "openSecondary", js.undefined)
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
    
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSwipeAreaWidth(value: Double): Self = StObject.set(x, "swipeAreaWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeAreaWidthUndefined: Self = StObject.set(x, "swipeAreaWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
  }
}
