package typings.graphqlToolsGithubLoader.mod

import typings.graphqlToolsGraphqlTagPluck.mod.GraphQLTagPluckOptions
import typings.graphqlToolsUtils.loadersMod.SingleFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GithubLoaderOptions extends SingleFileOptions {
  /**
    * Additional options to pass to `graphql-tag-pluck`
    */
  var pluckConfig: js.UndefOr[GraphQLTagPluckOptions] = js.native
  /**
    * A GitHub access token
    */
  var token: String = js.native
}

object GithubLoaderOptions {
  @scala.inline
  def apply(token: String): GithubLoaderOptions = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubLoaderOptions]
  }
  @scala.inline
  implicit class GithubLoaderOptionsOps[Self <: GithubLoaderOptions] (val x: Self) extends AnyVal {
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluckConfig(value: GraphQLTagPluckOptions): Self = this.set("pluckConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluckConfig: Self = this.set("pluckConfig", js.undefined)
  }
  
}

