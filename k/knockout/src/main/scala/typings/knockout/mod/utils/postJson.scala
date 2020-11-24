package typings.knockout.mod.utils

import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "utils.postJson")
@js.native
object postJson extends js.Object {
  
  def apply(urlOrForm: String, data: MaybeSubscribable[js.Object]): Unit = js.native
  def apply(urlOrForm: String, data: MaybeSubscribable[js.Object], options: PostJsonOptions): Unit = js.native
  def apply(urlOrForm: HTMLFormElement, data: MaybeSubscribable[js.Object]): Unit = js.native
  def apply(urlOrForm: HTMLFormElement, data: MaybeSubscribable[js.Object], options: PostJsonOptions): Unit = js.native
}
