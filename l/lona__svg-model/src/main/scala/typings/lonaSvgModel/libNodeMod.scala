package typings.lonaSvgModel

import typings.lonaSvgModel.libElementsMod.Path_
import typings.lonaSvgModel.libElementsMod.SVG_
import typings.lonaSvgModel.libSvgTypesMod.SVGRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodeMod {
  
  @JSImport("@lona/svg-model/lib/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignUniqueIds(converted: js.Array[ConvertedNode]): js.Array[ConvertedNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("assignUniqueIds")(converted.asInstanceOf[js.Any]).asInstanceOf[js.Array[ConvertedNode]]
  
  inline def convertRoot(root: SVGRoot): SVG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRoot")(root.asInstanceOf[js.Any]).asInstanceOf[SVG_]
  inline def convertRoot(root: SVGRoot, options: ConvertOptions): SVG_ = (^.asInstanceOf[js.Dynamic].applyDynamic("convertRoot")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SVG_]
  
  trait ConvertOptions extends StObject {
    
    var convertQuadraticsToCubics: js.UndefOr[Boolean] = js.undefined
  }
  object ConvertOptions {
    
    inline def apply(): ConvertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConvertOptions]
    }
    
    extension [Self <: ConvertOptions](x: Self) {
      
      inline def setConvertQuadraticsToCubics(value: Boolean): Self = StObject.set(x, "convertQuadraticsToCubics", value.asInstanceOf[js.Any])
      
      inline def setConvertQuadraticsToCubicsUndefined: Self = StObject.set(x, "convertQuadraticsToCubics", js.undefined)
    }
  }
  
  trait ConvertedNode extends StObject {
    
    var element: Path_
    
    var path: js.Array[String]
  }
  object ConvertedNode {
    
    inline def apply(element: Path_, path: js.Array[String]): ConvertedNode = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertedNode]
    }
    
    extension [Self <: ConvertedNode](x: Self) {
      
      inline def setElement(value: Path_): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
}
