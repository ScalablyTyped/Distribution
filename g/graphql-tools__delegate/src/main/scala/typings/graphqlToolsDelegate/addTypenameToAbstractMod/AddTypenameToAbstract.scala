package typings.graphqlToolsDelegate.addTypenameToAbstractMod

import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTypenameToAbstract
  extends Transform[Record[String, js.Any]] {
  val targetSchema: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MAddTypenameToAbstract(originalRequest: Request): Request = js.native
}

object AddTypenameToAbstract {
  @scala.inline
  def apply(targetSchema: js.Any, transformRequest: Request => Request): AddTypenameToAbstract = {
    val __obj = js.Dynamic.literal(targetSchema = targetSchema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    __obj.asInstanceOf[AddTypenameToAbstract]
  }
  @scala.inline
  implicit class AddTypenameToAbstractOps[Self <: AddTypenameToAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetSchema(value: js.Any): Self = this.set("targetSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformRequest(value: Request => Request): Self = this.set("transformRequest", js.Any.fromFunction1(value))
  }
  
}

