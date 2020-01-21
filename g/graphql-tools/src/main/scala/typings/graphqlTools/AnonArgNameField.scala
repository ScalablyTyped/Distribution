package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgNameField extends js.Object {
  var field: GraphQLFieldConfig[_, _, StringDictionary[_]]
  var name: String
}

object AnonArgNameField {
  @scala.inline
  def apply(field: GraphQLFieldConfig[_, _, StringDictionary[_]], name: String): AnonArgNameField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgNameField]
  }
}

