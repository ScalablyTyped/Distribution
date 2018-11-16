package typings
package karmaLib.karmaMod.karmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Karma extends js.Object {
  var Server: Server
  var VERSION: java.lang.String
  var constants: Constants
  var launcher: Launcher
  var runner: Runner
  /**
           * `start` method is deprecated since 0.13. It will be removed in 0.14.
           * Please use
           * <code>
           *     server = new Server(config, [done])
           *     server.start()
           * </code>
           * instead.
           */
  var server: DeprecatedServer
  var stopper: Stopper
}

