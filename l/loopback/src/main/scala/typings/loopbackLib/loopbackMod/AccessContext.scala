package typings
package loopbackLib.loopbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access context represents the context for a request to access protected
  * resource
  * @class
  * @options {Context} context The context object
  * @constructor
  */
@JSImport("loopback", "AccessContext")
@js.native
class AccessContext protected ()
  extends loopbackLib.loopbackMod.lNs.AccessContext {
  /** context The context object */
  def this(context: loopbackLib.loopbackMod.lNs.Context) = this()
}

