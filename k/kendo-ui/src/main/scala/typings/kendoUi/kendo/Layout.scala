package typings.kendoUi.kendo

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout extends View {
  
  var containers: StringDictionary[ViewContainer] = js.native
  
  def showIn(selector: String, view: View): Unit = js.native
  def showIn(selector: String, view: View, transitionClass: String): Unit = js.native
}
