package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Schema extends js.Object {
  var schema: js.UndefOr[graphqlLib.graphqlMod.GraphQLSchema] = js.undefined
}

object Anon_Schema {
  @scala.inline
  def apply(schema: graphqlLib.graphqlMod.GraphQLSchema = null): Anon_Schema = {
    val __obj = js.Dynamic.literal()
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[Anon_Schema]
  }
}

