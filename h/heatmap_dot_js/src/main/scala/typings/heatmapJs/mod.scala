package typings.heatmapJs

import org.scalablytyped.runtime.StringDictionary
import typings.heatmapJs.anon.X
import typings.leaflet.mod.Map_
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("heatmap.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("heatmap.js", "Heatmap")
  @js.native
  class Heatmap[V /* <: String */, X /* <: String */, Y /* <: String */] () extends StObject {
    
    def addData(dataPoint: js.Array[DataPoint[V, X, Y]]): this.type = js.native
    /**
      * Use this functionality only for adding datapoints on the fly, not for data
      * initialization! heatmapInstance.addData adds a single or multiple
      * datapoints to the heatmap's datastore.
      *
      * @example <caption>A single datapoint</caption>
      *
      * var dataPoint = {
      *   x: 5, // x coordinate of the datapoint, a number
      *   y: 5, // y coordinate of the datapoint, a number
      *   value: 100 // the value at datapoint(x, y)
      * };
      * heatmapInstance.addData(dataPoint);
      *
      * @example <caption>multiple datapoints</caption>
      *
      * // for data initialization use setData!!
      * var dataPoints = [dataPoint, dataPoint, dataPoint, dataPoint];
      * heatmapInstance.addData(dataPoints);
      */
    def addData(dataPoint: DataPoint[V, X, Y]): this.type = js.native
    
    /**
      * Reconfigures a heatmap instance after it has been initialized. Triggers a
      * complete rerendering.
      *
      * NOTE: This returns a reference to itself, but also offers an opportunity
      * to change the `xField`, `yField` and `valueField` options, which can
      * change the type of the `Heatmap` instance.
      *
      * @example
      *
      * var nuConfig = {
      *   radius: 10,
      *   maxOpacity: .5,
      *   minOpacity: 0,
      *   blur: .75
      * };
      * heatmapInstance.configure(nuConfig);
      */
    def configure[Vn /* <: String */, Xn /* <: String */, Yn /* <: String */](configObject: HeatmapConfiguration[Vn, Xn, Yn]): Heatmap[Vn, Xn, Yn] = js.native
    
    /**
      * Returns a persistable and reimportable (with setData) JSON object.
      *
      * @example
      *
      * var currentData = heatmapInstance.getData();
      * // now let's create a new instance and set the data
      * var heatmap2 = h337.create(config);
      * heatmap2.setData(currentData); // now both heatmap instances have the same content
      */
    def getData(): HeatmapData[DataCircle] = js.native
    
    /**
      * Returns dataURL string.
      *
      * The returned value is the base64 encoded dataURL of the heatmap instance.
      *
      * @example
      *
      * heatmapInstance.getDataURL(); // data:image/png;base64...
      * // ready for saving locally or on the server
      */
    def getDataURL(): String = js.native
    
    /**
      * Returns value at datapoint position.
      *
      * The returned value is an interpolated value based on the gradient blending
      * if point is not in store.
      *
      * @example
      *
      * heatmapInstance.addData({ x: 10, y: 10, value: 100});
      * // get the value at x=10, y=10
      * heatmapInstance.getValueAt({ x: 10, y: 10 }); // returns 100
      */
    def getValueAt(point: X): Double = js.native
    
    /**
      * Repaints the whole heatmap canvas.
      */
    def repaint(): this.type = js.native
    
    /**
      * Initialize a heatmap instance with the given dataset. Removes all
      * previously existing points from the heatmap instance and re-initializes
      * the datastore.
      *
      * @example
      *
      * var data = {
      *   max: 100,
      *   min: 0,
      *   data: [
      *     dataPoint, dataPoint, dataPoint, dataPoint
      *   ]
      * };
      * heatmapInstance.setData(data);
      */
    def setData(data: HeatmapData[DataPoint[V, X, Y]]): this.type = js.native
    
    /**
      * Changes the upper bound of your dataset and triggers a complete
      * rerendering.
      *
      * @example
      *
      * heatmapInstance.setDataMax(200);
      * // setting the maximum value triggers a complete rerendering of the heatmap
      * heatmapInstance.setDataMax(100);
      */
    def setDataMax(number: Double): this.type = js.native
    
    /**
      * Changes the lower bound of your dataset and triggers a complete
      * rerendering.
      *
      * @example
      *
      * heatmapInstance.setDataMin(10);
      * // setting the minimum value triggers a complete rerendering of the heatmap
      * heatmapInstance.setDataMin(0);
      */
    def setDataMin(number: Double): this.type = js.native
  }
  
  @scala.inline
  def create[V /* <: String */, X /* <: String */, Y /* <: String */](configObject: HeatmapConfiguration[V, X, Y]): Heatmap[V, X, Y] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(configObject.asInstanceOf[js.Any]).asInstanceOf[Heatmap[V, X, Y]]
  
  object global {
    
    /**
      * The overlay layer to be added onto leaflet map
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Leaflet.ILayer * / any */ @JSGlobal("HeatmapOverlay")
    @js.native
    class HeatmapOverlay[V /* <: String */, TLat /* <: String */, TLng /* <: String */] protected () extends StObject {
      /**
        * Initialization function
        */
      def this(configuration: HeatmapOverlayConfiguration[V, TLat, TLng]) = this()
      
      def addData(data: js.Array[DataPoint[V, TLat, TLng]]): Unit = js.native
      /**
        * Experimential... not ready.
        */
      def addData(data: DataPoint[V, TLat, TLng]): Unit = js.native
      
      /**
        * Create DOM elements for an overlay, adding them to map panes and puts
        * listeners on relevant map events
        */
      def onAdd(map: Map_): Unit = js.native
      
      /**
        * Remove the overlay's elements from the DOM and remove listeners
        * previously added by onAdd()
        */
      def onRemove(map: Map_): Unit = js.native
      
      /**
        * Initialize a heatmap instance with the given dataset
        */
      def setData(data: HeatmapData[DataPoint[V, TLat, TLng]]): Unit = js.native
    }
  }
  
  @scala.inline
  def register(pluginKey: String, plugin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(pluginKey.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BaseHeatmapConfiguration[V /* <: String */] extends StObject {
    
    /**
      * A background color string in form of hexcode, color name, or rgb(a)
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * The blur factor that will be applied to all datapoints. The higher the
      * blur factor is, the smoother the gradients will be
      * Default value: 0.85
      */
    var blur: js.UndefOr[Double] = js.undefined
    
    /**
      * An object that represents the gradient.
      * Syntax: {[key: number in range [0,1]]: color}
      */
    var gradient: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The maximal opacity the highest value in the heatmap will have. (will be
      * overridden if opacity set)
      * Default value: 0.6
      */
    var maxOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum opacity the lowest value in the heatmap will have (will be
      * overridden if opacity set)
      */
    var minOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Pass a callback to receive extrema change updates. Useful for DOM
      * legends.
      */
    var onExtremaChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A global opacity for the whole heatmap. This overrides maxOpacity and
      * minOpacity if set
      * Default value: 0.6
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * The radius each datapoint will have (if not specified on the datapoint
      * itself)
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /**
      * Scales the radius based on map zoom.
      */
    var scaleRadius: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicate whether the heatmap should use a global extrema or a local
      * extrema (the maximum and minimum of the currently displayed viewport)
      */
    var useLocalExtrema: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The property name of the value/weight in a datapoint
      * Default value: 'value'
      */
    var valueField: js.UndefOr[V] = js.undefined
  }
  object BaseHeatmapConfiguration {
    
    @scala.inline
    def apply[V /* <: String */](): BaseHeatmapConfiguration[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseHeatmapConfiguration[V]]
    }
    
    @scala.inline
    implicit class BaseHeatmapConfigurationMutableBuilder[Self <: BaseHeatmapConfiguration[?], V /* <: String */] (val x: Self & BaseHeatmapConfiguration[V]) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setGradient(value: StringDictionary[String]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      @scala.inline
      def setMaxOpacity(value: Double): Self = StObject.set(x, "maxOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOpacityUndefined: Self = StObject.set(x, "maxOpacity", js.undefined)
      
      @scala.inline
      def setMinOpacity(value: Double): Self = StObject.set(x, "minOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinOpacityUndefined: Self = StObject.set(x, "minOpacity", js.undefined)
      
      @scala.inline
      def setOnExtremaChange(value: () => Unit): Self = StObject.set(x, "onExtremaChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExtremaChangeUndefined: Self = StObject.set(x, "onExtremaChange", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setScaleRadius(value: Boolean): Self = StObject.set(x, "scaleRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleRadiusUndefined: Self = StObject.set(x, "scaleRadius", js.undefined)
      
      @scala.inline
      def setUseLocalExtrema(value: Boolean): Self = StObject.set(x, "useLocalExtrema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLocalExtremaUndefined: Self = StObject.set(x, "useLocalExtrema", js.undefined)
      
      @scala.inline
      def setValueField(value: V): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    }
  }
  
  trait DataCircle extends StObject {
    
    var radius: Double
    
    var value: Double
    
    var x: Double
    
    var y: Double
  }
  object DataCircle {
    
    @scala.inline
    def apply(radius: Double, value: Double, x: Double, y: Double): DataCircle = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataCircle]
    }
    
    @scala.inline
    implicit class DataCircleMutableBuilder[Self <: DataCircle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type DataPoint[V /* <: String */, X /* <: String */, Y /* <: String */] = Record[V | X | Y, Double]
  
  trait HeatmapConfiguration[V /* <: String */, X /* <: String */, Y /* <: String */]
    extends StObject
       with BaseHeatmapConfiguration[V] {
    
    /**
      * A DOM node where the heatmap canvas should be appended (heatmap will adapt to
      * the node's size)
      */
    var container: HTMLElement
    
    /**
      * The property name of your x coordinate in a datapoint
      * Default value: 'x'
      */
    var xField: js.UndefOr[X] = js.undefined
    
    /**
      * The property name of your y coordinate in a datapoint
      * Default value: 'y'
      */
    var yField: js.UndefOr[Y] = js.undefined
  }
  object HeatmapConfiguration {
    
    @scala.inline
    def apply[V /* <: String */, X /* <: String */, Y /* <: String */](container: HTMLElement): HeatmapConfiguration[V, X, Y] = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatmapConfiguration[V, X, Y]]
    }
    
    @scala.inline
    implicit class HeatmapConfigurationMutableBuilder[Self <: HeatmapConfiguration[?, ?, ?], V /* <: String */, X /* <: String */, Y /* <: String */] (val x: Self & (HeatmapConfiguration[V, X, Y])) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXField(value: X): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
      
      @scala.inline
      def setYField(value: Y): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
  
  trait HeatmapData[T] extends StObject {
    
    /**
      * An array of data points
      */
    var data: js.Array[T]
    
    /**
      * Max value of the valueField
      */
    var max: Double
    
    /**
      * Min value of the valueField
      */
    var min: Double
  }
  object HeatmapData {
    
    @scala.inline
    def apply[T](data: js.Array[T], max: Double, min: Double): HeatmapData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatmapData[T]]
    }
    
    @scala.inline
    implicit class HeatmapDataMutableBuilder[Self <: HeatmapData[?], T] (val x: Self & HeatmapData[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeatmapOverlayConfiguration[V /* <: String */, TLat /* <: String */, TLong /* <: String */]
    extends StObject
       with BaseHeatmapConfiguration[V] {
    
    /**
      * The property name of your latitude coordinate in a datapoint
      * Default value: 'x'
      */
    var latField: js.UndefOr[TLat] = js.undefined
    
    /**
      * The property name of your longitude coordinate in a datapoint
      * Default value: 'y'
      */
    var lngField: js.UndefOr[TLong] = js.undefined
  }
  object HeatmapOverlayConfiguration {
    
    @scala.inline
    def apply[V /* <: String */, TLat /* <: String */, TLong /* <: String */](): HeatmapOverlayConfiguration[V, TLat, TLong] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeatmapOverlayConfiguration[V, TLat, TLong]]
    }
    
    @scala.inline
    implicit class HeatmapOverlayConfigurationMutableBuilder[Self <: HeatmapOverlayConfiguration[?, ?, ?], V /* <: String */, TLat /* <: String */, TLong /* <: String */] (val x: Self & (HeatmapOverlayConfiguration[V, TLat, TLong])) extends AnyVal {
      
      @scala.inline
      def setLatField(value: TLat): Self = StObject.set(x, "latField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatFieldUndefined: Self = StObject.set(x, "latField", js.undefined)
      
      @scala.inline
      def setLngField(value: TLong): Self = StObject.set(x, "lngField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLngFieldUndefined: Self = StObject.set(x, "lngField", js.undefined)
    }
  }
}
