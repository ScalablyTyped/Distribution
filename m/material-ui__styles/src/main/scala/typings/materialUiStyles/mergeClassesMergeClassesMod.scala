package typings.materialUiStyles

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeClassesMergeClassesMod {
  
  @JSImport("@material-ui/styles/mergeClasses/mergeClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Classes]
  @scala.inline
  def default(options: MergeClassesOption): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Classes]
  
  type Classes = StringDictionary[String]
  
  trait MergeClassesOption extends StObject {
    
    var Component: ElementType[js.Any]
    
    var baseClasses: Classes
    
    var newClasses: Classes
  }
  object MergeClassesOption {
    
    @scala.inline
    def apply(Component: ElementType[js.Any], baseClasses: Classes, newClasses: Classes): MergeClassesOption = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], baseClasses = baseClasses.asInstanceOf[js.Any], newClasses = newClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeClassesOption]
    }
    
    @scala.inline
    implicit class MergeClassesOptionMutableBuilder[Self <: MergeClassesOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseClasses(value: Classes): Self = StObject.set(x, "baseClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: ElementType[js.Any]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewClasses(value: Classes): Self = StObject.set(x, "newClasses", value.asInstanceOf[js.Any])
    }
  }
}
