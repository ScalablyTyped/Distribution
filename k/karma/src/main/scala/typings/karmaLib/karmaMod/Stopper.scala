package typings
package karmaLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stopper extends js.Object {
  /**
       * This function will signal a running server to stop. The equivalent of karma stop.
       */
  def stop(): scala.Unit = js.native
  /**
       * This function will signal a running server to stop. The equivalent of karma stop.
       */
  def stop(options: ConfigOptions): scala.Unit = js.native
  /**
       * This function will signal a running server to stop. The equivalent of karma stop.
       */
  def stop(options: ConfigOptions, callback: ServerCallback): scala.Unit = js.native
}

