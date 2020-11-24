package typings.heremaps.global.H.map

import typings.heremaps.H.map.render.RenderEngine.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("H.map.render")
@js.native
object render extends js.Object {
  
  /**
    * This is an abstract class representing a render engine. Render engines are used to render the geographical position from a view model on the
    * screen (viewport element). The rendered result may be different for different engines, because every engine uses its own capabilities and
    * specific implementation to present the current view model data in best possible way. For example, 2D engines create a two-dimensional flat
    * map composed of tiles, while 3D engines can generate panoramas displaying the same coordinates as a 'street view'.
    */
  @js.native
  class RenderEngine protected ()
    extends typings.heremaps.H.map.render.RenderEngine {
    /**
      * Constructor
      * @param viewPort {H.map.ViewPort} - An object representing the map viewport
      * @param viewModel {H.map.ViewModel} - An object representing a view of the map
      * @param dataModel {H.map.DataModel} - An object encapsulating the data to be rendered on the map (layers and objects)
      * @param options {H.map.render.RenderEngine.Options} - An object containing the render engine initialization options
      */
    def this(
      viewPort: typings.heremaps.H.map.ViewPort,
      viewModel: typings.heremaps.H.map.ViewModel,
      dataModel: typings.heremaps.H.map.DataModel,
      options: Options
    ) = this()
  }
  @js.native
  object RenderEngine extends js.Object {
    
    /**
      * This object defines the modifiers to use for H.map.ViewPort#startInteraction.
      */
    @js.native
    object InteractionModifiers extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.map.render.RenderEngine.InteractionModifiers with Double] = js.native
      
      /* 4 */ val COORD: typings.heremaps.H.map.render.RenderEngine.InteractionModifiers.COORD with Double = js.native
      
      /* 1 */ val HEADING: typings.heremaps.H.map.render.RenderEngine.InteractionModifiers.HEADING with Double = js.native
      
      /* 3 */ val INCLINE: typings.heremaps.H.map.render.RenderEngine.InteractionModifiers.INCLINE with Double = js.native
      
      /* 2 */ val TILT: typings.heremaps.H.map.render.RenderEngine.InteractionModifiers.TILT with Double = js.native
      
      /* 0 */ val ZOOM: typings.heremaps.H.map.render.RenderEngine.InteractionModifiers.ZOOM with Double = js.native
    }
  }
  
  /**
    * The rendering states of the layer.
    */
  @js.native
  object RenderState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heremaps.H.map.render.RenderState with Double] = js.native
    
    /* 1 */ val ACTIVE: typings.heremaps.H.map.render.RenderState.ACTIVE with Double = js.native
    
    /* 2 */ val DONE: typings.heremaps.H.map.render.RenderState.DONE with Double = js.native
    
    /* 0 */ val PENDING: typings.heremaps.H.map.render.RenderState.PENDING with Double = js.native
  }
  
  /**
    * Contains functionality specific to 2D map rendering.
    */
  @js.native
  object p2d extends js.Object {
    
    /**
      * This class implements a map render engine. It presents a geographic location (camera data from a view model) and renders all map layers in
      * the order in which they are provided in a single 2D canvas element.
      */
    @js.native
    class RenderEngine protected ()
      extends typings.heremaps.H.map.render.p2d.RenderEngine {
      /**
        * Constructor
        * @param viewPort {H.map.ViewPort} - An object representing the map viewport
        * @param viewModel {H.map.ViewModel} - An object representing a view of the map
        * @param dataModel {H.map.DataModel} - An object encapsulating the data to be rendered on the map (layers and objects)
        * @param options {H.map.render.RenderEngine.Options} - An object containing the render engine initialization options
        */
      def this(
        viewPort: typings.heremaps.H.map.ViewPort,
        viewModel: typings.heremaps.H.map.ViewModel,
        dataModel: typings.heremaps.H.map.DataModel,
        options: Options
      ) = this()
    }
  }
}
