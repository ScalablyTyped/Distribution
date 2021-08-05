package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension
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
    js.Array[
      IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie
    ]
  ] = js.undefined
  
  /**
    * Optional="false" A unique name for the dimension.
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension {
  
  inline def apply(): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension]
  }
  
  extension [Self <: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setHierarchies(
      value: js.Array[
          IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie
        ]
    ): Self = StObject.set(x, "hierarchies", value.asInstanceOf[js.Any])
    
    inline def setHierarchiesUndefined: Self = StObject.set(x, "hierarchies", js.undefined)
    
    inline def setHierarchiesVarargs(value: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie*): Self = StObject.set(x, "hierarchies", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
