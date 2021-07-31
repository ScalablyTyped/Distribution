package typings.javaApplet

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLAppletElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Interface for Java applet object.
  * @author  Cyril Schumacher
  * @version 1.0
  */
@js.native
trait JavaApplet
  extends StObject
     with HTMLAppletElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
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
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * @summary Java applet Status.
    * @type {JavaAppletStatus}
    */
  var status: js.UndefOr[JavaAppletStatus] = js.native
}
