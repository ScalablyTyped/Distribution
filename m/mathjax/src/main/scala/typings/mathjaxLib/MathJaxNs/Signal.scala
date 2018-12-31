package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signal extends js.Object {
  /*Array of callbacks to the listeners who have expressed interest in hearing about posts to this signal.
    * When a post occurs, the listeners are called, each in turn, passing them the message that was posted.
    */
  var listeners: js.Array[CallbackObject] = js.native
  /*The name of the signal. Each signal is named so that various components can access it. The first one to
    * request a particular signal causes it to be created, and other requests for the signal return references
    * to the same object.
    */
  var name: java.lang.String = js.native
  /*Array used internally to store the post history so that when new listeners express interests in this signal,
    * they can be informed of the signals that have been posted so far. This can be cleared using the signal’s
    * Clear() method.
    */
  var posted: js.Array[_] = js.native
  /*This causes the history of past messages to be cleared so new listeners will not receive them. Note that since
    * the signal may be operating asynchronously, the Clear() may be queued for later. In this way, the Post() and
    * Clear() operations will be performed in the proper order even when they are delayed. The callback is called
    * when the Clear() operation is completed.
    *
    * Returns the callback (or a blank callback if none is provided).
    */
  def Clear(): CallbackObject = js.native
  def Clear(callback: CallbackObject): CallbackObject = js.native
  /*Used internally to call the listeners when a particular message is posted to the signal.*/
  def ExecuteHook(message: java.lang.String): scala.Unit = js.native
  /*This method registers a new listener on the signal. It creates a Callback object from the callback
    * specification, attaches it to the signal, and returns that Callback object. When new messages are posted to
    * the signal, it runs the callback, passing it the message that was posted. If the callback itself returns a
    * Callback object, that indicates that the listener has started an asynchronous operation and the poster should
    * wait for that callback to complete before allowing new posts on the signal.
    *
    * If ignorePast is false or not present, then before Interest() returns, the callback will be called with all
    * the past messages that have been sent to the signal.
    */
  def Interest(callback: CallbackObject): CallbackObject = js.native
  def Interest(callback: CallbackObject, ignorePast: scala.Boolean): CallbackObject = js.native
  /*This creates a callback that is called whenever the signal posts the given message. This is a little easier
    * than having to write a function that must check the message each time it is called. Although the message here
    * is a string, if a message posted to the signal is an array, then only the first element of that array is used
    * to match against the message. That way, if a message contains an identifier plus arguments, the hook will
    * match the identifier and still get called with the complete set of arguments.
    *
    * Returns the Callback object that was produced.
    */
  def MessageHook(message: java.lang.String, callback: CallbackObject): CallbackObject = js.native
  /*This removes a listener from the signal so that no new messages will be sent to it. The callback should be the
    * one returned by the original Interest() call that attached the listener to the signal in the first place.
    * Once removed, the listener will no longer receive messages from the signal.
    */
  def NoInterest(callback: CallbackObject): scala.Unit = js.native
  /*Posts a message to all the listeners for the signal. The listener callbacks are called in turn (with the
    * message as an argument), and if any return a Callback object, the posting will be suspended until the callback
    * is executed. In this way, the Post() call can operate asynchronously, and so the callback parameter is used to
    * synchronize with its operation; the callback will be called when all the listeners have responded to the post.
    *
    * If a Post() to this signal occurs while waiting for the response from a listener (either because a listener
    * returned a Callback object and we are waiting for it to complete when the Post() occurred, or because the
    * listener itself called the Post() method), the new message will be queued and will be posted after the current
    * message has been sent to all the listeners, and they have all responded. This is another way in which posting
    * can be asynchronous; the only sure way to know that a posting has occurred is through its callback. When the
    * posting is complete, the callback is called, passing it the signal object that has just completed.
    *
    * Returns the callback object (or a blank callback object if none was provided).
    */
  def Post(message: java.lang.String): CallbackObject = js.native
  def Post(message: java.lang.String, callback: CallbackObject): CallbackObject = js.native
}

