package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension
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
    js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie]
  ] = js.undefined
  
  /**
    * Optional="false" A unique name for the dimension.
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension {
  
  @scala.inline
  def apply(): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension]
  }
  
  @scala.inline
  implicit class IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionMutableBuilder[Self <: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setHierarchies(value: js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie]): Self = StObject.set(x, "hierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchiesUndefined: Self = StObject.set(x, "hierarchies", js.undefined)
    
    @scala.inline
    def setHierarchiesVarargs(value: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie*): Self = StObject.set(x, "hierarchies", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
