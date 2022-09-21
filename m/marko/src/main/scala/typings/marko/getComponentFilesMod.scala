package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getComponentFilesMod {
  
  inline def apply(filename: String): ComponentFiles | Null = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[ComponentFiles | Null]
  
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
    
    inline def apply(styles: js.Array[String]): ComponentFiles = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any], browserFile = null, file = null)
      __obj.updateDynamic("package")(null)
      __obj.asInstanceOf[ComponentFiles]
    }
    
    extension [Self <: ComponentFiles](x: Self) {
      
      inline def setBrowserFile(value: String): Self = StObject.set(x, "browserFile", value.asInstanceOf[js.Any])
      
      inline def setBrowserFileNull: Self = StObject.set(x, "browserFile", null)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileNull: Self = StObject.set(x, "file", null)
      
      inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageNull: Self = StObject.set(x, "package", null)
    }
  }
}
