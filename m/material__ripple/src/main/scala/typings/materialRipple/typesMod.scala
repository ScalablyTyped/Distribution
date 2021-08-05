package typings.materialRipple

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait MDCRippleAttachOpts extends StObject {
    
    var isUnbounded: js.UndefOr[Boolean] = js.undefined
  }
  object MDCRippleAttachOpts {
    
    inline def apply(): MDCRippleAttachOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDCRippleAttachOpts]
    }
    
    extension [Self <: MDCRippleAttachOpts](x: Self) {
      
      inline def setIsUnbounded(value: Boolean): Self = StObject.set(x, "isUnbounded", value.asInstanceOf[js.Any])
      
      inline def setIsUnboundedUndefined: Self = StObject.set(x, "isUnbounded", js.undefined)
    }
  }
  
  trait MDCRippleCapableSurface extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var root: Element
    
    var unbounded: js.UndefOr[Boolean] = js.undefined
  }
  object MDCRippleCapableSurface {
    
    inline def apply(root: Element): MDCRippleCapableSurface = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCRippleCapableSurface]
    }
    
    extension [Self <: MDCRippleCapableSurface](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setUnbounded(value: Boolean): Self = StObject.set(x, "unbounded", value.asInstanceOf[js.Any])
      
      inline def setUnboundedUndefined: Self = StObject.set(x, "unbounded", js.undefined)
    }
  }
  
  trait MDCRipplePoint extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object MDCRipplePoint {
    
    inline def apply(x: Double, y: Double): MDCRipplePoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCRipplePoint]
    }
    
    extension [Self <: MDCRipplePoint](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
