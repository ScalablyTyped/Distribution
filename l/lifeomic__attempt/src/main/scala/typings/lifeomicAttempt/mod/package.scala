package typings.lifeomicAttempt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttemptFunction[T] = js.Function2[
    /* context */ typings.lifeomicAttempt.mod.AttemptContext, 
    /* options */ typings.lifeomicAttempt.mod.AttemptOptions[T], 
    js.Promise[T]
  ]
  type BeforeAttempt[T] = js.Function2[
    /* context */ typings.lifeomicAttempt.mod.AttemptContext, 
    /* options */ typings.lifeomicAttempt.mod.AttemptOptions[T], 
    scala.Unit
  ]
  type CalculateDelay[T] = js.Function2[
    /* context */ typings.lifeomicAttempt.mod.AttemptContext, 
    /* options */ typings.lifeomicAttempt.mod.AttemptOptions[T], 
    scala.Double
  ]
  type HandleError[T] = js.Function3[
    /* err */ js.Any, 
    /* context */ typings.lifeomicAttempt.mod.AttemptContext, 
    /* options */ typings.lifeomicAttempt.mod.AttemptOptions[T], 
    scala.Unit
  ]
  type HandleTimeout[T] = js.Function2[
    /* context */ typings.lifeomicAttempt.mod.AttemptContext, 
    /* options */ typings.lifeomicAttempt.mod.AttemptOptions[T], 
    js.Promise[T]
  ]
}
