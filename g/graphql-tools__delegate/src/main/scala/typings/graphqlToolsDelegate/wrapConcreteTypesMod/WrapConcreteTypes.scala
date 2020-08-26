package typings.graphqlToolsDelegate.wrapConcreteTypesMod

import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapConcreteTypes
  extends Transform[Record[String, js.Any]] {
  val returnType: js.Any = js.native
  val targetSchema: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MWrapConcreteTypes(originalRequest: Request): Request = js.native
}

object WrapConcreteTypes {
  @scala.inline
  def apply(returnType: js.Any, targetSchema: js.Any, transformRequest: Request => Request): WrapConcreteTypes = {
    val __obj = js.Dynamic.literal(returnType = returnType.asInstanceOf[js.Any], targetSchema = targetSchema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    __obj.asInstanceOf[WrapConcreteTypes]
  }
  @scala.inline
  implicit class WrapConcreteTypesOps[Self <: WrapConcreteTypes] (val x: Self) extends AnyVal {
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
    def setReturnType(value: js.Any): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetSchema(value: js.Any): Self = this.set("targetSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformRequest(value: Request => Request): Self = this.set("transformRequest", js.Any.fromFunction1(value))
  }
  
}

