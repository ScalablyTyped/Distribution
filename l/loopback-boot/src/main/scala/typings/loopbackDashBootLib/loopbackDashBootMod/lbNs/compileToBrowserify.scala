package typings
package loopbackDashBootLib.loopbackDashBootMod.lbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * compileToBrowserify
  *
  * Compile boot instructions and add them to a browserify bundler.
  * @param options as described in bootLoopBackApp above.
  * @param bundler A browserify bundler created by browserify().
  */
trait compileToBrowserify extends js.Object {
  /**
    * Application identifier used to load the correct boot configuration when
    * building multiple applications using browserify.
    */
  var appId: java.lang.String
}

