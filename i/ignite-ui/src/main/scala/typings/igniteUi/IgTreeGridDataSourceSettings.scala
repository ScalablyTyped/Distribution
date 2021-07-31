package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridDataSourceSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
    *
    */
  var dataLevelKey: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
    *
    */
  var expandedKey: js.UndefOr[String] = js.undefined
  
  /**
    * If set to TRUE it is expected that the source of data is normalized and transformed(has set dataLevel and expansion state). The source of data is used as flatDataView. Usually used when the paging is remote and paging mode is allLevels, or features are remote(and the processing of the returned result should be made on the server)
    *
    */
  var initialFlatDataView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *** IMPORTANT DEPRECATED *** Use the dataLevelKey option instead.
    * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
    *
    */
  var propertyDataLevel: js.UndefOr[js.Any] = js.undefined
  
  /**
    * *** IMPORTANT DEPRECATED *** Use the expandedKey option instead.
    * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
    *
    */
  var propertyExpanded: js.UndefOr[js.Any] = js.undefined
}
object IgTreeGridDataSourceSettings {
  
  @scala.inline
  def apply(): IgTreeGridDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridDataSourceSettings]
  }
  
  @scala.inline
  implicit class IgTreeGridDataSourceSettingsMutableBuilder[Self <: IgTreeGridDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataLevelKey(value: String): Self = StObject.set(x, "dataLevelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLevelKeyUndefined: Self = StObject.set(x, "dataLevelKey", js.undefined)
    
    @scala.inline
    def setExpandedKey(value: String): Self = StObject.set(x, "expandedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeyUndefined: Self = StObject.set(x, "expandedKey", js.undefined)
    
    @scala.inline
    def setInitialFlatDataView(value: Boolean): Self = StObject.set(x, "initialFlatDataView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialFlatDataViewUndefined: Self = StObject.set(x, "initialFlatDataView", js.undefined)
    
    @scala.inline
    def setPropertyDataLevel(value: js.Any): Self = StObject.set(x, "propertyDataLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDataLevelUndefined: Self = StObject.set(x, "propertyDataLevel", js.undefined)
    
    @scala.inline
    def setPropertyExpanded(value: js.Any): Self = StObject.set(x, "propertyExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyExpandedUndefined: Self = StObject.set(x, "propertyExpanded", js.undefined)
  }
}
