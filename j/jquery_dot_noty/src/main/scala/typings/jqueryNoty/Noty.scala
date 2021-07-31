package typings.jqueryNoty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Noty extends StObject {
  
  def apply(notyOptions: NotyOptions): js.Any = js.native
  
  def close(): js.Any = js.native
  
  var closed: Boolean = js.native
  
  def setText(text: String): js.Any = js.native
  
  def setTimeout(timeout: Double): js.Any = js.native
  
  def setType(`type`: String): js.Any = js.native
  
  def show(): js.Any = js.native
  
  var shown: Boolean = js.native
}
