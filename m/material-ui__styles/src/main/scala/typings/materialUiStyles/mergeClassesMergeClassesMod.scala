package typings.materialUiStyles

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeClassesMergeClassesMod {
  
  @JSImport("@material-ui/styles/mergeClasses/mergeClasses", JSImport.Default)
  @js.native
  def default(): Classes = js.native
  @JSImport("@material-ui/styles/mergeClasses/mergeClasses", JSImport.Default)
  @js.native
  def default(options: MergeClassesOption): Classes = js.native
  
  type Classes = StringDictionary[String]
  
  @js.native
  trait MergeClassesOption extends StObject {
    
    var Component: ElementType[_] = js.native
    
    var baseClasses: Classes = js.native
    
    var newClasses: Classes = js.native
  }
  object MergeClassesOption {
    
    @scala.inline
    def apply(Component: ElementType[_], baseClasses: Classes, newClasses: Classes): MergeClassesOption = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], baseClasses = baseClasses.asInstanceOf[js.Any], newClasses = newClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeClassesOption]
    }
    
    @scala.inline
    implicit class MergeClassesOptionMutableBuilder[Self <: MergeClassesOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseClasses(value: Classes): Self = StObject.set(x, "baseClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: ElementType[_]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewClasses(value: Classes): Self = StObject.set(x, "newClasses", value.asInstanceOf[js.Any])
    }
  }
}
