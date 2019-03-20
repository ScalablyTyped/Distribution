package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "Resolver")
@js.native
class Resolver[TSource, TContext, TArgs] protected ()
  extends graphqlDashComposeLib.libResolverMod.Resolver[TSource, TContext, TArgs] {
  def this(opts: graphqlDashComposeLib.libResolverMod.ResolverOpts[TSource, TContext, TArgs]) = this()
}

/* static members */
@JSImport("graphql-compose", "Resolver")
@js.native
object Resolver extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
}

