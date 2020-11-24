package typings.heremaps.H.Map_

import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.ViewPort.Padding
import typings.heremaps.H.map.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This type defines options which can be used to initialize the map.
  * @property center {H.geo.IPoint=} - The initial center of the map, default is {lat:0, lng: 0}
  * @property zoom {number=} - The initial zoom level of the map, default is 0 respectively the minimal zoom level of the base map
  * @property bounds {H.geo.Rect=} - The view bounds to be displayed on the map. If provided, it takes precedence over center and zoom. and zoom if provided)
  * @property layers {Array<H.map.layer.Layer>=} - A list of layers to render on top of the base map
  * @property engineType: {H.Map.EngineType=} - The initial engine type to use, default is P2D
  * @property pixelRatio {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
  * @property imprint {H.map.Imprint.Options=} - The imprint options or null to suppress the imprint
  * @property renderBaseBackground {H.Map.BackgroundRange=} - Object describes how many cached zoom levels should be used as a base map background while base map tiles are loading.
  * Example: {lower: 3, higher: 2}
  * @property autoColor {boolean=} - Indicates whether the UI's colors should automatically adjusted to the base layer, default is true. Up to now only the copyright style will be adjusted.
  * See H.map.layer.Layer.Options#dark
  * @property margin {number=} - The size in pixel of the supplemental area to render for each side of the map
  * @property padding {H.map.ViewPort.Padding=} - The padding in pixels for each side of the map
  * @property fixedCenter {boolean=} - Indicates whether the center of the map should remain unchanged if the viewport's size or padding has been changed, default is true
  * @property noWrap {boolean=} - Indicates whether to wrap the world on longitude axes. When set to true, only one world will be rendered. Default is false, multiple worlds are rendered.
  */
@js.native
trait Options extends js.Object {
  
  var autoColor: js.UndefOr[Boolean] = js.native
  
  var bounds: js.UndefOr[Rect] = js.native
  
  var center: js.UndefOr[IPoint] = js.native
  
  var engineType: js.UndefOr[EngineType] = js.native
  
  var fixedCenter: js.UndefOr[Boolean] = js.native
  
  var imprint: js.UndefOr[typings.heremaps.H.map.Imprint.Options] = js.native
  
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  
  var margin: js.UndefOr[Double] = js.native
  
  var noWrap: js.UndefOr[Boolean] = js.native
  
  var padding: js.UndefOr[Padding] = js.native
  
  var pixelRatio: js.UndefOr[Double] = js.native
  
  var renderBaseBackground: js.UndefOr[BackgroundRange] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoColor(value: Boolean): Self = this.set("autoColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoColor: Self = this.set("autoColor", js.undefined)
    
    @scala.inline
    def setBounds(value: Rect): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setCenter(value: IPoint): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setEngineType(value: EngineType): Self = this.set("engineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineType: Self = this.set("engineType", js.undefined)
    
    @scala.inline
    def setFixedCenter(value: Boolean): Self = this.set("fixedCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedCenter: Self = this.set("fixedCenter", js.undefined)
    
    @scala.inline
    def setImprint(value: typings.heremaps.H.map.Imprint.Options): Self = this.set("imprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImprint: Self = this.set("imprint", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    
    @scala.inline
    def setRenderBaseBackground(value: BackgroundRange): Self = this.set("renderBaseBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderBaseBackground: Self = this.set("renderBaseBackground", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
