package typings.isMyJsonValid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator[Schema /* <: AnySchema */, Output] extends js.Object {
  
  def apply(input: js.Any): /* is Output */ Boolean = js.native
  def apply(input: js.Any, options: js.Any): /* is Output */ Boolean = js.native
  
  var errors: js.Array[ValidationError] = js.native
  
  def toJSON(): Schema = js.native
}
