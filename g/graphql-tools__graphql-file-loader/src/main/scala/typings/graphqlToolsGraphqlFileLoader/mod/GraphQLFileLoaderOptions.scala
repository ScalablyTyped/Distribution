package typings.graphqlToolsGraphqlFileLoader.mod

import typings.graphqlToolsUtils.loadersMod.SingleFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLFileLoaderOptions extends SingleFileOptions {
  /**
    * Set to `true` to disable handling `#import` syntax
    */
  var skipGraphQLImport: js.UndefOr[Boolean] = js.native
}

object GraphQLFileLoaderOptions {
  @scala.inline
  def apply(): GraphQLFileLoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLFileLoaderOptions]
  }
  @scala.inline
  implicit class GraphQLFileLoaderOptionsOps[Self <: GraphQLFileLoaderOptions] (val x: Self) extends AnyVal {
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
    def setSkipGraphQLImport(value: Boolean): Self = this.set("skipGraphQLImport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipGraphQLImport: Self = this.set("skipGraphQLImport", js.undefined)
  }
  
}

