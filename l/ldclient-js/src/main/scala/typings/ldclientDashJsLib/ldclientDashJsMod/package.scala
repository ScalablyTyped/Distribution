package typings
package ldclientDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ldclientDashJsMod {
  /**
    * The parameters required to (un)subscribe to/from LaunchDarkly events. See
    * LDClient#on and LDClient#off.
    *
    * The following event names (keys) are used by the cliet:
    *
    * "ready": The client has finished starting up. This event will be sent regardless
    * of whether it successfully connected to LaunchDarkly, or encountered an error
    * and had to give up; to distinguish between these cases, see below.
    *
    * "initialized": The client successfully started up and has valid feature flag
    * data. This will always be accompanied by "ready".
    *
    * "failed": The client encountered an error that prevented it from connecting to
    * LaunchDarkly, such as an invalid environment ID. All flag evaluations will
    * therefore receive default values. This will always be accompanied by "ready".
    *
    * "error": General event for any kind of error condition during client operation.
    * The callback parameter is an Error object. If you do not listen for "error"
    * events, then the errors will be logged with console.log().
    *
    * "change": The client has received new feature flag data. This can happen either
    * because you have switched users with identify(), or because the client has a
    * stream connection and has received a live change to a flag value (see below).
    * The callback  parameter is an LDFlagChangeset.
    *
    * "change:FLAG-KEY": The client has received a new value for a specific flag
    * whose key is FLAG-KEY. The callback receives two parameters: the current (new)
    * flag value, and the previous value. This is always accompanied by a general
    * "change" event as described above; you can listen for either or both.
    *
    * The "change" and "change:FLAG-KEY" events have special behavior: by default, the
    * client will open a streaming connection to receive live changes if and only if
    * you are listening for one of these events. This behavior can be overridden by
    * setting LDOptions.streaming or calling LDClient.setStreaming().
    */
  type LDEventSignature = js.Function3[
    /* key */ java.lang.String, 
    /* callback */ js.Function2[
      /* current */ js.UndefOr[LDFlagValue | LDFlagChangeset], 
      /* previous */ js.UndefOr[LDFlagValue], 
      scala.Unit
    ], 
    /* context */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type LDFlagValue = js.Any
}
