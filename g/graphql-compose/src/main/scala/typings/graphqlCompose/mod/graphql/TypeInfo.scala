package typings.graphqlCompose.mod.graphql

import typings.graphql.definitionMod.GraphQLType
import typings.graphql.typeInfoMod.getFieldDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.TypeInfo")
@js.native
class TypeInfo protected ()
  extends typings.graphqlCompose.graphqlMod.TypeInfo {
  def this(schema: typings.graphql.schemaMod.GraphQLSchema) = this()
  def this(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant code bases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef
  ) = this()
  def this(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant code bases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: js.UndefOr[scala.Nothing],
    // Initial type may be provided in rare cases to facilitate traversals
  // beginning somewhere other than documents.
  initialType: GraphQLType
  ) = this()
  def this(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant code bases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef,
    // Initial type may be provided in rare cases to facilitate traversals
  // beginning somewhere other than documents.
  initialType: GraphQLType
  ) = this()
}

