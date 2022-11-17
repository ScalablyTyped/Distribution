package typings.materialUiCore.anon

import typings.materialUiCore.badgeBadgeMod.BadgeOrigin
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorOrigin extends StObject {
  
  /**
    * The anchor of the badge.
    */
  var anchorOrigin: js.UndefOr[BadgeOrigin] = js.undefined
  
  /**
    * The content rendered within the badge.
    */
  var badgeContent: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * The badge will be added relative to this node.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    */
  var color: js.UndefOr["primary" | "secondary" | "default" | "error"] = js.undefined
  
  /**
    * If `true`, the badge will be invisible.
    */
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Max count to show.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Wrapped shape the badge should overlap.
    */
  var overlap: js.UndefOr["rectangle" | "circle" | "rectangular" | "circular"] = js.undefined
  
  /**
    * Controls whether the badge is hidden when `badgeContent` is zero.
    */
  var showZero: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The variant to use.
    */
  var variant: js.UndefOr["standard" | "dot"] = js.undefined
}
object AnchorOrigin {
  
  inline def apply(): AnchorOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorOrigin]
  }
  
  extension [Self <: AnchorOrigin](x: Self) {
    
    inline def setAnchorOrigin(value: BadgeOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
    
    inline def setBadgeContent(value: ReactNode): Self = StObject.set(x, "badgeContent", value.asInstanceOf[js.Any])
    
    inline def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: "primary" | "secondary" | "default" | "error"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setOverlap(value: "rectangle" | "circle" | "rectangular" | "circular"): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    inline def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
    
    inline def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
    
    inline def setVariant(value: "standard" | "dot"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
