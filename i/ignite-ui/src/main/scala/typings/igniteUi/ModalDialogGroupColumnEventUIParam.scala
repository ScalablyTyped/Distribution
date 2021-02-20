package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalDialogGroupColumnEventUIParam extends StObject {
  
  /**
    * Gets a reference to the current groupedColumns.
    */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The key of the column to be grouped.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the current layout object, if any.
    */
  var layout: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ModalDialogGroupColumnEventUIParam {
  
  @scala.inline
  def apply(): ModalDialogGroupColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogGroupColumnEventUIParam]
  }
  
  @scala.inline
  implicit class ModalDialogGroupColumnEventUIParamMutableBuilder[Self <: ModalDialogGroupColumnEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupedColumns(value: js.Array[_]): Self = StObject.set(x, "groupedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedColumnsUndefined: Self = StObject.set(x, "groupedColumns", js.undefined)
    
    @scala.inline
    def setGroupedColumnsVarargs(value: js.Any*): Self = StObject.set(x, "groupedColumns", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
