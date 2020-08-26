package typings.graphqlConfig.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLResolvedConfigData extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.native
  var extensions: js.UndefOr[GraphQLConfigExtensions] = js.native
  var includes: js.UndefOr[js.Array[String]] = js.native
  var schemaPath: String = js.native
}

object GraphQLResolvedConfigData {
  @scala.inline
  def apply(schemaPath: String): GraphQLResolvedConfigData = {
    val __obj = js.Dynamic.literal(schemaPath = schemaPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResolvedConfigData]
  }
  @scala.inline
  implicit class GraphQLResolvedConfigDataOps[Self <: GraphQLResolvedConfigData] (val x: Self) extends AnyVal {
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
    def setSchemaPath(value: String): Self = this.set("schemaPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludesVarargs(value: String*): Self = this.set("excludes", js.Array(value :_*))
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = this.set("excludes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    @scala.inline
    def setExtensions(value: GraphQLConfigExtensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setIncludesVarargs(value: String*): Self = this.set("includes", js.Array(value :_*))
    @scala.inline
    def setIncludes(value: js.Array[String]): Self = this.set("includes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludes: Self = this.set("includes", js.undefined)
  }
  
}

