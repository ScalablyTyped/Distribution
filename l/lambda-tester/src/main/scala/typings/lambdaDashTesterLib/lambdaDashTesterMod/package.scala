package typings
package lambdaDashTesterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaDashTesterMod {
  type HandlerError[T /* <: awsDashLambdaLib.awsDashLambdaMod.Handler[_, _] */] = stdLib.NonNullable[
    /* import warning: ImportType.apply Failed type conversion: std.Parameters<aws-lambda.aws-lambda.Callback<any>>['0'] */ js.Any
  ]
  type HandlerEvent[T /* <: awsDashLambdaLib.awsDashLambdaMod.Handler[_, _] */] = js.Any
  type HandlerResult[T /* <: awsDashLambdaLib.awsDashLambdaMod.Handler[_, _] */] = js.Any
  type Verifier[S] = VerifierFn[stdLib.Error | S | java.lang.String]
}
