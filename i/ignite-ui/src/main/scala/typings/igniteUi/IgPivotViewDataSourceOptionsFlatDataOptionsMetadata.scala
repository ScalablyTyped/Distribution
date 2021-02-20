package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadata
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" Metadata used for the creation of the cube.
    */
  var cube: js.UndefOr[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube] = js.native
}
object IgPivotViewDataSourceOptionsFlatDataOptionsMetadata {
  
  @scala.inline
  def apply(): IgPivotViewDataSourceOptionsFlatDataOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadata]
  }
  
  @scala.inline
  implicit class IgPivotViewDataSourceOptionsFlatDataOptionsMetadataMutableBuilder[Self <: IgPivotViewDataSourceOptionsFlatDataOptionsMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCube(value: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
  }
}
