package typings
package inquirerLib.inquirerMod.inquirerNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Base interface class other can inherits from
         */
@js.native
trait BaseUI[TOpt]
  extends org.scalablytyped.runtime.Instantiable1[/* opt */ TOpt, scala.Unit] {
  /**
               * Close the interface and cleanup listeners
               */
  def close(): scala.Unit = js.native
  /**
               * Handle the ^C exit
               * @return {null}
               */
  def onForceClose(): scala.Unit = js.native
  /**
               * Handle and propagate keypress events
               */
  def onKeypress(s: java.lang.String, key: Key): scala.Unit = js.native
}

