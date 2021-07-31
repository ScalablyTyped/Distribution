package typings.knockout.mod

import typings.knockout.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSource extends StObject {
  
  def data(key: String): js.Any = js.native
  def data[T](key: String, valueToWrite: T): Unit = js.native
  @JSName("data")
  def data_T_T[T](key: String): T = js.native
  
  var nodes: js.UndefOr[FnCall] = js.native
  
  def text(): String = js.native
  def text(valueToWrite: String): Unit = js.native
}
