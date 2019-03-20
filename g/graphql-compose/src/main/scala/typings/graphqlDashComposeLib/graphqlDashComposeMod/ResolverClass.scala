package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "ResolverClass")
@js.native
class ResolverClass[TSource, TContext, TArgs] protected ()
  extends graphqlDashComposeLib.libResolverMod.Resolver[TSource, TContext, TArgs] {
  def this(opts: graphqlDashComposeLib.libResolverMod.ResolverOpts[TSource, TContext, TArgs]) = this()
}

/* static members */
@JSImport("graphql-compose", "ResolverClass")
@js.native
object ResolverClass extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
}

