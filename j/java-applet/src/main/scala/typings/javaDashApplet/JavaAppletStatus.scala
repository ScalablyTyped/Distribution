package typings.javaDashApplet

import org.scalablytyped.runtime.TopLevel
import typings.javaDashApplet.JavaAppletStatus.Error
import typings.javaDashApplet.JavaAppletStatus.Loading
import typings.javaDashApplet.JavaAppletStatus.Ready
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JavaAppletStatus with Double] = js.native
  /* 3 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 1 */ @js.native
  object Loading extends TopLevel[Loading with Double]
  
  /* 2 */ @js.native
  object Ready extends TopLevel[Ready with Double]
  
}

