package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapFlatDataSourceOptionsMetadataCubeDimension
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A caption for the dimension.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * An array of hierarchy metadata objects.
    */
  var hierarchies: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie]] = js.undefined
  
  /**
    * Optional="false" A unique name for the dimension.
    */
  var name: js.UndefOr[String] = js.undefined
}
object OlapFlatDataSourceOptionsMetadataCubeDimension {
  
  @scala.inline
  def apply(): OlapFlatDataSourceOptionsMetadataCubeDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeDimension]
  }
  
  @scala.inline
  implicit class OlapFlatDataSourceOptionsMetadataCubeDimensionMutableBuilder[Self <: OlapFlatDataSourceOptionsMetadataCubeDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setHierarchies(value: js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie]): Self = StObject.set(x, "hierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchiesUndefined: Self = StObject.set(x, "hierarchies", js.undefined)
    
    @scala.inline
    def setHierarchiesVarargs(value: OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie*): Self = StObject.set(x, "hierarchies", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
