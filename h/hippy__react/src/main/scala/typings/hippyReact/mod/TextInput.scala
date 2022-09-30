package typings.hippyReact.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInput
  extends Component[TextInputProps, js.Object, Any] {
  
  def blur(): Unit = js.native
  
  def clear(): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getValue(): js.Promise[String] = js.native
  
  def hideInputMethod(): Unit = js.native
  
  def setValue(value: String): Unit = js.native
}
