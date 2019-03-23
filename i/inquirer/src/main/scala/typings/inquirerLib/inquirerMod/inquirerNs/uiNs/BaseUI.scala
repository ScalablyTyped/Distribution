package typings
package inquirerLib.inquirerMod.inquirerNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base interface class other can inherits from
  */
@js.native
trait BaseUI
  extends org.scalablytyped.runtime.Instantiable1[/* opt */ inquirerLib.inquirerMod.inquirerNs.StreamOptions, BaseUI] {
  var rl: nodeLib.readlineMod.Interface = js.native
  /**
    * Close the interface and cleanup listeners
    */
  def close(): scala.Unit = js.native
  /**
    * Handle the ^C exit
    * @return {null}
    */
  def onForceClose(): scala.Unit = js.native
}

