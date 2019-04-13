package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/introspection", JSImport.Namespace)
@js.native
object typeIntrospectionMod extends js.Object {
  val SchemaMetaFieldDef: graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val TypeMetaFieldDef: graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __Directive: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __DirectiveLocation: graphqlLib.typeDefinitionMod.GraphQLEnumType = js.native
  val __EnumValue: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __Field: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __InputValue: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __Schema: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __Type: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __TypeKind: graphqlLib.typeDefinitionMod.GraphQLEnumType = js.native
  val introspectionTypes: js.Array[js.Any] = js.native
  def isIntrospectionType(`type`: js.Any): scala.Boolean = js.native
  @js.native
  object TypeKind extends js.Object {
    var ENUM: graphqlLib.graphqlLibStrings.ENUM = js.native
    var INPUT_OBJECT: graphqlLib.graphqlLibStrings.INPUT_OBJECT = js.native
    var INTERFACE: graphqlLib.graphqlLibStrings.INTERFACE = js.native
    var LIST: graphqlLib.graphqlLibStrings.LIST = js.native
    var NON_NULL: graphqlLib.graphqlLibStrings.NON_NULL = js.native
    var OBJECT: graphqlLib.graphqlLibStrings.OBJECT = js.native
    var SCALAR: graphqlLib.graphqlLibStrings.SCALAR = js.native
    var UNION: graphqlLib.graphqlLibStrings.UNION = js.native
  }
  
}

