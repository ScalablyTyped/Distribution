package typings.kefir.anon

import typings.kefir.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallPromise extends js.Object {
  
  def apply[T, S](promise: js.Promise[T]): Property[T, S] = js.native
}
