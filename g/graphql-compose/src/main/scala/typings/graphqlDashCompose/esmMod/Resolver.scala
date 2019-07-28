package typings.graphqlDashCompose.esmMod

import typings.graphqlDashCompose.esmResolverMod.ResolverOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "Resolver")
@js.native
class Resolver[TSource, TContext, TArgs, TReturn] protected ()
  extends typings.graphqlDashCompose.esmResolverMod.Resolver[TSource, TContext, TArgs, TReturn] {
  def this(
    opts: ResolverOpts[TSource, TContext, TArgs, _],
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

