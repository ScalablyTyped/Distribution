package typings.knockoutEditables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutEditableStatic extends StObject {
  
  def apply(viewModel: Any): Unit = js.native
  def apply(viewModel: Any, autoInit: Boolean): Unit = js.native
  
  def beginEdit(scope: String): Unit = js.native
  
  def commit(scope: String): Unit = js.native
  
  def hasChanges(scope: String): Boolean = js.native
  
  def rollback(scope: String): Unit = js.native
}
