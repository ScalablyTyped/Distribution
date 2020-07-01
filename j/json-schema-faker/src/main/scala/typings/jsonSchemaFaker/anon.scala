package typings.jsonSchemaFaker

import typings.jsonSchemaFaker.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Callback extends js.Object {
    var name: String = js.native
    def callback(): Unit = js.native
    def callback(schema: Schema): Unit = js.native
  }
  
}

