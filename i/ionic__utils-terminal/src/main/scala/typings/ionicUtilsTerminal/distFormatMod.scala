package typings.ionicUtilsTerminal

import typings.stringWidth.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormatMod {
  
  @JSImport("@ionic/utils-terminal/dist/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/utils-terminal/dist/format", "TTY_WIDTH")
  @js.native
  val TTY_WIDTH: Double = js.native
  
  inline def columnar(rows: js.Array[js.Array[String]], hasHsepVsepHeaders: ColumnarOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("columnar")(rows.asInstanceOf[js.Any], hasHsepVsepHeaders.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def expandPath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateFillSpaceStringList(list: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def generateFillSpaceStringList(list: js.Array[String], optimalLength: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any], optimalLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def generateFillSpaceStringList(list: js.Array[String], optimalLength: Double, fillCharacter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any], optimalLength.asInstanceOf[js.Any], fillCharacter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def generateFillSpaceStringList(list: js.Array[String], optimalLength: Unit, fillCharacter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any], optimalLength.asInstanceOf[js.Any], fillCharacter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def indent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")().asInstanceOf[String]
  inline def indent(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def prettyPath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object sliceAnsi {
    
    @JSImport("@ionic/utils-terminal/dist/format", "sliceAnsi")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(input: String, beginSlice: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], beginSlice.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def default(input: String, beginSlice: Double, endSlice: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], beginSlice.asInstanceOf[js.Any], endSlice.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object stringWidth {
    
    @JSImport("@ionic/utils-terminal/dist/format", "stringWidth")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def default(string: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object stripAnsi {
    
    @JSImport("@ionic/utils-terminal/dist/format", "stripAnsi")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def wordWrap(msg: String, hasWidthIndentationAppend: WordWrapOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(msg.asInstanceOf[js.Any], hasWidthIndentationAppend.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ColumnarOptions extends StObject {
    
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    var hsep: js.UndefOr[String] = js.undefined
    
    var vsep: js.UndefOr[String] = js.undefined
  }
  object ColumnarOptions {
    
    inline def apply(): ColumnarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnarOptions]
    }
    
    extension [Self <: ColumnarOptions](x: Self) {
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setHsep(value: String): Self = StObject.set(x, "hsep", value.asInstanceOf[js.Any])
      
      inline def setHsepUndefined: Self = StObject.set(x, "hsep", js.undefined)
      
      inline def setVsep(value: String): Self = StObject.set(x, "vsep", value.asInstanceOf[js.Any])
      
      inline def setVsepUndefined: Self = StObject.set(x, "vsep", js.undefined)
    }
  }
  
  trait WordWrapOptions extends StObject {
    
    var append: js.UndefOr[String] = js.undefined
    
    var indentation: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object WordWrapOptions {
    
    inline def apply(): WordWrapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WordWrapOptions]
    }
    
    extension [Self <: WordWrapOptions](x: Self) {
      
      inline def setAppend(value: String): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      inline def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
