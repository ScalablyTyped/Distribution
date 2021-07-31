package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridGroupByGroupedColumn
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * [column](ui.iggrid#options:columns) object for the column that is grouped
    *
    */
  var col: js.UndefOr[js.Any] = js.undefined
  
  /**
    * sort order - ascending or descending
    *
    */
  var dir: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Key of the column that's grouped
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Key of the columnLayout, if the grid is hierarchical
    *
    */
  var layout: js.UndefOr[String] = js.undefined
}
object IgGridGroupByGroupedColumn {
  
  @scala.inline
  def apply(): IgGridGroupByGroupedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupByGroupedColumn]
  }
  
  @scala.inline
  implicit class IgGridGroupByGroupedColumnMutableBuilder[Self <: IgGridGroupByGroupedColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: js.Any): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColUndefined: Self = StObject.set(x, "col", js.undefined)
    
    @scala.inline
    def setDir(value: js.Any): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
