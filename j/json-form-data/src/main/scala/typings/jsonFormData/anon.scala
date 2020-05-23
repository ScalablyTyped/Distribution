package typings.jsonFormData

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(name: String, value: String): Unit = js.native
    def apply(name: String, value: String, fileName: String): Unit = js.native
    def apply(name: String, value: Blob): Unit = js.native
    def apply(name: String, value: Blob, fileName: String): Unit = js.native
  }
  
}

