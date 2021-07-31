package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getComponentFilesMod {
  
  @scala.inline
  def apply(filename: String): ComponentFiles | Null = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[ComponentFiles | Null]
  
  @JSImport("marko/src/components/taglib/TransformHelper/getComponentFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ComponentFiles extends StObject {
    
    @JSName("package")
    var _package: String | Null
    
    var browserFile: String | Null
    
    var file: String | Null
    
    var styles: js.Array[String]
  }
  object ComponentFiles {
    
    @scala.inline
    def apply(styles: js.Array[String]): ComponentFiles = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any], browserFile = null, file = null)
      __obj.updateDynamic("package")(null)
      __obj.asInstanceOf[ComponentFiles]
    }
    
    @scala.inline
    implicit class ComponentFilesMutableBuilder[Self <: ComponentFiles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserFile(value: String): Self = StObject.set(x, "browserFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserFileNull: Self = StObject.set(x, "browserFile", null)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNull: Self = StObject.set(x, "file", null)
      
      @scala.inline
      def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_packageNull: Self = StObject.set(x, "package", null)
    }
  }
}
