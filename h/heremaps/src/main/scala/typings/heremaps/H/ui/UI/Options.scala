package typings.heremaps.H.ui.UI

import typings.heremaps.H.ui.UnitSystem
import typings.heremaps.H.ui.i18n.Localization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameters to be passed to the UI constructor.
  * @property unitSystem {H.ui.UnitSystem=} - An optional unit system to be used by the UI, default is H.ui.UnitSystem.METRIC
  * @property zoom {(H.ui.ZoomControl.Options | boolean)=} -
  * @property zoomrectangle {(H.ui.ZoomRectangle.Options | boolean)=} -
  * @property mapsettings {(H.ui.MapSettingsControl.Options | boolean)=} -
  * @property scalebar {(H.ui.ScaleBar.Options | boolean)=} -
  * @property panorama {(H.ui.Pano.Options | boolean)=} -
  * @property distancemeasurement {(H.ui.DistanceMeasurement.Options | boolean)=} -
  * @property locale {(H.ui.i18n.Localization | string)=} - defines language in which UI can be rendered. It can be predefined H.ui.i18n.Localization object with custom translation map,
  * or a string one of following 'en-US', 'de-DE', 'es-ES', 'fi-FI', 'fr-FR', 'it-IT', 'nl-NL', 'pl-PL', 'pt-BR', 'pt-PT', 'ru-RU', 'tr-TR', 'zh-CN'. If not defined ui will use 'en-US'
  * by default
  */
@js.native
trait Options extends js.Object {
  var distancemeasurement: js.UndefOr[typings.heremaps.H.ui.DistanceMeasurement.Options | Boolean] = js.native
  var locale: js.UndefOr[Localization | String] = js.native
  var mapsettings: js.UndefOr[typings.heremaps.H.ui.MapSettingsControl.Options | Boolean] = js.native
  var panorama: js.UndefOr[typings.heremaps.H.ui.Pano.Options | Boolean] = js.native
  var scalebar: js.UndefOr[typings.heremaps.H.ui.ScaleBar.Options | Boolean] = js.native
  var unitSystem: js.UndefOr[UnitSystem] = js.native
  var zoom: js.UndefOr[typings.heremaps.H.ui.ZoomControl.Options | Boolean] = js.native
  var zoomrectangle: js.UndefOr[typings.heremaps.H.ui.ZoomRectangle.Options | Boolean] = js.native
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
    def setDistancemeasurement(value: typings.heremaps.H.ui.DistanceMeasurement.Options | Boolean): Self = this.set("distancemeasurement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistancemeasurement: Self = this.set("distancemeasurement", js.undefined)
    @scala.inline
    def setLocale(value: Localization | String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMapsettings(value: typings.heremaps.H.ui.MapSettingsControl.Options | Boolean): Self = this.set("mapsettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapsettings: Self = this.set("mapsettings", js.undefined)
    @scala.inline
    def setPanorama(value: typings.heremaps.H.ui.Pano.Options | Boolean): Self = this.set("panorama", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanorama: Self = this.set("panorama", js.undefined)
    @scala.inline
    def setScalebar(value: typings.heremaps.H.ui.ScaleBar.Options | Boolean): Self = this.set("scalebar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalebar: Self = this.set("scalebar", js.undefined)
    @scala.inline
    def setUnitSystem(value: UnitSystem): Self = this.set("unitSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitSystem: Self = this.set("unitSystem", js.undefined)
    @scala.inline
    def setZoom(value: typings.heremaps.H.ui.ZoomControl.Options | Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomrectangle(value: typings.heremaps.H.ui.ZoomRectangle.Options | Boolean): Self = this.set("zoomrectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomrectangle: Self = this.set("zoomrectangle", js.undefined)
  }
  
}

