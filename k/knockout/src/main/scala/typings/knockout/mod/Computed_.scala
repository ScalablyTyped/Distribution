package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Computed_[T]
  extends ComputedFunctions[T]
     with _ComputedReadFunction[T, Any] {
  
  def apply(): T = js.native
  def apply(value: T): this.type = js.native
}
