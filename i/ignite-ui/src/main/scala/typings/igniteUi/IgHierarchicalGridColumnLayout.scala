package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgHierarchicalGridColumnLayout
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies the foreignKey of the columnLayout. This is also the column key of the parent grid.
    */
  var foreignKey: js.UndefOr[String] = js.native
  
  /**
    * Specifies the columnLayout key. This is the property that holds the data records for the current column layout.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Specifies the primaryKey of the columnLayout. This also serves as the column key for the current column layout.
    */
  var primaryKey: js.UndefOr[String] = js.native
}
object IgHierarchicalGridColumnLayout {
  
  @scala.inline
  def apply(): IgHierarchicalGridColumnLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGridColumnLayout]
  }
  
  @scala.inline
  implicit class IgHierarchicalGridColumnLayoutOps[Self <: IgHierarchicalGridColumnLayout] (val x: Self) extends AnyVal {
    
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
    def setForeignKey(value: String): Self = this.set("foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKey: Self = this.set("foreignKey", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
  }
}
