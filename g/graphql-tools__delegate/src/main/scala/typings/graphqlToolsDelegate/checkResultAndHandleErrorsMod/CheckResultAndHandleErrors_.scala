package typings.graphqlToolsDelegate.checkResultAndHandleErrorsMod

import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckResultAndHandleErrors_
  extends Transform[Record[String, js.Any]] {
  val context: js.Any = js.native
  val fieldName: js.Any = js.native
  val info: js.Any = js.native
  val returnType: js.Any = js.native
  val subschema: js.Any = js.native
  val typeMerge: js.Any = js.native
  @JSName("transformResult")
  def transformResult_MCheckResultAndHandleErrors_(result: js.Any): js.Any = js.native
}

object CheckResultAndHandleErrors_ {
  @scala.inline
  def apply(
    context: js.Any,
    fieldName: js.Any,
    info: js.Any,
    returnType: js.Any,
    subschema: js.Any,
    transformResult: js.Any => js.Any,
    typeMerge: js.Any
  ): CheckResultAndHandleErrors_ = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], subschema = subschema.asInstanceOf[js.Any], transformResult = js.Any.fromFunction1(transformResult), typeMerge = typeMerge.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckResultAndHandleErrors_]
  }
  @scala.inline
  implicit class CheckResultAndHandleErrors_Ops[Self <: CheckResultAndHandleErrors_] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldName(value: js.Any): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: js.Any): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: js.Any): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubschema(value: js.Any): Self = this.set("subschema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformResult(value: js.Any => js.Any): Self = this.set("transformResult", js.Any.fromFunction1(value))
    @scala.inline
    def setTypeMerge(value: js.Any): Self = this.set("typeMerge", value.asInstanceOf[js.Any])
  }
  
}

