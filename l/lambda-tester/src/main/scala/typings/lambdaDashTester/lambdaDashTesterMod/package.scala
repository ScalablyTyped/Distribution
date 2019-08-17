package typings.lambdaDashTester

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaDashTesterMod {
  import typings.awsDashLambda.awsDashLambdaMod.Handler
  import typings.std.Error
  import typings.std.NonNullable

  type HandlerError[T /* <: Handler[_, _] */] = NonNullable[
    /* import warning: ImportType.apply Failed type conversion: std.Parameters<aws-lambda.aws-lambda.Callback<any>>['0'] */ js.Any
  ]
  type HandlerEvent[T /* <: Handler[_, _] */] = js.Any
  type HandlerResult[T /* <: Handler[_, _] */] = js.Any
  type Verifier[S] = VerifierFn[Error | S | String]
}
