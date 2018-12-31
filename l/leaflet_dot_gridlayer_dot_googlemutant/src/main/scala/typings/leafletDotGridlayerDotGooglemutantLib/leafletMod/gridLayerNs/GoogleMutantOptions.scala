package typings
package leafletDotGridlayerDotGooglemutantLib.leafletMod.gridLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleMutantOptions
  extends leafletLib.leafletMod.TileLayerOptions {
  var continuousWorld: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Google's map styles.
    */
  var styles: js.UndefOr[js.Array[GoogleMutantStyle]] = js.undefined
  /**
    * Google's map type. 'hybrid' is not really supported.
    */
  var `type`: js.UndefOr[GoogleMutantType] = js.undefined
}

