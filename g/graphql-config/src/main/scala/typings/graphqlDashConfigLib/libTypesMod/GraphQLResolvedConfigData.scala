package typings
package graphqlDashConfigLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolvedConfigData extends js.Object {
  var excludes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var extensions: js.UndefOr[GraphQLConfigExtensions] = js.undefined
  var includes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var schemaPath: java.lang.String
}

object GraphQLResolvedConfigData {
  @scala.inline
  def apply(
    schemaPath: java.lang.String,
    excludes: js.Array[java.lang.String] = null,
    extensions: GraphQLConfigExtensions = null,
    includes: js.Array[java.lang.String] = null
  ): GraphQLResolvedConfigData = {
    val __obj = js.Dynamic.literal(schemaPath = schemaPath)
    if (excludes != null) __obj.updateDynamic("excludes")(excludes)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (includes != null) __obj.updateDynamic("includes")(includes)
    __obj.asInstanceOf[GraphQLResolvedConfigData]
  }
}

