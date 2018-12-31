package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows setting a set of rules to apply for different screen or chart sizes.
  * Each rule specifies additional chart options.
  * @since 5.0.0
  */
trait ResponsiveOptions extends js.Object {
  /**
    * A set of rules for responsive settings. The rules are executed from the top down.
    * @since 5.0.0
    */
  var rules: js.UndefOr[js.Array[RulesOptions]] = js.undefined
}

