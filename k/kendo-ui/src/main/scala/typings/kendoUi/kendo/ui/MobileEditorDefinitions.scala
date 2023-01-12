package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileEditorDefinitions extends StObject {
  
  def boolean(container: String, options: EditorDefinitionOptions): Unit
  def boolean(container: JQuery, options: EditorDefinitionOptions): Unit
  def boolean(container: Element, options: EditorDefinitionOptions): Unit
  @JSName("boolean")
  var boolean_Original: EditorDefinition
  
  def date(container: String, options: EditorDefinitionOptions): Unit
  def date(container: JQuery, options: EditorDefinitionOptions): Unit
  def date(container: Element, options: EditorDefinitionOptions): Unit
  @JSName("date")
  var date_Original: EditorDefinition
  
  def number(container: String, options: EditorDefinitionOptions): Unit
  def number(container: JQuery, options: EditorDefinitionOptions): Unit
  def number(container: Element, options: EditorDefinitionOptions): Unit
  @JSName("number")
  var number_Original: EditorDefinition
  
  def string(container: String, options: EditorDefinitionOptions): Unit
  def string(container: JQuery, options: EditorDefinitionOptions): Unit
  def string(container: Element, options: EditorDefinitionOptions): Unit
  @JSName("string")
  var string_Original: EditorDefinition
  
  def values(container: String, options: EditorDefinitionOptions): Unit
  def values(container: JQuery, options: EditorDefinitionOptions): Unit
  def values(container: Element, options: EditorDefinitionOptions): Unit
  @JSName("values")
  var values_Original: EditorDefinition
}
object MobileEditorDefinitions {
  
  inline def apply(
    boolean: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Unit,
    date: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Unit,
    number: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Unit,
    string: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Unit,
    values: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Unit
  ): MobileEditorDefinitions = {
    val __obj = js.Dynamic.literal(boolean = js.Any.fromFunction2(boolean), date = js.Any.fromFunction2(date), number = js.Any.fromFunction2(number), string = js.Any.fromFunction2(string), values = js.Any.fromFunction2(values))
    __obj.asInstanceOf[MobileEditorDefinitions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileEditorDefinitions] (val x: Self) extends AnyVal {
    
    inline def setBoolean(value: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Unit): Self = StObject.set(x, "boolean", js.Any.fromFunction2(value))
    
    inline def setDate(value: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Unit): Self = StObject.set(x, "date", js.Any.fromFunction2(value))
    
    inline def setNumber(value: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Unit): Self = StObject.set(x, "number", js.Any.fromFunction2(value))
    
    inline def setString(value: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Unit): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
    
    inline def setValues(value: (/* container */ JQuery | Element | String, /* options */ EditorDefinitionOptions) => Unit): Self = StObject.set(x, "values", js.Any.fromFunction2(value))
  }
}
