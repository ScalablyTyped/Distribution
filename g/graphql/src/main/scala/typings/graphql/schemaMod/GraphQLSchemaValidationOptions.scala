package typings.graphql.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLSchemaValidationOptions extends js.Object {
  /**
    * When building a schema from a GraphQL service's introspection result, it
    * might be safe to assume the schema is valid. Set to true to assume the
    * produced schema is valid.
    *
    * Default: false
    */
  var assumeValid: js.UndefOr[Boolean] = js.native
}

object GraphQLSchemaValidationOptions {
  @scala.inline
  def apply(): GraphQLSchemaValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLSchemaValidationOptions]
  }
  @scala.inline
  implicit class GraphQLSchemaValidationOptionsOps[Self <: GraphQLSchemaValidationOptions] (val x: Self) extends AnyVal {
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
    def setAssumeValid(value: Boolean): Self = this.set("assumeValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeValid: Self = this.set("assumeValid", js.undefined)
  }
  
}

