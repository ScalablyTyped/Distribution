package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeProps extends StObject {
  
  var badgeContent: ReactNode
  
  var badgeStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var primary: js.UndefOr[Boolean] = js.undefined
  
  var secondary: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object BadgeProps {
  
  @scala.inline
  def apply(): BadgeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeProps]
  }
  
  @scala.inline
  implicit class BadgePropsMutableBuilder[Self <: BadgeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadgeContent(value: ReactNode): Self = StObject.set(x, "badgeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
    
    @scala.inline
    def setBadgeStyle(value: CSSProperties): Self = StObject.set(x, "badgeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeStyleUndefined: Self = StObject.set(x, "badgeStyle", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
