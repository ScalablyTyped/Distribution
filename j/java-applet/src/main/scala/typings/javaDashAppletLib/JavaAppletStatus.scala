package typings
package javaDashAppletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JavaAppletStatus extends js.Object

@JSGlobal("JavaAppletStatus")
@js.native
object JavaAppletStatus extends js.Object {
  /**
       * @summary Error while loading applet.
       */
  @js.native
  sealed trait Error
    extends javaDashAppletLib.JavaAppletStatus
  
  /**
       * @summary Applet is loading.
       */
  @js.native
  sealed trait Loading
    extends javaDashAppletLib.JavaAppletStatus
  
  /**
       * @summary Applet has loaded completely and is ready to receive JavaScript calls.
       */
  @js.native
  sealed trait Ready
    extends javaDashAppletLib.JavaAppletStatus
  
  /* 3 */ val Error: Error with scala.Double = js.native
  /* 1 */ val Loading: Loading with scala.Double = js.native
  /* 2 */ val Ready: Ready with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[javaDashAppletLib.JavaAppletStatus with scala.Double] = js.native
}

