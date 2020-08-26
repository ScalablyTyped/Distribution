package typings.graphql.getIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionOptions extends js.Object {
  // Whether to include descriptions in the introspection result.
  // Default: true
  var descriptions: js.UndefOr[Boolean] = js.native
  // Whether to include `isRepeatable` flag on directives.
  // Default: false
  var directiveIsRepeatable: js.UndefOr[Boolean] = js.native
  // Whether to include `description` field on schema.
  // Default: false
  var schemaDescription: js.UndefOr[Boolean] = js.native
  // Whether to include `specifiedByUrl` in the introspection result.
  // Default: false
  var specifiedByUrl: js.UndefOr[Boolean] = js.native
}

object IntrospectionOptions {
  @scala.inline
  def apply(): IntrospectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrospectionOptions]
  }
  @scala.inline
  implicit class IntrospectionOptionsOps[Self <: IntrospectionOptions] (val x: Self) extends AnyVal {
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
    def setDescriptions(value: Boolean): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptions: Self = this.set("descriptions", js.undefined)
    @scala.inline
    def setDirectiveIsRepeatable(value: Boolean): Self = this.set("directiveIsRepeatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectiveIsRepeatable: Self = this.set("directiveIsRepeatable", js.undefined)
    @scala.inline
    def setSchemaDescription(value: Boolean): Self = this.set("schemaDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaDescription: Self = this.set("schemaDescription", js.undefined)
    @scala.inline
    def setSpecifiedByUrl(value: Boolean): Self = this.set("specifiedByUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecifiedByUrl: Self = this.set("specifiedByUrl", js.undefined)
  }
  
}

