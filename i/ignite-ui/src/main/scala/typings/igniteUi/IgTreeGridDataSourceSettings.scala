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
/* optionName */ StringDictionary[Any] {
  
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
  var propertyDataLevel: js.UndefOr[Any] = js.undefined
  
  /**
    * *** IMPORTANT DEPRECATED *** Use the expandedKey option instead.
    * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
    *
    */
  var propertyExpanded: js.UndefOr[Any] = js.undefined
}
object IgTreeGridDataSourceSettings {
  
  inline def apply(): IgTreeGridDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridDataSourceSettings]
  }
  
  extension [Self <: IgTreeGridDataSourceSettings](x: Self) {
    
    inline def setDataLevelKey(value: String): Self = StObject.set(x, "dataLevelKey", value.asInstanceOf[js.Any])
    
    inline def setDataLevelKeyUndefined: Self = StObject.set(x, "dataLevelKey", js.undefined)
    
    inline def setExpandedKey(value: String): Self = StObject.set(x, "expandedKey", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeyUndefined: Self = StObject.set(x, "expandedKey", js.undefined)
    
    inline def setInitialFlatDataView(value: Boolean): Self = StObject.set(x, "initialFlatDataView", value.asInstanceOf[js.Any])
    
    inline def setInitialFlatDataViewUndefined: Self = StObject.set(x, "initialFlatDataView", js.undefined)
    
    inline def setPropertyDataLevel(value: Any): Self = StObject.set(x, "propertyDataLevel", value.asInstanceOf[js.Any])
    
    inline def setPropertyDataLevelUndefined: Self = StObject.set(x, "propertyDataLevel", js.undefined)
    
    inline def setPropertyExpanded(value: Any): Self = StObject.set(x, "propertyExpanded", value.asInstanceOf[js.Any])
    
    inline def setPropertyExpandedUndefined: Self = StObject.set(x, "propertyExpanded", js.undefined)
  }
}
