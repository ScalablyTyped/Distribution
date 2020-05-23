package typings.graphqlTools.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldName extends js.Object {
  var field: GraphQLFieldConfig[_, _, StringDictionary[_]]
  var name: String
}

object FieldName {
  @scala.inline
  def apply(field: GraphQLFieldConfig[_, _, StringDictionary[_]], name: String): FieldName = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldName]
  }
}

