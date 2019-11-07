package typings.jss.jssMod

import typings.jss.Anon_Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JssOptions extends js.Object {
  var Renderer: js.UndefOr[Anon_Renderer | Null] = js.native
  @JSName("createGenerateId")
  var createGenerateId_Original: CreateGenerateId = js.native
  var insertionPoint: InsertionPoint = js.native
  var plugins: js.Array[Plugin] = js.native
  def createGenerateId(): GenerateId = js.native
  def createGenerateId(options: CreateGenerateIdOptions): GenerateId = js.native
}

