package typings.lazyBrush

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lazy-brush", "LazyBrush")
  @js.native
  class LazyBrush () extends StObject {
    def this(options: Options) = this()
    
    var _hasMoved: Boolean = js.native
    
    var _isEnabled: Boolean = js.native
    
    var angle: Double = js.native
    
    var brush: LazyPoint = js.native
    
    /**
      * Return if the previous update has moved the brush
      */
    def brushHasMoved(): Boolean = js.native
    
    /**
      * Disable lazy brush calculations
      */
    def disable(): Unit = js.native
    
    var distance: Double = js.native
    
    /**
      * Enable lazy brush calculations
      */
    def enable(): Unit = js.native
    
    /**
      * Return the angle between pointer and brush
      */
    def getAngle(): Double = js.native
    
    /**
      * Return the brush as a LazyPoint
      */
    def getBrush(): LazyPoint = js.native
    
    /**
      * Return the brush coordinates as a simple object
      */
    def getBrushCoordinates(): Coordinates = js.native
    
    /**
      * Return the distance between pointer and brush
      */
    def getDistance(): Double = js.native
    
    /**
      * Return the pointer as a LazyPoint
      */
    def getPointer(): LazyPoint = js.native
    
    /**
      * Return the pointer coordinates as a simple object
      */
    def getPointerCoordinates(): Coordinates = js.native
    
    /**
      * Return the current radius
      */
    def getRadius(): Double = js.native
    
    def isEnabled(): Boolean = js.native
    
    var pointer: LazyPoint = js.native
    
    var radius: Double = js.native
    
    /**
      * Update the radius
      */
    def setRadius(radius: Double): Unit = js.native
    
    /**
      * Updates the pointer coordinates and calculates the new brush point
      */
    def update(coordinates: Coordinates): Boolean = js.native
    def update(coordinates: Coordinates, options: UpdateOptions): Boolean = js.native
  }
  
  @JSImport("lazy-brush", "LazyPoint")
  @js.native
  class LazyPoint protected () extends Point {
    def this(x: Double, y: Double) = this()
    
    /**
      * Check if this point is the same as another point
      */
    def equalsTo(point: Coordinates): Boolean = js.native
    
    /**
      * Calculate the angle to another point
      */
    def getAngleTo(point: Coordinates): Double = js.native
    
    /**
      * Get the difference for x and y axis to another point
      */
    def getDifferenceTo(point: Coordinates): Point = js.native
    
    /**
      * Calculate distance to another point
      */
    def getDistanceTo(point: Coordinates): Double = js.native
    
    /**
      * Move the point to another position using an angle and distance
      */
    def moveByAngle(angle: Double, distance: Double): Unit = js.native
    
    /**
      * Return a simple object with x and y properties
      */
    def toObject(): Coordinates = js.native
    
    /**
      * Update the x and y values
      */
    def update(coordinates: Coordinates): Unit = js.native
  }
  
  @JSImport("lazy-brush", "Point")
  @js.native
  class Point protected ()
    extends StObject
       with Coordinates {
    def this(x: Double, y: Double) = this()
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  trait Coordinates extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Coordinates {
    
    @scala.inline
    def apply(x: Double, y: Double): Coordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinates]
    }
    
    @scala.inline
    implicit class CoordinatesMutableBuilder[Self <: Coordinates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var initialPoint: js.UndefOr[Coordinates] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setInitialPoint(value: Coordinates): Self = StObject.set(x, "initialPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPointUndefined: Self = StObject.set(x, "initialPoint", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  trait UpdateOptions extends StObject {
    
    var both: Boolean
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(both: Boolean): UpdateOptions = {
      val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoth(value: Boolean): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    }
  }
}
