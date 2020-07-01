package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeviceMetadata extends js.Object {
  /**
    * Device CPU make e.g. &quot;Qualcomm&quot;
    */
  var cpuMake: js.UndefOr[String] = js.native
  /**
    * Device CPU model e.g. &quot;MSM8974&quot;
    */
  var cpuModel: js.UndefOr[String] = js.native
  /**
    * Device class (e.g. tablet)
    */
  var deviceClass: js.UndefOr[String] = js.native
  /**
    * OpenGL version
    */
  var glEsVersion: js.UndefOr[Double] = js.native
  /**
    * Device manufacturer (e.g. Motorola)
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * Comma separated list of native platforms (e.g. &quot;arm&quot;,
    * &quot;arm7&quot;)
    */
  var nativePlatform: js.UndefOr[String] = js.native
  /**
    * Device model name (e.g. Droid)
    */
  var productName: js.UndefOr[String] = js.native
  /**
    * Device RAM in Megabytes e.g. &quot;2048&quot;
    */
  var ramMb: js.UndefOr[Double] = js.native
  /**
    * Screen density in DPI
    */
  var screenDensityDpi: js.UndefOr[Double] = js.native
  /**
    * Screen height in pixels
    */
  var screenHeightPx: js.UndefOr[Double] = js.native
  /**
    * Screen width in pixels
    */
  var screenWidthPx: js.UndefOr[Double] = js.native
}

object SchemaDeviceMetadata {
  @scala.inline
  def apply(
    cpuMake: String = null,
    cpuModel: String = null,
    deviceClass: String = null,
    glEsVersion: js.UndefOr[Double] = js.undefined,
    manufacturer: String = null,
    nativePlatform: String = null,
    productName: String = null,
    ramMb: js.UndefOr[Double] = js.undefined,
    screenDensityDpi: js.UndefOr[Double] = js.undefined,
    screenHeightPx: js.UndefOr[Double] = js.undefined,
    screenWidthPx: js.UndefOr[Double] = js.undefined
  ): SchemaDeviceMetadata = {
    val __obj = js.Dynamic.literal()
    if (cpuMake != null) __obj.updateDynamic("cpuMake")(cpuMake.asInstanceOf[js.Any])
    if (cpuModel != null) __obj.updateDynamic("cpuModel")(cpuModel.asInstanceOf[js.Any])
    if (deviceClass != null) __obj.updateDynamic("deviceClass")(deviceClass.asInstanceOf[js.Any])
    if (!js.isUndefined(glEsVersion)) __obj.updateDynamic("glEsVersion")(glEsVersion.get.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (nativePlatform != null) __obj.updateDynamic("nativePlatform")(nativePlatform.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (!js.isUndefined(ramMb)) __obj.updateDynamic("ramMb")(ramMb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenDensityDpi)) __obj.updateDynamic("screenDensityDpi")(screenDensityDpi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenHeightPx)) __obj.updateDynamic("screenHeightPx")(screenHeightPx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenWidthPx)) __obj.updateDynamic("screenWidthPx")(screenWidthPx.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeviceMetadata]
  }
}

