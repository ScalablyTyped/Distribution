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
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" Metadata used for the creation of the cube.
    */
  var cube: js.UndefOr[OlapFlatDataSourceOptionsMetadataCube] = js.undefined
}
object OlapFlatDataSourceOptionsMetadata {
  
  @scala.inline
  def apply(): OlapFlatDataSourceOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadata]
  }
  
  @scala.inline
  implicit class OlapFlatDataSourceOptionsMetadataMutableBuilder[Self <: OlapFlatDataSourceOptionsMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCube(value: OlapFlatDataSourceOptionsMetadataCube): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
  }
}
