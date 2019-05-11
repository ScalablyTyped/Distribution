package typings
package graphqlDashComposeLib.esmGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/graphql", "TypeInfo")
@js.native
class TypeInfo protected ()
  extends graphqlLib.graphqlMod.TypeInfo {
  def this(schema: graphqlLib.typeSchemaMod.GraphQLSchema) = this()
  def this(schema: graphqlLib.typeSchemaMod.GraphQLSchema, // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant codebases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: graphqlLib.utilitiesTypeInfoMod.getFieldDef) = this()
  def this(schema: graphqlLib.typeSchemaMod.GraphQLSchema, // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant codebases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: graphqlLib.utilitiesTypeInfoMod.getFieldDef, // Initial type may be provided in rare cases to facilitate traversals
  // beginning somewhere other than documents.
  initialType: graphqlLib.typeDefinitionMod.GraphQLType) = this()
}

