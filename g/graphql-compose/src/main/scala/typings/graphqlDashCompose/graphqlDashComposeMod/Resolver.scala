package typings.graphqlDashCompose.graphqlDashComposeMod

import typings.graphqlDashCompose.libResolverMod.ResolverOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "Resolver")
@js.native
class Resolver[TSource, TContext, TArgs, TReturn] protected ()
  extends typings.graphqlDashCompose.libResolverMod.Resolver[TSource, TContext, TArgs, TReturn] {
  def this(
    opts: ResolverOpts[TSource, TContext, TArgs, _],
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

