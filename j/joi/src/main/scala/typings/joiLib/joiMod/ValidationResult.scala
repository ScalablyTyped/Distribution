package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'then' | 'catch' ]: std.Promise<std.Promise<T>>[P]} */ trait ValidationResult[T] extends js.Object {
  var error: ValidationError
  var value: T
}

