package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadata
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" Metadata used for the creation of the cube.
    */
  var cube: js.UndefOr[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube] = js.undefined
}
object IgPivotViewDataSourceOptionsFlatDataOptionsMetadata {
  
  inline def apply(): IgPivotViewDataSourceOptionsFlatDataOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadata]
  }
  
  extension [Self <: IgPivotViewDataSourceOptionsFlatDataOptionsMetadata](x: Self) {
    
    inline def setCube(value: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    inline def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
  }
}
