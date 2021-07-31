package typings.materialMenuSurface

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait MDCMenuDimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object MDCMenuDimensions {
    
    @scala.inline
    def apply(height: Double, width: Double): MDCMenuDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCMenuDimensions]
    }
    
    @scala.inline
    implicit class MDCMenuDimensionsMutableBuilder[Self <: MDCMenuDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDCMenuDistance extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object MDCMenuDistance {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): MDCMenuDistance = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCMenuDistance]
    }
    
    @scala.inline
    implicit class MDCMenuDistanceMutableBuilder[Self <: MDCMenuDistance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDCMenuPoint extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object MDCMenuPoint {
    
    @scala.inline
    def apply(x: Double, y: Double): MDCMenuPoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCMenuPoint]
    }
    
    @scala.inline
    implicit class MDCMenuPointMutableBuilder[Self <: MDCMenuPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
