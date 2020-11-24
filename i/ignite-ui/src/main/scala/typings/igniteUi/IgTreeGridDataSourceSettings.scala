package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
    *
    */
  var dataLevelKey: js.UndefOr[String] = js.native
  
  /**
    * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
    *
    */
  var expandedKey: js.UndefOr[String] = js.native
  
  /**
    * If set to TRUE it is expected that the source of data is normalized and transformed(has set dataLevel and expansion state). The source of data is used as flatDataView. Usually used when the paging is remote and paging mode is allLevels, or features are remote(and the processing of the returned result should be made on the server)
    *
    */
  var initialFlatDataView: js.UndefOr[Boolean] = js.native
  
  /**
    * *** IMPORTANT DEPRECATED *** Use the dataLevelKey option instead.
    * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
    *
    */
  var propertyDataLevel: js.UndefOr[js.Any] = js.native
  
  /**
    * *** IMPORTANT DEPRECATED *** Use the expandedKey option instead.
    * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
    *
    */
  var propertyExpanded: js.UndefOr[js.Any] = js.native
}
object IgTreeGridDataSourceSettings {
  
  @scala.inline
  def apply(): IgTreeGridDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridDataSourceSettings]
  }
  
  @scala.inline
  implicit class IgTreeGridDataSourceSettingsOps[Self <: IgTreeGridDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataLevelKey(value: String): Self = this.set("dataLevelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLevelKey: Self = this.set("dataLevelKey", js.undefined)
    
    @scala.inline
    def setExpandedKey(value: String): Self = this.set("expandedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedKey: Self = this.set("expandedKey", js.undefined)
    
    @scala.inline
    def setInitialFlatDataView(value: Boolean): Self = this.set("initialFlatDataView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFlatDataView: Self = this.set("initialFlatDataView", js.undefined)
    
    @scala.inline
    def setPropertyDataLevel(value: js.Any): Self = this.set("propertyDataLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyDataLevel: Self = this.set("propertyDataLevel", js.undefined)
    
    @scala.inline
    def setPropertyExpanded(value: js.Any): Self = this.set("propertyExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyExpanded: Self = this.set("propertyExpanded", js.undefined)
  }
}
