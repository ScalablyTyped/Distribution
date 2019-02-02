package typings
package ldclientDashJsLib.ldclientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDOptions
  extends ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDOptionsBase {
  /**
    * True (the default) if the client should make a request to LaunchDarkly for
    * A/B testing goals. By default, this request is made on every page load.
    * Set it to false if you are not using A/B testing and want to skip the request.
    */
  var fetchGoals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The signed user key for Secure Mode.
    */
  var hash: js.UndefOr[java.lang.String] = js.undefined
}

