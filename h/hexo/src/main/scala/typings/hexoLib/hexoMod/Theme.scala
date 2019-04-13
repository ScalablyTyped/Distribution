package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends Box {
  var config: HexoConfig = js.native
  /**
    * Get a View
    */
  def getView(path: java.lang.String): js.UndefOr[View] = js.native
  /**
    * Remove a View
    */
  def removeView(path: java.lang.String): scala.Unit = js.native
  /**
    * Set a View
    */
  def setView(path: java.lang.String, data: js.Any): scala.Unit = js.native
}

