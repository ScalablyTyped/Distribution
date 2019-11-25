package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgNameField extends js.Object {
  var field: GraphQLFieldConfig[_, _, StringDictionary[_]]
  var name: String
}

object Anon_ArgNameField {
  @scala.inline
  def apply(field: GraphQLFieldConfig[_, _, StringDictionary[_]], name: String): Anon_ArgNameField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArgNameField]
  }
}

