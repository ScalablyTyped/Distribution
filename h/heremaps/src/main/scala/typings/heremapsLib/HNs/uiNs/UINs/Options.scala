package typings
package heremapsLib.HNs.uiNs.UINs

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
trait Options extends js.Object {
  var distancemeasurement: js.UndefOr[heremapsLib.HNs.uiNs.DistanceMeasurementNs.Options | scala.Boolean] = js.undefined
  var locale: js.UndefOr[heremapsLib.HNs.uiNs.i18nNs.Localization | java.lang.String] = js.undefined
  var mapsettings: js.UndefOr[heremapsLib.HNs.uiNs.MapSettingsControlNs.Options | scala.Boolean] = js.undefined
  var panorama: js.UndefOr[heremapsLib.HNs.uiNs.PanoNs.Options | scala.Boolean] = js.undefined
  var scalebar: js.UndefOr[heremapsLib.HNs.uiNs.ScaleBarNs.Options | scala.Boolean] = js.undefined
  var unitSystem: js.UndefOr[heremapsLib.HNs.uiNs.UnitSystem] = js.undefined
  var zoom: js.UndefOr[heremapsLib.HNs.uiNs.ZoomControlNs.Options | scala.Boolean] = js.undefined
  var zoomrectangle: js.UndefOr[heremapsLib.HNs.uiNs.ZoomRectangleNs.Options | scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    distancemeasurement: heremapsLib.HNs.uiNs.DistanceMeasurementNs.Options | scala.Boolean = null,
    locale: heremapsLib.HNs.uiNs.i18nNs.Localization | java.lang.String = null,
    mapsettings: heremapsLib.HNs.uiNs.MapSettingsControlNs.Options | scala.Boolean = null,
    panorama: heremapsLib.HNs.uiNs.PanoNs.Options | scala.Boolean = null,
    scalebar: heremapsLib.HNs.uiNs.ScaleBarNs.Options | scala.Boolean = null,
    unitSystem: heremapsLib.HNs.uiNs.UnitSystem = null,
    zoom: heremapsLib.HNs.uiNs.ZoomControlNs.Options | scala.Boolean = null,
    zoomrectangle: heremapsLib.HNs.uiNs.ZoomRectangleNs.Options | scala.Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (distancemeasurement != null) __obj.updateDynamic("distancemeasurement")(distancemeasurement.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mapsettings != null) __obj.updateDynamic("mapsettings")(mapsettings.asInstanceOf[js.Any])
    if (panorama != null) __obj.updateDynamic("panorama")(panorama.asInstanceOf[js.Any])
    if (scalebar != null) __obj.updateDynamic("scalebar")(scalebar.asInstanceOf[js.Any])
    if (unitSystem != null) __obj.updateDynamic("unitSystem")(unitSystem)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomrectangle != null) __obj.updateDynamic("zoomrectangle")(zoomrectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

