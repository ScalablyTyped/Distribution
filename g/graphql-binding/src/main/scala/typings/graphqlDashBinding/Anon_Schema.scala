package typings.graphqlDashBinding

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Schema extends js.Object {
  var schema: GraphQLSchema
}

object Anon_Schema {
  @scala.inline
  def apply(schema: GraphQLSchema): Anon_Schema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Schema]
  }
}

