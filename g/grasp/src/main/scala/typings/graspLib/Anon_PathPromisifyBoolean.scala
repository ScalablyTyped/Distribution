package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathPromisifyBoolean extends js.Object {
  /**
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike): js.Promise[scala.Boolean]
}

object Anon_PathPromisifyBoolean {
  @scala.inline
  def apply(__promisify__ : nodeLib.fsMod.PathLike => js.Promise[scala.Boolean]): Anon_PathPromisifyBoolean = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Anon_PathPromisifyBoolean]
  }
}

