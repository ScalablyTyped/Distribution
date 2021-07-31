package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" Metadata used for the creation of the cube.
    */
  var cube: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube] = js.undefined
}
object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata {
  
  @scala.inline
  def apply(): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata]
  }
  
  @scala.inline
  implicit class IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataMutableBuilder[Self <: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCube(value: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
  }
}
