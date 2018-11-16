package typings
package graphqlDashResolveDashBatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashResolveDashBatchMod {
  type BatchResolveFunction[TSource, TArgs, TContext, TReturn] = js.Function4[
    /* sources */ js.Array[TSource], 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    js.Array[TReturn] | stdLib.Promise[js.Array[TReturn]]
  ]
  type ResolverFunction[TSource, TArgs, TContext, TReturn] = js.Function3[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    stdLib.Promise[TReturn]
  ]
}
