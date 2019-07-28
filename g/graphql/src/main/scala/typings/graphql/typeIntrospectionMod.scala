package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLEnumType
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/introspection", JSImport.Namespace)
@js.native
object typeIntrospectionMod extends js.Object {
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Directive: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __DirectiveLocation: GraphQLEnumType = js.native
  val __EnumValue: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Field: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __InputValue: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Schema: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Type: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __TypeKind: GraphQLEnumType = js.native
  val introspectionTypes: js.Array[js.Any] = js.native
  def isIntrospectionType(`type`: js.Any): Boolean = js.native
  @js.native
  object TypeKind extends js.Object {
    var ENUM: typings.graphql.graphqlStrings.ENUM = js.native
    var INPUT_OBJECT: typings.graphql.graphqlStrings.INPUT_OBJECT = js.native
    var INTERFACE: typings.graphql.graphqlStrings.INTERFACE = js.native
    var LIST: typings.graphql.graphqlStrings.LIST = js.native
    var NON_NULL: typings.graphql.graphqlStrings.NON_NULL = js.native
    var OBJECT: typings.graphql.graphqlStrings.OBJECT = js.native
    var SCALAR: typings.graphql.graphqlStrings.SCALAR = js.native
    var UNION: typings.graphql.graphqlStrings.UNION = js.native
  }
  
}

