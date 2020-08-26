package typings.graphqlToolsMerge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mergeResolversMod {
  type ResolversDefinition[TContext] = (typings.graphqlToolsUtils.interfacesMod.IResolvers[js.Any, TContext, typings.std.Record[java.lang.String, js.Any], js.Any]) | typings.graphqlToolsMerge.mergeResolversMod.ResolversFactory[TContext]
  type ResolversFactory[TContext] = js.Function1[
    /* repeated */ js.Any, 
    typings.graphqlToolsUtils.interfacesMod.IResolvers[js.Any, TContext, typings.std.Record[java.lang.String, js.Any], js.Any]
  ]
}
