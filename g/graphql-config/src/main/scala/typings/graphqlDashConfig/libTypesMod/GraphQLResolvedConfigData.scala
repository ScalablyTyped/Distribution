package typings.graphqlDashConfig.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolvedConfigData extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
  var extensions: js.UndefOr[GraphQLConfigExtensions] = js.undefined
  var includes: js.UndefOr[js.Array[String]] = js.undefined
  var schemaPath: String
}

object GraphQLResolvedConfigData {
  @scala.inline
  def apply(
    schemaPath: String,
    excludes: js.Array[String] = null,
    extensions: GraphQLConfigExtensions = null,
    includes: js.Array[String] = null
  ): GraphQLResolvedConfigData = {
    val __obj = js.Dynamic.literal(schemaPath = schemaPath)
    if (excludes != null) __obj.updateDynamic("excludes")(excludes)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (includes != null) __obj.updateDynamic("includes")(includes)
    __obj.asInstanceOf[GraphQLResolvedConfigData]
  }
}

