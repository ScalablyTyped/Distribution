package typings.makeDashDir

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoffstat extends js.Object {
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: Double): js.Promise[Stats]
}

object Typeoffstat {
  @scala.inline
  def apply(__promisify__ : Double => js.Promise[Stats]): Typeoffstat = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Typeoffstat]
  }
}

