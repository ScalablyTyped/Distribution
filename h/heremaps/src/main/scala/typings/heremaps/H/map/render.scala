package typings.heremaps.H.map

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.H.geo.PixelProjection
import typings.heremaps.H.math.Point
import typings.heremaps.H.math.Size
import typings.heremaps.H.util.EventTarget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object render {
  
  /**
    * This is an abstract class representing a render engine. Render engines are used to render the geographical position from a view model on the
    * screen (viewport element). The rendered result may be different for different engines, because every engine uses its own capabilities and
    * specific implementation to present the current view model data in best possible way. For example, 2D engines create a two-dimensional flat
    * map composed of tiles, while 3D engines can generate panoramas displaying the same coordinates as a 'street view'.
    */
  @js.native
  trait RenderEngine
    extends StObject
       with EventTarget {
    
    /**
      * This method adds a listener for a specific event.
      * Note that to prevent potential memory leaks, you must either call removeEventListener or dispose on the given object when you no longer need it.
      * @param type {string} - The name of the event
      * @param handler {!Function} - An event handler function
      * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
      * @param opt_scope {Object=} - An object defining the scope for the handler function
      */
    def addEventListener(`type`: String, handler: js.Function1[/* evt */ Event, Unit]): Unit = js.native
    def addEventListener(`type`: String, handler: js.Function1[/* evt */ Event, Unit], opt_capture: Boolean): Unit = js.native
    def addEventListener(
      `type`: String,
      handler: js.Function1[/* evt */ Event, Unit],
      opt_capture: Boolean,
      opt_scope: js.Object
    ): Unit = js.native
    def addEventListener(
      `type`: String,
      handler: js.Function1[/* evt */ Event, Unit],
      opt_capture: Unit,
      opt_scope: js.Object
    ): Unit = js.native
    
    def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
    
    /**
      * This method removes a previously added listener from the EventTarget instance.
      * @param type {string} - The name of the event
      * @param handler {!Function} - A previously added event handler
      * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
      * @param opt_scope {Object=} - An object defining the scope for the handler function
      */
    def removeEventListener(`type`: String, handler: js.Function1[/* evt */ Event, Unit]): Unit = js.native
    def removeEventListener(`type`: String, handler: js.Function1[/* evt */ Event, Unit], opt_capture: Boolean): Unit = js.native
    def removeEventListener(
      `type`: String,
      handler: js.Function1[/* evt */ Event, Unit],
      opt_capture: Boolean,
      opt_scope: js.Object
    ): Unit = js.native
    def removeEventListener(
      `type`: String,
      handler: js.Function1[/* evt */ Event, Unit],
      opt_capture: Unit,
      opt_scope: js.Object
    ): Unit = js.native
  }
  object RenderEngine {
    
    @js.native
    sealed trait InteractionModifiers extends StObject
    /**
      * This object defines the modifiers to use for H.map.ViewPort#startInteraction.
      */
    @JSGlobal("H.map.render.RenderEngine.InteractionModifiers")
    @js.native
    object InteractionModifiers extends StObject {
      
      /** changes incline angle during the interaction */
      @js.native
      sealed trait COORD
        extends StObject
           with InteractionModifiers
      
      /** changes map center during the interaction */
      @js.native
      sealed trait HEADING
        extends StObject
           with InteractionModifiers
      
      /** changes tilt angle during the interaction */
      @js.native
      sealed trait INCLINE
        extends StObject
           with InteractionModifiers
      
      /** changes heading angle during the interaction */
      @js.native
      sealed trait TILT
        extends StObject
           with InteractionModifiers
      
      /** changes zoom level during the interaction */
      @js.native
      sealed trait ZOOM
        extends StObject
           with InteractionModifiers
    }
    
    /**
      * An object containing the render engine initialization options
      */
    type Options = StringDictionary[String]
  }
  
  @js.native
  sealed trait RenderState extends StObject
  /**
    * The rendering states of the layer.
    */
  @JSGlobal("H.map.render.RenderState")
  @js.native
  object RenderState extends StObject {
    
    /** Data rendering or animation is in progress. */
    @js.native
    sealed trait ACTIVE
      extends StObject
         with RenderState
    
    /** Data rendering or animation is done. */
    @js.native
    sealed trait DONE
      extends StObject
         with RenderState
    
    /**
      * Data loading/processing is still in progress, but there is nothing to render. In this state rendering engine might go to sleep mode after
      * certain amount of time to prevent draining of battery on the user device.
      */
    @js.native
    sealed trait PENDING
      extends StObject
         with RenderState
  }
  
  /**
    * An object containing rendering parameters.
    */
  trait RenderingParams extends StObject {
    
    /**
      * The geographical area to render. Note that it is not the same as visible viewport. Specified bounds also include H.Map.Options#margin and
      * optionally an additional margin in case of DOM node rendering for a better rendering experience.
      * @type {H.geo.Rect}
      */
    var bounds: typings.heremaps.H.geo.Rect
    
    /**
      * Indicates whether only cached data should be considered.
      * @type {boolean}
      */
    var cacheOnly: Boolean
    
    /**
      * The pixelRatio to use for over-sampling in cases of high-resolution displays.
      * See https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio.
      * @type {number}
      */
    var pixelRatio: Double
    
    /**
      * The coordinates relative to the screen center where the rendering has the highest priority. If the layer has to request and/or process data
      * asynchronously, it's recommended to prioritize the rendering close to this center.
      * @type {H.math.Point}
      */
    var priorityCenter: Point
    
    /**
      * The pixel projection to use to project geographical coordinates into screen coordinates and vice versa.
      * @type {H.geo.PixelProjection}
      */
    var projection: PixelProjection
    
    /**
      * The coordinates of the screen center in CSS pixels.
      * @type {H.math.Point}
      */
    var screenCenter: Point
    
    /**
      * The size of the area to render.
      * @type {H.math.Size}
      */
    var size: Size
    
    /**
      * The zoom level to render the data for.
      * @type {number}
      */
    var zoom: Double
  }
  object RenderingParams {
    
    @scala.inline
    def apply(
      bounds: typings.heremaps.H.geo.Rect,
      cacheOnly: Boolean,
      pixelRatio: Double,
      priorityCenter: Point,
      projection: PixelProjection,
      screenCenter: Point,
      size: Size,
      zoom: Double
    ): RenderingParams = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], cacheOnly = cacheOnly.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], priorityCenter = priorityCenter.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], screenCenter = screenCenter.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderingParams]
    }
    
    @scala.inline
    implicit class RenderingParamsMutableBuilder[Self <: RenderingParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: typings.heremaps.H.geo.Rect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheOnly(value: Boolean): Self = StObject.set(x, "cacheOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityCenter(value: Point): Self = StObject.set(x, "priorityCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjection(value: PixelProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenCenter(value: Point): Self = StObject.set(x, "screenCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Contains functionality specific to 2D map rendering.
    */
  object p2d {
    
    /**
      * This class implements a map render engine. It presents a geographic location (camera data from a view model) and renders all map layers in
      * the order in which they are provided in a single 2D canvas element.
      */
    @js.native
    trait RenderEngine
      extends StObject
         with typings.heremaps.H.map.render.RenderEngine {
      
      /**
        * This method retrieves the current setting indicating the length of animations (duration) run by the the render engine in milliseconds.
        * @return {number}
        */
      def getAnimationDuration(): Double = js.native
      
      /**
        * This method retrieves the current setting representing the easing to be applied to animations.
        * @return {Function(number) => number} - A numeric value in the range 0 to 1
        */
      def getAnimationEase(): js.Function1[/* progress */ Double, Double] = js.native
      
      /**
        * This method resets animation settings on the render engine to defaults.
        * Duration is set to 300ms and easing to H.util.animation.ease.EASE_OUT_QUAD.
        */
      def resetAnimationDefaults(): Unit = js.native
      
      /**
        * This method sets the length (duration) for all animations run by the render engine in milliseconds.
        * @param duration {number} - A value indicating the duration of animations in milliseconds
        */
      def setAnimationDuration(duration: Double): Unit = js.native
      
      /**
        * This method sets a value indicating the easing to apply to animations run by the render engine.
        * @param easeFunction {Function(number)} - A function that alters the progress ratio of an animation. It receives an argument indicating
        * animation progress as a numeric value in the range between 0 and 1 and must return a numeric value in the same range.
        */
      def setAnimationEase(easeFunction: js.Function1[/* progress */ Double, Double]): Unit = js.native
    }
    object RenderEngine {
      
      trait Options extends StObject {
        
        /** optional */
        var enableSubpixelRendering: js.UndefOr[Boolean] = js.undefined
        
        /** The pixelRatio to use for over-sampling in cases of high-resolution displays */
        var pixelRatio: Double
        
        /** Object describes how many cached zoom levels should be used as a base map background while base map tiles are */
        var renderBaseBackground: js.UndefOr[js.Object] = js.undefined
      }
      object Options {
        
        @scala.inline
        def apply(pixelRatio: Double): Options = {
          val __obj = js.Dynamic.literal(pixelRatio = pixelRatio.asInstanceOf[js.Any])
          __obj.asInstanceOf[Options]
        }
        
        @scala.inline
        implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEnableSubpixelRendering(value: Boolean): Self = StObject.set(x, "enableSubpixelRendering", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnableSubpixelRenderingUndefined: Self = StObject.set(x, "enableSubpixelRendering", js.undefined)
          
          @scala.inline
          def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRenderBaseBackground(value: js.Object): Self = StObject.set(x, "renderBaseBackground", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRenderBaseBackgroundUndefined: Self = StObject.set(x, "renderBaseBackground", js.undefined)
        }
      }
    }
  }
}
