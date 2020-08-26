package typings.graphqlToolsWrap.mapLeafValuesMod

import typings.graphqlToolsUtils.interfacesMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLeafValuesTransformationContext extends js.Object {
  var transformedRequest: Request = js.native
}

object MapLeafValuesTransformationContext {
  @scala.inline
  def apply(transformedRequest: Request): MapLeafValuesTransformationContext = {
    val __obj = js.Dynamic.literal(transformedRequest = transformedRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLeafValuesTransformationContext]
  }
  @scala.inline
  implicit class MapLeafValuesTransformationContextOps[Self <: MapLeafValuesTransformationContext] (val x: Self) extends AnyVal {
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
    def setTransformedRequest(value: Request): Self = this.set("transformedRequest", value.asInstanceOf[js.Any])
  }
  
}

