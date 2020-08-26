package typings.graphqlConfig.endpointsExtensionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLConfigEnpointConfig extends js.Object {
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var subscription: js.UndefOr[GraphQLConfigEnpointsSubscription] = js.native
  var url: String = js.native
}

object GraphQLConfigEnpointConfig {
  @scala.inline
  def apply(url: String): GraphQLConfigEnpointConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLConfigEnpointConfig]
  }
  @scala.inline
  implicit class GraphQLConfigEnpointConfigOps[Self <: GraphQLConfigEnpointConfig] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setSubscription(value: GraphQLConfigEnpointsSubscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
  
}

