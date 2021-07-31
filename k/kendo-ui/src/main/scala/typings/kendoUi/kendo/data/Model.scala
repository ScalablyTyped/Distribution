package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model
  extends StObject
     with ObservableObject {
  
  var _defaultId: js.Any = js.native
  
  def accept(): Unit = js.native
  def accept(data: js.Any): Unit = js.native
  
  var defaults: StringDictionary[js.Any] = js.native
  
  var dirty: Boolean = js.native
  
  def editable(field: String): Boolean = js.native
  
  var fields: DataSourceSchemaModelFields = js.native
  
  var id: js.Any = js.native
  
  var idField: String = js.native
  
  def isNew(): Boolean = js.native
}
