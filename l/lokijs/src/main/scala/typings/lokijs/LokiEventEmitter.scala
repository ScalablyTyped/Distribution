package typings.lokijs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LokiEventEmitter is a minimalist version of EventEmitter. It enables any
  * constructor that inherits EventEmitter to emit events and trigger
  * listeners that have been added to the event through the on(event, callback) method
  *
  * @constructor LokiEventEmitter
  */
@js.native
trait LokiEventEmitter extends StObject {
  
  /**
    * Alias of LokiEventEmitter.prototype.on
    * addListener(eventName, listener) - adds a listener to the queue of callbacks associated to an event
    * @param eventName - the name(s) of the event(s) to listen to
    * @param listener - callback function of listener to attach
    * @returns the event listener added
    */
  def addListener[F /* <: js.Function1[/* repeated */ js.Any, js.Any] */](eventName: String, listener: F): F = js.native
  def addListener[F /* <: js.Function1[/* repeated */ js.Any, js.Any] */](eventName: js.Array[String], listener: F): F = js.native
  /**
    * Alias of LokiEventEmitter.prototype.on
    * addListener(eventName, listener) - adds a listener to the queue of callbacks associated to an event
    * @param eventName - the name(s) of the event(s) to listen to
    * @param listener - callback function of listener to attach
    * @returns the event listener added
    */
  @JSName("addListener")
  var addListener_Original: js.Function2[
    /* eventName */ String | js.Array[String], 
    /* listener */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ] = js.native
  
  /**
    * @prop asyncListeners - boolean determines whether or not the callbacks associated with each event
    * should happen in an async fashion or not
    * Default is false, which means events are synchronous
    */
  var asyncListeners: Boolean = js.native
  
  /**
    * emit(eventName, data) - emits a particular event
    * with the option of passing optional parameters which are going to be processed by the callback
    * provided signatures match (i.e. if passing emit(event, arg0, arg1) the listener should take two parameters)
    * @param eventName - the name of the event
    * @param data - optional object passed with the event
    */
  def emit(eventName: String): Unit = js.native
  def emit(eventName: String, data: js.Any): Unit = js.native
  def emit(eventName: String, data: js.Any, arg: js.Any): Unit = js.native
  def emit(eventName: String, data: Unit, arg: js.Any): Unit = js.native
  
  /**
    * @prop events - a hashmap, with each property being an array of callbacks
    */
  var events: StringDictionary[js.Array[js.Function1[/* repeated */ js.Any, js.Any]]] = js.native
  
  /**
    * on(eventName, listener) - adds a listener to the queue of callbacks associated to an event
    * @param eventName - the name(s) of the event(s) to listen to
    * @param listener - callback function of listener to attach
    * @returns the index of the callback in the array of listeners for a particular event
    */
  def on[F /* <: js.Function1[/* repeated */ js.Any, js.Any] */](eventName: String, listener: F): F = js.native
  def on[F /* <: js.Function1[/* repeated */ js.Any, js.Any] */](eventName: js.Array[String], listener: F): F = js.native
  
  /**
    * removeListener() - removes the listener at position 'index' from the event 'eventName'
    * @param eventName - the name(s) of the event(s) which the listener is attached to
    * @param listener - the listener callback function to remove from emitter
    */
  def removeListener(eventName: String, listener: js.Function1[/* repeated */ js.Any, js.Any]): Unit = js.native
  def removeListener(eventName: js.Array[String], listener: js.Function1[/* repeated */ js.Any, js.Any]): Unit = js.native
}
