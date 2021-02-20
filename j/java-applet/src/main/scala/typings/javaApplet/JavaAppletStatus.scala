package typings.javaApplet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JavaAppletStatus extends StObject
@JSGlobal("JavaAppletStatus")
@js.native
object JavaAppletStatus extends StObject {
  
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
}
