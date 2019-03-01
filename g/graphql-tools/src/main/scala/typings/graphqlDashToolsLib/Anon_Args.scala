package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: org.scalablytyped.runtime.StringDictionary[js.Any]
  var context: org.scalablytyped.runtime.StringDictionary[js.Any]
  var name: java.lang.String
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var visitedType: graphqlDashToolsLib.distSchemaVisitorMod.VisitableSchemaType
}

object Anon_Args {
  @scala.inline
  def apply(
    args: org.scalablytyped.runtime.StringDictionary[js.Any],
    context: org.scalablytyped.runtime.StringDictionary[js.Any],
    name: java.lang.String,
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    visitedType: graphqlDashToolsLib.distSchemaVisitorMod.VisitableSchemaType
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("visitedType")(visitedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

