package typings.javaDashApplet

import typings.std.HTMLAppletElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Interface for Java applet object.
  * @author  Cyril Schumacher
  * @version 1.0
  */
@js.native
trait JavaApplet extends HTMLAppletElement {
  /**
    * @summary Handler if the applet status is {@link JavaAppletStatus#Error}. An error has occurred while loading the applet.
    * @type {Function}
    */
  var onError: js.UndefOr[js.Function] = js.native
  /**
    * @summary Handler if the applet status is {@link JavaAppletStatus#Ready}. Applet has finished loading and is ready to receive JavaScript calls.
    * @type {Function}
    */
  var onLoad: js.UndefOr[js.Function] = js.native
  /**
    * @summary Handler if the applet has stopped.
    * @type {Function}
    */
  var onStop: js.UndefOr[js.Function] = js.native
  /**
    * @summary Java applet Status.
    * @type {JavaAppletStatus}
    */
  var status: js.UndefOr[JavaAppletStatus] = js.native
}

