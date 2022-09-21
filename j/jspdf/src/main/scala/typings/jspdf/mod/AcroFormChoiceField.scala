package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jspdf", "AcroFormChoiceField")
@js.native
open class AcroFormChoiceField () extends AcroFormField {
  
  def addOption(value: String): Unit = js.native
  
  var combo: Boolean = js.native
  
  var commitOnSelChange: Boolean = js.native
  
  var doNotSpellCheck: Boolean = js.native
  
  var edit: Boolean = js.native
  
  def getOptions(): js.Array[String] = js.native
  
  var multiSelect: Boolean = js.native
  
  def removeOption(value: String, allEntries: Boolean): Unit = js.native
  
  def setOptions(value: js.Array[String]): Unit = js.native
  
  var sort: Boolean = js.native
  
  var topIndex: Double = js.native
}
