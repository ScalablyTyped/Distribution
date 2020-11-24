package typings.lowdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FpReturnAsync[PathT] extends FpReturnBase[PathT] {
  
  /**
    * @description Writes the change to the database, based on the callback's return value.
    * @example
    * ```js
    *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
    * ```
    */
  def write[R1 /* <: PathT */](f1: js.Function1[/* a1 */ PathT, R1]): js.Promise[R1] = js.native
}
