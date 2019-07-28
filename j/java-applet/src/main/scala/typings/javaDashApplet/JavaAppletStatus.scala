package typings.javaDashApplet

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
  sealed trait Error extends JavaAppletStatus
  
  /**
    * @summary Applet is loading.
    */
  @js.native
  sealed trait Loading extends JavaAppletStatus
  
  /**
    * @summary Applet has loaded completely and is ready to receive JavaScript calls.
    */
  @js.native
  sealed trait Ready extends JavaAppletStatus
  
  /* 3 */ val Error: typings.javaDashApplet.JavaAppletStatus.Error with Double = js.native
  /* 1 */ val Loading: typings.javaDashApplet.JavaAppletStatus.Loading with Double = js.native
  /* 2 */ val Ready: typings.javaDashApplet.JavaAppletStatus.Ready with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JavaAppletStatus with Double] = js.native
}

