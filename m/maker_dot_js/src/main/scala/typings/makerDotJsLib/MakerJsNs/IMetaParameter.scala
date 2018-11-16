package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Describes a parameter and its limits.
     */

trait IMetaParameter extends js.Object {
  /**
           * Optional maximum value of the range.
           */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
           * Optional minimum value of the range.
           */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
           * Optional step value between min and max.
           */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
           * Display text of the parameter.
           */
  var title: java.lang.String
  /**
           * Type of the parameter. Currently supports "range".
           */
  var `type`: java.lang.String
  /**
           * Initial sample value for this parameter.
           */
  var value: js.Any
}

