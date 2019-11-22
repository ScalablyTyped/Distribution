package typings.atLifeomicAttempt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atLifeomicAttemptMod {
  type AttemptFunction[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], js.Promise[T]]
  type BeforeAttempt[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], Unit]
  type CalculateDelay[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], Double]
  type HandleError[T] = js.Function3[/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T], Unit]
  type HandleTimeout[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], js.Promise[T]]
  type PartialAttemptOptions[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T> ]:? @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T>[P]}
    */ typings.atLifeomicAttempt.atLifeomicAttemptStrings.PartialAttemptOptions with AttemptOptions[T]
}
