package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoffstat extends js.Object {
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: scala.Double): js.Promise[nodeLib.fsMod.Stats]
}

object Typeoffstat {
  @scala.inline
  def apply(__promisify__ : scala.Double => js.Promise[nodeLib.fsMod.Stats]): Typeoffstat = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Typeoffstat]
  }
}

