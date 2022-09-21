package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model
  extends StObject
     with ObservableObject {
  
  var _defaultId: Any = js.native
  
  def accept(): Unit = js.native
  def accept(data: Any): Unit = js.native
  
  var defaults: StringDictionary[Any] = js.native
  
  var dirty: Boolean = js.native
  
  var dirtyFields: js.Array[Any] = js.native
  
  def editable(field: String): Boolean = js.native
  
  var fields: DataSourceSchemaModelFields = js.native
  
  var id: Any = js.native
  
  var idField: String = js.native
  
  def isNew(): Boolean = js.native
}
