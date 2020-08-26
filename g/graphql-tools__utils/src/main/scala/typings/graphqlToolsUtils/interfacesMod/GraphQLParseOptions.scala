package typings.graphqlToolsUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLParseOptions extends js.Object {
  var allowLegacySDLEmptyFields: js.UndefOr[Boolean] = js.native
  var allowLegacySDLImplementsInterfaces: js.UndefOr[Boolean] = js.native
  var experimentalFragmentVariables: js.UndefOr[Boolean] = js.native
  var noLocation: js.UndefOr[Boolean] = js.native
}

object GraphQLParseOptions {
  @scala.inline
  def apply(): GraphQLParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLParseOptions]
  }
  @scala.inline
  implicit class GraphQLParseOptionsOps[Self <: GraphQLParseOptions] (val x: Self) extends AnyVal {
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
    def setAllowLegacySDLEmptyFields(value: Boolean): Self = this.set("allowLegacySDLEmptyFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowLegacySDLEmptyFields: Self = this.set("allowLegacySDLEmptyFields", js.undefined)
    @scala.inline
    def setAllowLegacySDLImplementsInterfaces(value: Boolean): Self = this.set("allowLegacySDLImplementsInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowLegacySDLImplementsInterfaces: Self = this.set("allowLegacySDLImplementsInterfaces", js.undefined)
    @scala.inline
    def setExperimentalFragmentVariables(value: Boolean): Self = this.set("experimentalFragmentVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentalFragmentVariables: Self = this.set("experimentalFragmentVariables", js.undefined)
    @scala.inline
    def setNoLocation(value: Boolean): Self = this.set("noLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoLocation: Self = this.set("noLocation", js.undefined)
  }
  
}

