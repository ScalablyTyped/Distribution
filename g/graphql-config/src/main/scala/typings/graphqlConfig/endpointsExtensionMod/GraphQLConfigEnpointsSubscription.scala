package typings.graphqlConfig.endpointsExtensionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLConfigEnpointsSubscription extends js.Object {
  var connectionParams: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  var url: String = js.native
}

object GraphQLConfigEnpointsSubscription {
  @scala.inline
  def apply(url: String): GraphQLConfigEnpointsSubscription = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLConfigEnpointsSubscription]
  }
  @scala.inline
  implicit class GraphQLConfigEnpointsSubscriptionOps[Self <: GraphQLConfigEnpointsSubscription] (val x: Self) extends AnyVal {
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
    def setConnectionParams(value: StringDictionary[js.UndefOr[String]]): Self = this.set("connectionParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionParams: Self = this.set("connectionParams", js.undefined)
  }
  
}

