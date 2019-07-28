package typings.ldclientDashJs.ldclientDashJsMod

import typings.ldclientDashJsDashCommon.ldclientDashJsDashCommonMod.LDClientBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LDClient extends LDClientBase {
  /**
    * Allows you to wait until the client has received goals data from LaunchDarkly.
    *
    * This is only relevant if you are using A/B testing features like click events and
    * pageview events; until the client has received the configuration for these (which
    * happens immediately after the initial request for feature flags), click events and
    * pageview events will not work, so you may wish to wait using this method before
    * doing anything that you expect to generate those events.
    *
    * The returned Promise will be resolved once the client has received goals data. If
    * you prefer to use event handlers rather than Promises, you can listen on the client
    * for a `"goalsReady"` event instead.
    * 
    * @returns
    *   A Promise containing the initialization state of the client.
    */
  def waitUntilGoalsReady(): js.Promise[Unit] = js.native
}

