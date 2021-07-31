package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadata
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" Metadata used for the creation of the cube.
    */
  var cube: js.UndefOr[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube] = js.undefined
}
object IgPivotGridDataSourceOptionsFlatDataOptionsMetadata {
  
  @scala.inline
  def apply(): IgPivotGridDataSourceOptionsFlatDataOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadata]
  }
  
  @scala.inline
  implicit class IgPivotGridDataSourceOptionsFlatDataOptionsMetadataMutableBuilder[Self <: IgPivotGridDataSourceOptionsFlatDataOptionsMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCube(value: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
  }
}
