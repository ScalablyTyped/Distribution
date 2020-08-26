package typings.graphqlToolsDelegate.addSelectionSetsByFieldMod

import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddSelectionSetsByField
  extends Transform[Record[String, js.Any]] {
  val mapping: js.Any = js.native
  val schema: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MAddSelectionSetsByField(originalRequest: Request): Request = js.native
}

object AddSelectionSetsByField {
  @scala.inline
  def apply(mapping: js.Any, schema: js.Any, transformRequest: Request => Request): AddSelectionSetsByField = {
    val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    __obj.asInstanceOf[AddSelectionSetsByField]
  }
  @scala.inline
  implicit class AddSelectionSetsByFieldOps[Self <: AddSelectionSetsByField] (val x: Self) extends AnyVal {
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
    def setMapping(value: js.Any): Self = this.set("mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformRequest(value: Request => Request): Self = this.set("transformRequest", js.Any.fromFunction1(value))
  }
  
}

