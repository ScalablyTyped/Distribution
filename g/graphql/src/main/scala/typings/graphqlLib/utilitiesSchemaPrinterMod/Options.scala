package typings
package graphqlLib.utilitiesSchemaPrinterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
       * Descriptions are defined as preceding string literals, however an older
       * experimental version of the SDL supported preceding comments as
       * descriptions. Set to true to enable this deprecated behavior.
       * This option is provided to ease adoption and will be removed in v16.
       *
       * Default: false
       */
  var commentDescriptions: js.UndefOr[scala.Boolean] = js.undefined
}

