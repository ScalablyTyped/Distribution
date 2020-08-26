package typings.graphqlToolsDelegate.visitSelectionSetsMod

import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisitSelectionSets
  extends Transform[Record[String, js.Any]] {
  val initialType: js.Any = js.native
  val schema: js.Any = js.native
  val visitor: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MVisitSelectionSets(originalRequest: Request): Request = js.native
}

object VisitSelectionSets {
  @scala.inline
  def apply(initialType: js.Any, schema: js.Any, transformRequest: Request => Request, visitor: js.Any): VisitSelectionSets = {
    val __obj = js.Dynamic.literal(initialType = initialType.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest), visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitSelectionSets]
  }
  @scala.inline
  implicit class VisitSelectionSetsOps[Self <: VisitSelectionSets] (val x: Self) extends AnyVal {
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
    def setInitialType(value: js.Any): Self = this.set("initialType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformRequest(value: Request => Request): Self = this.set("transformRequest", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitor(value: js.Any): Self = this.set("visitor", value.asInstanceOf[js.Any])
  }
  
}

