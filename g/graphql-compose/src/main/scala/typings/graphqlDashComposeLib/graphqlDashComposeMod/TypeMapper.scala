package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type storage and type generator from `Schema Definition Language` (`SDL`).
  * This is slightly rewritten [buildASTSchema](https://github.com/graphql/graphql-js/blob/master/src/utilities/buildASTSchema.js)
  * utility from `graphql-js` that allows to create type from a string (SDL).
  */
@JSImport("graphql-compose", "TypeMapper")
@js.native
class TypeMapper[TContext] protected ()
  extends graphqlDashComposeLib.libTypeMapperMod.TypeMapper[TContext] {
  def this(schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
}

