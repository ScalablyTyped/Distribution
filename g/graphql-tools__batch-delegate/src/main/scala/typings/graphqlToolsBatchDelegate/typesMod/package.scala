package typings.graphqlToolsBatchDelegate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type BatchDelegateFn[TContext, K] = js.Function1[
    /* batchDelegateOptions */ typings.graphqlToolsBatchDelegate.typesMod.BatchDelegateOptions[TContext, K], 
    js.Any
  ]
  type BatchDelegateOptionsFn[TContext, K] = js.Function1[
    /* batchDelegateOptions */ typings.graphqlToolsBatchDelegate.typesMod.BatchDelegateOptions[TContext, K], 
    typings.graphqlToolsDelegate.typesMod.IDelegateToSchemaOptions[TContext, typings.std.Record[java.lang.String, js.Any]]
  ]
}
