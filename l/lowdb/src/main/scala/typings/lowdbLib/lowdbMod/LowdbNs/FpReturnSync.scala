package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpReturnSync[PathT] extends FpReturnBase[PathT] {
  /**
    * @description Writes the change to the database, based on the callback's return value.
    * @example
    * ```js
    *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
    * ```
    */
  def write[R1 /* <: PathT */](f1: js.Function1[/* a1 */ PathT, R1]): R1 = js.native
}

