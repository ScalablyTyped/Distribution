package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick) */ 
trait ValidationResult[T] extends js.Object {
  var error: ValidationError
  var value: T
}

