package typings
package ldclientDashJsLib.ldclientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDOptions
  extends ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDOptionsBase {
  /**
    * Whether the client should make a request to LaunchDarkly for A/B testing goals.
    *
    * This is true by default, meaning that this request will be made on every page load.
    * Set it to false if you are not using A/B testing and want to skip the request.
    */
  var fetchGoals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The signed user key for Secure Mode.
    *
    * For more information, see the JavaScript SDK Reference Guide on
    * [Secure mode](https://github.com/launchdarkly/js-client#secure-mode).
    */
  var hash: js.UndefOr[java.lang.String] = js.undefined
}

