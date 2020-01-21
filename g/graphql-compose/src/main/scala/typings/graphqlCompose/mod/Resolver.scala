package typings.graphqlCompose.mod

import typings.graphqlCompose.resolverMod.ResolverOpts
import typings.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "Resolver")
@js.native
class Resolver[TSource, TContext, TArgs, TReturn] protected ()
  extends typings.graphqlCompose.resolverMod.Resolver[TSource, TContext, TArgs, TReturn] {
  def this(opts: ResolverOpts[TSource, TContext, TArgs, _], schemaComposer: SchemaComposer[TContext]) = this()
}

