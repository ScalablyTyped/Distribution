package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgComboGrouping
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies the sort order - ascending or descending.
    *
    *
    * Valid values:
    * "asc"
    * "desc"
    */
  var dir: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets name of column by which the records will be grouped. Setting this option enables the grouping.
    *
    */
  var key: js.UndefOr[String] = js.undefined
}
object IgComboGrouping {
  
  @scala.inline
  def apply(): IgComboGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboGrouping]
  }
  
  @scala.inline
  implicit class IgComboGroupingMutableBuilder[Self <: IgComboGrouping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
