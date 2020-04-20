package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  /*This is non-zero when the queue is waiting for a command to complete, i.e. a command being processed returns a
    * Callback object, indicating that the queue should wait for that action to complete before processing
    * additional commands.
    */
  var pending: Double
  /*An array containing the queued commands that are yet to be performed.*/
  var queue: js.Array[_]
  /*This is non-zero when the queue is executing one of the commands in the queue.*/
  var running: Double
  /*Process the commands in the queue, provided the queue is not waiting for another command to complete. This
    * method is used internally; you should not need to call it yourself.
    */
  def Process(): Unit
  /*Adds commands to the queue and runs them (if the queue is not pending or running another command). If one of
    * the callbacks is an actual Callback object rather than a callback specification, then the command queued is
    * an internal command to wait for the given callback to complete. That is, that callback is not itself queued
    * to be executed, but a wait for that callback is queued. The Push() method returns the last callback that was
    * added to the queue (so that it can be used for further synchronization, say as an entry in some other queue).
    */
  def Push(specs: js.Array[_]): CallbackObject
  /*Decrements the running property, if it is positive. When it is zero, commands can be processed, but that is
    * not done automatically — you would need to call Process() to make that happen. This method is used
    * internally; you should not need to call it yourself.
    */
  def Resume(): Unit
  /*Increments the running property, indicating that any commands that are added to the queue should not be
    * executed immediately, but should be queued for later execution (when its Resume() is called). This method is
    * used internally; you should not need to call it yourself.
    */
  def Suspend(): Unit
  /*An internal function used to restart processing of the queue after it has been waiting for a command to
    * complete.
    */
  def call(): Unit
  /*Used internally when an entry in the queue is a Callback object rather than a callback specification.
    * A callback to this function (passing it the original callback) is queued instead, and it simply returns the
    * callback it was passed. Since the queue will wait for a callback if it is the return value of one of the
    * commands it executes, this effectively makes the queue wait for the original callback at that point in the
    * command queue.
    */
  def wait(callback: js.Function): js.Function
}

object Queue {
  @scala.inline
  def apply(
    Process: () => Unit,
    Push: js.Array[_] => CallbackObject,
    Resume: () => Unit,
    Suspend: () => Unit,
    call: () => Unit,
    pending: Double,
    queue: js.Array[_],
    running: Double,
    wait: js.Function => js.Function
  ): Queue = {
    val __obj = js.Dynamic.literal(Process = js.Any.fromFunction0(Process), Push = js.Any.fromFunction1(Push), Resume = js.Any.fromFunction0(Resume), Suspend = js.Any.fromFunction0(Suspend), call = js.Any.fromFunction0(call), pending = pending.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], wait = js.Any.fromFunction1(wait))
    __obj.asInstanceOf[Queue]
  }
}

