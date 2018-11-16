package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options to pass to model.findLoops.
     */

trait IFindChainsOptions extends IPointMatchOptions {
  /**
           * Flag to separate chains by layers.
           */
  var byLayers: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Flag to not recurse models, look only within current model's immediate paths.
           */
  var shallow: js.UndefOr[scala.Boolean] = js.undefined
}

