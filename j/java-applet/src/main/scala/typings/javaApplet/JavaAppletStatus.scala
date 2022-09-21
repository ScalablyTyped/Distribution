package typings.javaApplet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JavaAppletStatus extends StObject
/**
  * @summary Java applet Status. More details: {@link http://docs.oracle.com/javase/8/docs/technotes/guides/deploy/applet_dev_guide.html#JSDPG719|Applet Status And Event Handlers}
  */
@JSGlobal("JavaAppletStatus")
@js.native
object JavaAppletStatus extends StObject {
  
  /**
    * @summary Error while loading applet.
    */
  @js.native
  sealed trait Error
    extends StObject
       with JavaAppletStatus
  
  /**
    * @summary Applet is loading.
    */
  @js.native
  sealed trait Loading
    extends StObject
       with JavaAppletStatus
  
  /**
    * @summary Applet has loaded completely and is ready to receive JavaScript calls.
    */
  @js.native
  sealed trait Ready
    extends StObject
       with JavaAppletStatus
}
