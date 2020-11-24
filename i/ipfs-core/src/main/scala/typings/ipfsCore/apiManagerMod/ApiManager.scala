package typings.ipfsCore.apiManagerMod

import typings.ipfsCore.anon.Api
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiManager extends js.Object {
  
  /**
    * @type {UndefFn}
    * @returns {any}
    */
  def _onUndef(prop: PropertyKey): js.Any = js.native
  
  /**
    * @template A
    * @param {A} nextApi
    * @param {UndefFn} [onUndef]
    * @returns {Updated<A>}
    */
  def update[A](nextApi: A): Api[A] = js.native
  def update[A](nextApi: A, onUndef: js.Function1[/* prop */ PropertyKey, _]): Api[A] = js.native
}
