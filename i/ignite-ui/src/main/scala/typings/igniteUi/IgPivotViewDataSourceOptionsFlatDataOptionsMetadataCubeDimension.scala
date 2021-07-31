package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension
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
  var hierarchies: js.UndefOr[
    js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie]
  ] = js.undefined
  
  /**
    * Optional="false" A unique name for the dimension.
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension {
  
  @scala.inline
  def apply(): IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension]
  }
  
  @scala.inline
  implicit class IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimensionMutableBuilder[Self <: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setHierarchies(value: js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie]): Self = StObject.set(x, "hierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchiesUndefined: Self = StObject.set(x, "hierarchies", js.undefined)
    
    @scala.inline
    def setHierarchiesVarargs(value: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie*): Self = StObject.set(x, "hierarchies", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
