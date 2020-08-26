package typings.graphql.getIntrospectionQueryMod

import typings.graphql.graphqlStrings.ENUM
import typings.graphql.graphqlStrings.INPUT_OBJECT
import typings.graphql.graphqlStrings.SCALAR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.getIntrospectionQueryMod.IntrospectionScalarType
  - typings.graphql.getIntrospectionQueryMod.IntrospectionEnumType
  - typings.graphql.getIntrospectionQueryMod.IntrospectionInputObjectType
*/
trait IntrospectionInputType extends js.Object

object IntrospectionInputType {
  @scala.inline
  def IntrospectionScalarType(kind: SCALAR, name: String): IntrospectionInputType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputType]
  }
  @scala.inline
  def IntrospectionEnumType(enumValues: js.Array[IntrospectionEnumValue], kind: ENUM, name: String): IntrospectionInputType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputType]
  }
  @scala.inline
  def IntrospectionInputObjectType(inputFields: js.Array[IntrospectionInputValue], kind: INPUT_OBJECT, name: String): IntrospectionInputType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputType]
  }
}

