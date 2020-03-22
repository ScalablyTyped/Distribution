package typings.graphqlConfig.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-config.graphql-config/lib/types.GraphQLResolvedConfigData & {  projects ? :{[projectName: string] : graphql-config.graphql-config/lib/types.GraphQLResolvedConfigData}} */
trait GraphQLConfigData extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
  var extensions: js.UndefOr[GraphQLConfigExtensions] = js.undefined
  var includes: js.UndefOr[js.Array[String]] = js.undefined
  var projects: js.UndefOr[StringDictionary[GraphQLResolvedConfigData]] = js.undefined
  var schemaPath: String
}

object GraphQLConfigData {
  @scala.inline
  def apply(
    schemaPath: String,
    excludes: js.Array[String] = null,
    extensions: GraphQLConfigExtensions = null,
    includes: js.Array[String] = null,
    projects: StringDictionary[GraphQLResolvedConfigData] = null
  ): GraphQLConfigData = {
    val __obj = js.Dynamic.literal(schemaPath = schemaPath.asInstanceOf[js.Any])
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (includes != null) __obj.updateDynamic("includes")(includes.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLConfigData]
  }
}

