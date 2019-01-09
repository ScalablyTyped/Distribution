package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Meta data about the running user script.
  * @see {@link http://wiki.greasespot.net/GM_info}
  */
@JSGlobal("GM_info")
@js.native
object GM_info extends js.Object {
  var script: greasemonkeyLib.Anon_Description = js.native
  var scriptMetaStr: java.lang.String = js.native
  var scriptWillUpdate: scala.Boolean = js.native
  var version: java.lang.String = js.native
}

