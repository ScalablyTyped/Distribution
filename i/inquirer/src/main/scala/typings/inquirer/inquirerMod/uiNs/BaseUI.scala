package typings.inquirer.inquirerMod.uiNs

import org.scalablytyped.runtime.Instantiable1
import typings.inquirer.inquirerMod.StreamOptions
import typings.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base interface class other can inherits from
  */
@js.native
trait BaseUI extends Instantiable1[/* opt */ StreamOptions, BaseUI] {
  var rl: Interface = js.native
  /**
    * Close the interface and cleanup listeners
    */
  def close(): Unit = js.native
  /**
    * Handle the ^C exit
    * @return {null}
    */
  def onForceClose(): Unit = js.native
}

