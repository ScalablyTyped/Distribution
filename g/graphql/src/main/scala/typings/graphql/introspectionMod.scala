package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLEnumType
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/introspection", JSImport.Namespace)
@js.native
object introspectionMod extends js.Object {
  @JSName("__Directive")
  val Directive: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__DirectiveLocation")
  val DirectiveLocation: GraphQLEnumType = js.native
  @JSName("__EnumValue")
  val EnumValue: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__Field")
  val Field: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__InputValue")
  val InputValue: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__Schema")
  val Schema: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__Type")
  val Type: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__TypeKind")
  val _TypeKind: GraphQLEnumType = js.native
  val introspectionTypes: js.Array[GraphQLType] = js.native
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

