package typings.maplibreGl.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import typings.mapboxMapboxGlSupported.mod.IsSupported
import typings.mapboxMapboxGlSupported.mod.IsSupportedOptions
import typings.maplibreGl.anon.MAXPARALLELIMAGEREQUESTS
import typings.maplibreGl.anon.TypeofLngLat
import typings.maplibreGl.anon.TypeofLngLatBounds
import typings.maplibreGl.anon.TypeofMercatorCoordinate
import typings.maplibreGl.anon.TypeofPoint
import typings.maplibreGl.anon.TypeofStyle
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("maplibre-gl", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "default.AJAXError")
  @js.native
  def AJAXError: Instantiable4[
    /* status */ Double, 
    /* statusText */ String, 
    /* url */ String, 
    /* body */ Blob, 
    typings.maplibreGl.mod.AJAXError
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.AJAXError")
  @js.native
  open class AJAXErrorCls protected () extends AJAXError {
    def this(status: Double, statusText: String, url: String, body: Blob) = this()
  }
  
  inline def AJAXError_=(
    x: Instantiable4[
      /* status */ Double, 
      /* statusText */ String, 
      /* url */ String, 
      /* body */ Blob, 
      AJAXError
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AJAXError")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.AttributionControl")
  @js.native
  def AttributionControl: Instantiable1[
    /* options */ js.UndefOr[AttributionOptions], 
    typings.maplibreGl.mod.AttributionControl
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.AttributionControl")
  @js.native
  open class AttributionControlCls () extends AttributionControl {
    def this(options: AttributionOptions) = this()
  }
  
  inline def AttributionControl_=(x: Instantiable1[/* options */ js.UndefOr[AttributionOptions], AttributionControl]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributionControl")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.CanvasSource")
  @js.native
  def CanvasSource: Instantiable4[
    /* id */ String, 
    /* options */ CanvasSourceSpecification, 
    /* dispatcher */ Dispatcher, 
    /* eventedParent */ Evented, 
    typings.maplibreGl.mod.CanvasSource
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.CanvasSource")
  @js.native
  open class CanvasSourceCls protected () extends CanvasSource {
    /**
    	 * @private
    	 */
    def this(id: String, options: CanvasSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  }
  
  inline def CanvasSource_=(
    x: Instantiable4[
      /* id */ String, 
      /* options */ CanvasSourceSpecification, 
      /* dispatcher */ Dispatcher, 
      /* eventedParent */ Evented, 
      CanvasSource
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CanvasSource")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.Evented")
  @js.native
  def Evented: Instantiable0[typings.maplibreGl.mod.Evented] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.Evented")
  @js.native
  open class EventedCls () extends Evented
  
  inline def Evented_=(x: Instantiable0[Evented]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Evented")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.FullscreenControl")
  @js.native
  def FullscreenControl: Instantiable1[/* options */ FullscreenOptions, typings.maplibreGl.mod.FullscreenControl] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.FullscreenControl")
  @js.native
  open class FullscreenControlCls protected () extends FullscreenControl {
    def this(options: FullscreenOptions) = this()
  }
  
  inline def FullscreenControl_=(x: Instantiable1[/* options */ FullscreenOptions, FullscreenControl]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FullscreenControl")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.GeoJSONSource")
  @js.native
  def GeoJSONSource: Instantiable4[
    /* id */ String, 
    /* options */ GeoJSONSourceOptions, 
    /* dispatcher */ Dispatcher, 
    /* eventedParent */ Evented, 
    typings.maplibreGl.mod.GeoJSONSource
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.GeoJSONSource")
  @js.native
  open class GeoJSONSourceCls protected () extends GeoJSONSource {
    /**
    	 * @private
    	 */
    def this(id: String, options: GeoJSONSourceOptions, dispatcher: Dispatcher, eventedParent: Evented) = this()
  }
  
  inline def GeoJSONSource_=(
    x: Instantiable4[
      /* id */ String, 
      /* options */ GeoJSONSourceOptions, 
      /* dispatcher */ Dispatcher, 
      /* eventedParent */ Evented, 
      GeoJSONSource
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GeoJSONSource")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.GeolocateControl")
  @js.native
  def GeolocateControl: Instantiable1[/* options */ GeolocateOptions, typings.maplibreGl.mod.GeolocateControl] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.GeolocateControl")
  @js.native
  open class GeolocateControlCls protected () extends GeolocateControl {
    def this(options: GeolocateOptions) = this()
  }
  
  inline def GeolocateControl_=(x: Instantiable1[/* options */ GeolocateOptions, GeolocateControl]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GeolocateControl")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.ImageSource")
  @js.native
  def ImageSource: Instantiable4[
    /* id */ String, 
    /* options */ ImageSourceSpecification | VideoSourceSpecification | CanvasSourceSpecification, 
    /* dispatcher */ Dispatcher, 
    /* eventedParent */ Evented, 
    typings.maplibreGl.mod.ImageSource
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.ImageSource")
  @js.native
  open class ImageSourceCls protected () extends ImageSource {
    def this(id: String, options: CanvasSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
    /**
    	 * @private
    	 */
    def this(id: String, options: ImageSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
    def this(id: String, options: VideoSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  }
  
  inline def ImageSource_=(
    x: Instantiable4[
      /* id */ String, 
      /* options */ ImageSourceSpecification | VideoSourceSpecification | CanvasSourceSpecification, 
      /* dispatcher */ Dispatcher, 
      /* eventedParent */ Evented, 
      ImageSource
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImageSource")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.LngLat")
  @js.native
  def LngLat: TypeofLngLat = js.native
  
  @JSImport("maplibre-gl", "default.LngLatBounds")
  @js.native
  def LngLatBounds: TypeofLngLatBounds = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.LngLatBounds")
  @js.native
  open class LngLatBoundsCls () extends LngLatBounds {
    def this(sw: Any) = this()
    def this(sw: Any, ne: Any) = this()
    def this(sw: scala.Unit, ne: Any) = this()
  }
  
  inline def LngLatBounds_=(x: TypeofLngLatBounds): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LngLatBounds")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.LngLat")
  @js.native
  open class LngLatCls protected () extends LngLat {
    def this(lng: Double, lat: Double) = this()
  }
  
  inline def LngLat_=(x: TypeofLngLat): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LngLat")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.LogoControl")
  @js.native
  def LogoControl: Instantiable1[/* options */ js.UndefOr[LogoOptions], typings.maplibreGl.mod.LogoControl] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.LogoControl")
  @js.native
  open class LogoControlCls () extends LogoControl {
    def this(options: LogoOptions) = this()
  }
  
  inline def LogoControl_=(x: Instantiable1[/* options */ js.UndefOr[LogoOptions], LogoControl]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogoControl")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.Map")
  @js.native
  def Map: Instantiable1[/* options */ MapOptions, typings.maplibreGl.mod.Map] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.Map")
  @js.native
  open class MapCls protected () extends Map {
    def this(options: MapOptions) = this()
  }
  
  inline def Map_=(x: Instantiable1[/* options */ MapOptions, Map]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Map")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.Marker")
  @js.native
  def Marker: Instantiable2[
    /* options */ js.UndefOr[MarkerOptions], 
    /* legacyOptions */ js.UndefOr[MarkerOptions], 
    typings.maplibreGl.mod.Marker
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.Marker")
  @js.native
  open class MarkerCls () extends Marker {
    def this(options: MarkerOptions) = this()
    def this(options: scala.Unit, legacyOptions: MarkerOptions) = this()
    def this(options: MarkerOptions, legacyOptions: MarkerOptions) = this()
  }
  
  inline def Marker_=(
    x: Instantiable2[
      /* options */ js.UndefOr[MarkerOptions], 
      /* legacyOptions */ js.UndefOr[MarkerOptions], 
      Marker
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Marker")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.MercatorCoordinate")
  @js.native
  def MercatorCoordinate: TypeofMercatorCoordinate = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.MercatorCoordinate")
  @js.native
  open class MercatorCoordinateCls protected () extends MercatorCoordinate {
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
  }
  
  inline def MercatorCoordinate_=(x: TypeofMercatorCoordinate): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MercatorCoordinate")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.NavigationControl")
  @js.native
  def NavigationControl: Instantiable1[/* options */ NavigationOptions, typings.maplibreGl.mod.NavigationControl] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.NavigationControl")
  @js.native
  open class NavigationControlCls protected () extends NavigationControl {
    def this(options: NavigationOptions) = this()
  }
  
  inline def NavigationControl_=(x: Instantiable1[/* options */ NavigationOptions, NavigationControl]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NavigationControl")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("maplibre-gl", "default.Point")
  @js.native
  open class Point protected ()
    extends typings.mapboxPointGeometry.mod.^ {
    def this(x: Double, y: Double) = this()
  }
  @JSImport("maplibre-gl", "default.Point")
  @js.native
  def Point: TypeofPoint & (Instantiable2[/* x */ Double, /* y */ Double, typings.mapboxPointGeometry.mod.^]) = js.native
  inline def Point_=(
    x: TypeofPoint & (Instantiable2[/* x */ Double, /* y */ Double, typings.mapboxPointGeometry.mod.^])
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Point")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.Popup")
  @js.native
  def Popup: Instantiable1[/* options */ js.UndefOr[PopupOptions], typings.maplibreGl.mod.Popup] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.Popup")
  @js.native
  open class PopupCls () extends Popup {
    def this(options: PopupOptions) = this()
  }
  
  inline def Popup_=(x: Instantiable1[/* options */ js.UndefOr[PopupOptions], Popup]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Popup")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.RasterDEMTileSource")
  @js.native
  def RasterDEMTileSource: Instantiable4[
    /* id */ String, 
    /* options */ RasterDEMSourceSpecification, 
    /* dispatcher */ Dispatcher, 
    /* eventedParent */ Evented, 
    typings.maplibreGl.mod.RasterDEMTileSource
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.RasterDEMTileSource")
  @js.native
  open class RasterDEMTileSourceCls protected () extends RasterDEMTileSource {
    def this(id: String, options: RasterDEMSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  }
  
  inline def RasterDEMTileSource_=(
    x: Instantiable4[
      /* id */ String, 
      /* options */ RasterDEMSourceSpecification, 
      /* dispatcher */ Dispatcher, 
      /* eventedParent */ Evented, 
      RasterDEMTileSource
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RasterDEMTileSource")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.RasterTileSource")
  @js.native
  def RasterTileSource: Instantiable4[
    /* id */ String, 
    /* options */ RasterSourceSpecification | RasterDEMSourceSpecification, 
    /* dispatcher */ Dispatcher, 
    /* eventedParent */ Evented, 
    typings.maplibreGl.mod.RasterTileSource
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.RasterTileSource")
  @js.native
  open class RasterTileSourceCls protected () extends RasterTileSource {
    def this(id: String, options: RasterDEMSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
    def this(id: String, options: RasterSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  }
  
  inline def RasterTileSource_=(
    x: Instantiable4[
      /* id */ String, 
      /* options */ RasterSourceSpecification | RasterDEMSourceSpecification, 
      /* dispatcher */ Dispatcher, 
      /* eventedParent */ Evented, 
      RasterTileSource
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RasterTileSource")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.ScaleControl")
  @js.native
  def ScaleControl: Instantiable1[/* options */ ScaleOptions, typings.maplibreGl.mod.ScaleControl] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.ScaleControl")
  @js.native
  open class ScaleControlCls protected () extends ScaleControl {
    def this(options: ScaleOptions) = this()
  }
  
  inline def ScaleControl_=(x: Instantiable1[/* options */ ScaleOptions, ScaleControl]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScaleControl")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.Style")
  @js.native
  def Style: TypeofStyle = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.Style")
  @js.native
  open class StyleCls protected () extends Style {
    def this(map: Map) = this()
    def this(map: Map, options: StyleOptions) = this()
  }
  
  inline def Style_=(x: TypeofStyle): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Style")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.TerrainControl")
  @js.native
  def TerrainControl: Instantiable1[/* options */ TerrainSpecification, typings.maplibreGl.mod.TerrainControl] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.TerrainControl")
  @js.native
  open class TerrainControlCls protected () extends TerrainControl {
    def this(options: TerrainSpecification) = this()
  }
  
  inline def TerrainControl_=(x: Instantiable1[/* options */ TerrainSpecification, TerrainControl]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TerrainControl")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.VectorTileSource")
  @js.native
  def VectorTileSource: Instantiable4[
    /* id */ String, 
    /* options */ typings.maplibreGl.anon.VectorSourceSpecification, 
    /* dispatcher */ Dispatcher, 
    /* eventedParent */ Evented, 
    typings.maplibreGl.mod.VectorTileSource
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.VectorTileSource")
  @js.native
  open class VectorTileSourceCls protected () extends VectorTileSource {
    def this(
      id: String,
      options: typings.maplibreGl.anon.VectorSourceSpecification,
      dispatcher: Dispatcher,
      eventedParent: Evented
    ) = this()
  }
  
  inline def VectorTileSource_=(
    x: Instantiable4[
      /* id */ String, 
      /* options */ typings.maplibreGl.anon.VectorSourceSpecification, 
      /* dispatcher */ Dispatcher, 
      /* eventedParent */ Evented, 
      VectorTileSource
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VectorTileSource")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.VideoSource")
  @js.native
  def VideoSource: Instantiable4[
    /* id */ String, 
    /* options */ VideoSourceSpecification, 
    /* dispatcher */ Dispatcher, 
    /* eventedParent */ Evented, 
    typings.maplibreGl.mod.VideoSource
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("maplibre-gl", "default.VideoSource")
  @js.native
  open class VideoSourceCls protected () extends VideoSource {
    /**
    	 * @private
    	 */
    def this(id: String, options: VideoSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  }
  
  inline def VideoSource_=(
    x: Instantiable4[
      /* id */ String, 
      /* options */ VideoSourceSpecification, 
      /* dispatcher */ Dispatcher, 
      /* eventedParent */ Evented, 
      VideoSource
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VideoSource")(x.asInstanceOf[js.Any])
  
  /**
  	 * Sets a custom load tile function that will be called when using a source that starts with a custom url schema.
  	 * The example below will be triggered for custom:// urls defined in the sources list in the style definitions.
  	 * The function passed will receive the request parameters and should call the callback with the resulting request,
  	 * for example a pbf vector tile, non-compressed, represented as ArrayBuffer.
  	 *
  	 * @function addProtocol
  	 * @param {string} customProtocol - the protocol to hook, for example 'custom'
  	 * @param {Function} loadFn - the function to use when trying to fetch a tile specified by the customProtocol
  	 * @example
  	 * // this will fetch a file using the fetch API (this is obviously a non iteresting example...)
  	 * maplibre.addProtocol('custom', (params, callback) => {
  			fetch(`https://${params.url.split("://")[1]}`)
  				.then(t => {
  					if (t.status == 200) {
  						t.arrayBuffer().then(arr => {
  							callback(null, arr, null, null);
  						});
  					} else {
  						callback(new Error(`Tile fetch error: ${t.statusText}`));
  					}
  				})
  				.catch(e => {
  					callback(new Error(e));
  				});
  			return { cancel: () => { } };
  		});
  	 * // the following is an example of a way to return an error when trying to load a tile
  	 * maplibre.addProtocol('custom2', (params, callback) => {
  	 *      callback(new Error('someErrorMessage'));
  	 *      return { cancel: () => { } };
  	 * });
  	 */
  inline def addProtocol(
    customProtocol: String,
    loadFn: js.Function2[
      /* requestParameters */ RequestParameters, 
      /* callback */ ResponseCallback[Any], 
      Cancelable
    ]
  ): scala.Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addProtocol")(customProtocol.asInstanceOf[js.Any], loadFn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
  	 * Clears up resources that have previously been created by `maplibregl.prewarm()`.
  	 * Note that this is typically not necessary. You should only call this function
  	 * if you expect the user of your app to not return to a Map view at any point
  	 * in your application.
  	 *
  	 * @function clearPrewarmedResources
  	 * @example
  	 * maplibregl.clearPrewarmedResources()
  	 */
  inline def clearPrewarmedResources(): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPrewarmedResources")().asInstanceOf[scala.Unit]
  /**
  	 * Clears up resources that have previously been created by `maplibregl.prewarm()`.
  	 * Note that this is typically not necessary. You should only call this function
  	 * if you expect the user of your app to not return to a Map view at any point
  	 * in your application.
  	 *
  	 * @function clearPrewarmedResources
  	 * @example
  	 * maplibregl.clearPrewarmedResources()
  	 */
  @JSImport("maplibre-gl", "default.clearPrewarmedResources")
  @js.native
  def clearPrewarmedResources_Fdefault: js.Function0[scala.Unit] = js.native
  
  inline def clearPrewarmedResources_Fdefault_=(x: js.Function0[scala.Unit]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearPrewarmedResources")(x.asInstanceOf[js.Any])
  
  /**
  	 * Clears browser storage used by this library. Using this method flushes the MapLibre tile
  	 * cache that is managed by this library. Tiles may still be cached by the browser
  	 * in some cases.
  	 *
  	 * This API is supported on browsers where the [`Cache` API](https://developer.mozilla.org/en-US/docs/Web/API/Cache)
  	 * is supported and enabled. This includes all major browsers when pages are served over
  	 * `https://`, except Internet Explorer and Edge Mobile.
  	 *
  	 * When called in unsupported browsers or environments (private or incognito mode), the
  	 * callback will be called with an error argument.
  	 *
  	 * @function clearStorage
  	 * @param {Function} callback Called with an error argument if there is an error.
  	 * @example
  	 * maplibregl.clearStorage();
  	 */
  inline def clearStorage(): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[scala.Unit]
  inline def clearStorage(callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], scala.Unit]): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @JSImport("maplibre-gl", "default.config")
  @js.native
  def config: MAXPARALLELIMAGEREQUESTS = js.native
  inline def config_=(x: MAXPARALLELIMAGEREQUESTS): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
  
  inline def getRTLTextPluginStatus(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTLTextPluginStatus")().asInstanceOf[String]
  
  /**
  	 * Gets and sets the maximum number of images (raster tiles, sprites, icons) to load in parallel,
  	 * which affects performance in raster-heavy maps. 16 by default.
  	 *
  	 * @var {string} maxParallelImageRequests
  	 * @returns {number} Number of parallel requests currently configured.
  	 * @example
  	 * maplibregl.maxParallelImageRequests = 10;
  	 */
  @JSImport("maplibre-gl", "default.maxParallelImageRequests")
  @js.native
  def maxParallelImageRequests: Double = js.native
  inline def maxParallelImageRequests_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxParallelImageRequests")(x.asInstanceOf[js.Any])
  
  /**
  	 * Initializes resources like WebWorkers that can be shared across maps to lower load
  	 * times in some situations. `maplibregl.workerUrl` and `maplibregl.workerCount`, if being
  	 * used, must be set before `prewarm()` is called to have an effect.
  	 *
  	 * By default, the lifecycle of these resources is managed automatically, and they are
  	 * lazily initialized when a Map is first created. By invoking `prewarm()`, these
  	 * resources will be created ahead of time, and will not be cleared when the last Map
  	 * is removed from the page. This allows them to be re-used by new Map instances that
  	 * are created later. They can be manually cleared by calling
  	 * `maplibregl.clearPrewarmedResources()`. This is only necessary if your web page remains
  	 * active but stops using maps altogether.
  	 *
  	 * This is primarily useful when using GL-JS maps in a single page app, wherein a user
  	 * would navigate between various views that can cause Map instances to constantly be
  	 * created and destroyed.
  	 *
  	 * @function prewarm
  	 * @example
  	 * maplibregl.prewarm()
  	 */
  inline def prewarm(): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prewarm")().asInstanceOf[scala.Unit]
  /**
  	 * Initializes resources like WebWorkers that can be shared across maps to lower load
  	 * times in some situations. `maplibregl.workerUrl` and `maplibregl.workerCount`, if being
  	 * used, must be set before `prewarm()` is called to have an effect.
  	 *
  	 * By default, the lifecycle of these resources is managed automatically, and they are
  	 * lazily initialized when a Map is first created. By invoking `prewarm()`, these
  	 * resources will be created ahead of time, and will not be cleared when the last Map
  	 * is removed from the page. This allows them to be re-used by new Map instances that
  	 * are created later. They can be manually cleared by calling
  	 * `maplibregl.clearPrewarmedResources()`. This is only necessary if your web page remains
  	 * active but stops using maps altogether.
  	 *
  	 * This is primarily useful when using GL-JS maps in a single page app, wherein a user
  	 * would navigate between various views that can cause Map instances to constantly be
  	 * created and destroyed.
  	 *
  	 * @function prewarm
  	 * @example
  	 * maplibregl.prewarm()
  	 */
  @JSImport("maplibre-gl", "default.prewarm")
  @js.native
  def prewarm_Fdefault: js.Function0[scala.Unit] = js.native
  
  inline def prewarm_Fdefault_=(x: js.Function0[scala.Unit]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prewarm")(x.asInstanceOf[js.Any])
  
  /**
  	 * Removes a previusly added protocol
  	 *
  	 * @function removeProtocol
  	 * @param {string} customProtocol - the custom protocol to remove registration for
  	 * @example
  	 * maplibregl.removeProtocol('custom');
  	 */
  inline def removeProtocol(customProtocol: String): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeProtocol")(customProtocol.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  inline def setRTLTextPlugin(url: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], scala.Unit]): scala.Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  inline def setRTLTextPlugin(
    url: String,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], scala.Unit],
    deferred: Boolean
  ): scala.Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferred.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  inline def supported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[Boolean]
  inline def supported(options: IsSupportedOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @JSImport("maplibre-gl", "default.supported")
  @js.native
  def supported_Fdefault: IsSupported = js.native
  
  inline def supported_Fdefault_=(x: IsSupported): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
  
  /**
  	 * Returns the package version of the library
  	 * @returns {string} Package version of the library
  	 */
  @JSImport("maplibre-gl", "default.version")
  @js.native
  val version: String = js.native
  
  /**
  	 * Gets and sets the number of web workers instantiated on a page with GL JS maps.
  	 * By default, it is set to half the number of CPU cores (capped at 6).
  	 * Make sure to set this property before creating any map instances for it to have effect.
  	 *
  	 * @var {string} workerCount
  	 * @returns {number} Number of workers currently configured.
  	 * @example
  	 * maplibregl.workerCount = 2;
  	 */
  @JSImport("maplibre-gl", "default.workerCount")
  @js.native
  def workerCount: Double = js.native
  inline def workerCount_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "default.workerUrl")
  @js.native
  def workerUrl: String = js.native
  inline def workerUrl_=(x: String): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerUrl")(x.asInstanceOf[js.Any])
}
