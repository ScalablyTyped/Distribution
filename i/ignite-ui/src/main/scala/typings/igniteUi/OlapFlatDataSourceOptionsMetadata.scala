package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapFlatDataSourceOptionsMetadata
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Optional="false" Metadata used for the creation of the cube.
    */
  var cube: js.UndefOr[OlapFlatDataSourceOptionsMetadataCube] = js.undefined
}
object OlapFlatDataSourceOptionsMetadata {
  
  inline def apply(): OlapFlatDataSourceOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadata]
  }
  
  extension [Self <: OlapFlatDataSourceOptionsMetadata](x: Self) {
    
    inline def setCube(value: OlapFlatDataSourceOptionsMetadataCube): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    inline def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
  }
}
