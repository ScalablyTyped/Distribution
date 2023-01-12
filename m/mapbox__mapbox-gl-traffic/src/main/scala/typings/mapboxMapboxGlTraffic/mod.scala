package typings.mapboxMapboxGlTraffic

import typings.mapboxGl.mod.Map
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/mapbox-gl-traffic", JSImport.Namespace)
  @js.native
  /**
    * Create a new [Mapbox GL JS plugin](https://www.mapbox.com/blog/build-mapbox-gl-js-plugins/) that allows you to hide and show
    * traffic layers in your map and an optional toggle button.
    *
    * @param options - Options to configure the plugin.
    */
  open class ^ ()
    extends StObject
       with MapboxTraffic {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def _hasTraffic(): Boolean = js.native
    
    /* CompleteClass */
    override def _hideTraffic(): Unit = js.native
    
    /* CompleteClass */
    override def _showTraffic(): Unit = js.native
    
    /* CompleteClass */
    override def onAdd(map: Map): HTMLDivElement = js.native
    
    /* CompleteClass */
    override def onRemove(): Unit = js.native
    
    /* CompleteClass */
    override def render(): Unit = js.native
    
    /**
      * Toggle visibility of traffic layer.
      */
    /* CompleteClass */
    override def toggleTraffic(): Unit = js.native
  }
  
  trait MapboxTraffic extends StObject {
    
    def _hasTraffic(): Boolean
    
    def _hideTraffic(): Unit
    
    def _showTraffic(): Unit
    
    def onAdd(map: Map): HTMLDivElement
    
    def onRemove(): Unit
    
    def render(): Unit
    
    /**
      * Toggle visibility of traffic layer.
      */
    def toggleTraffic(): Unit
  }
  object MapboxTraffic {
    
    inline def apply(
      _hasTraffic: () => Boolean,
      _hideTraffic: () => Unit,
      _showTraffic: () => Unit,
      onAdd: Map => HTMLDivElement,
      onRemove: () => Unit,
      render: () => Unit,
      toggleTraffic: () => Unit
    ): MapboxTraffic = {
      val __obj = js.Dynamic.literal(_hasTraffic = js.Any.fromFunction0(_hasTraffic), _hideTraffic = js.Any.fromFunction0(_hideTraffic), _showTraffic = js.Any.fromFunction0(_showTraffic), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction0(onRemove), render = js.Any.fromFunction0(render), toggleTraffic = js.Any.fromFunction0(toggleTraffic))
      __obj.asInstanceOf[MapboxTraffic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapboxTraffic] (val x: Self) extends AnyVal {
      
      inline def setOnAdd(value: Map => HTMLDivElement): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnRemove(value: () => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction0(value))
      
      inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      inline def setToggleTraffic(value: () => Unit): Self = StObject.set(x, "toggleTraffic", js.Any.fromFunction0(value))
      
      inline def set_hasTraffic(value: () => Boolean): Self = StObject.set(x, "_hasTraffic", js.Any.fromFunction0(value))
      
      inline def set_hideTraffic(value: () => Unit): Self = StObject.set(x, "_hideTraffic", js.Any.fromFunction0(value))
      
      inline def set_showTraffic(value: () => Unit): Self = StObject.set(x, "_showTraffic", js.Any.fromFunction0(value))
    }
  }
  
  /** Options to configure the `MapboxTraffic` plugin. */
  trait Options extends StObject {
    
    /**
      * Show or hide traffic overlay by default.
      *
      * @default false
      */
    var showTraffic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show a toggle button to turn traffic on and off.
      *
      * @default true
      */
    var showTrafficButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The traffic source regex used to determine whether a layer displays traffic or not.
      *
      * @default /mapbox-traffic-v\d/
      */
    var trafficSource: js.UndefOr[js.RegExp] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setShowTraffic(value: Boolean): Self = StObject.set(x, "showTraffic", value.asInstanceOf[js.Any])
      
      inline def setShowTrafficButton(value: Boolean): Self = StObject.set(x, "showTrafficButton", value.asInstanceOf[js.Any])
      
      inline def setShowTrafficButtonUndefined: Self = StObject.set(x, "showTrafficButton", js.undefined)
      
      inline def setShowTrafficUndefined: Self = StObject.set(x, "showTraffic", js.undefined)
      
      inline def setTrafficSource(value: js.RegExp): Self = StObject.set(x, "trafficSource", value.asInstanceOf[js.Any])
      
      inline def setTrafficSourceUndefined: Self = StObject.set(x, "trafficSource", js.undefined)
    }
  }
}
