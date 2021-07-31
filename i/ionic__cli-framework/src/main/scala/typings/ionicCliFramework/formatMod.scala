package typings.ionicCliFramework

import typings.stringWidth.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("@ionic/cli-framework/utils/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/cli-framework/utils/format", "TTY_WIDTH")
  @js.native
  val TTY_WIDTH: Double = js.native
  
  @scala.inline
  def columnar(rows: js.Array[js.Array[String]], hasHsepVsepHeaders: ColumnarOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("columnar")(rows.asInstanceOf[js.Any], hasHsepVsepHeaders.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def expandPath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def generateFillSpaceStringList(list: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def generateFillSpaceStringList(list: js.Array[String], optimalLength: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any], optimalLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def generateFillSpaceStringList(list: js.Array[String], optimalLength: Double, fillCharacter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any], optimalLength.asInstanceOf[js.Any], fillCharacter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def generateFillSpaceStringList(list: js.Array[String], optimalLength: Unit, fillCharacter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any], optimalLength.asInstanceOf[js.Any], fillCharacter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def indent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")().asInstanceOf[String]
  @scala.inline
  def indent(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def prettyPath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object stringWidth {
    
    /**
    	Get the visual width of a string - the number of columns required to display it.
    	Some Unicode characters are [fullwidth](https://en.wikipedia.org/wiki/Halfwidth_and_fullwidth_forms) and use double the normal width. [ANSI escape codes](https://en.wikipedia.org/wiki/ANSI_escape_code) are stripped and doesn't affect the width.
    	@example
    	```
    	import stringWidth = require('string-width');
    	stringWidth('a');
    	//=> 1
    	stringWidth('古');
    	//=> 2
    	stringWidth('\\u001B[1m古\\u001B[22m');
    	//=> 2
    	```
    	*/
    @scala.inline
    def apply(string: String): Double = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("@ionic/cli-framework/utils/format", "stringWidth")
    @js.native
    val ^ : js.Any = js.native
    
    // TODO: remove this in the next major version, refactor the whole definition to:
    // declare function stringWidth(string: string): number;
    // export = stringWidth;
    @JSImport("@ionic/cli-framework/utils/format", "stringWidth.default")
    @js.native
    def default: Call = js.native
    /**
    	Get the visual width of a string - the number of columns required to display it.
    	Some Unicode characters are [fullwidth](https://en.wikipedia.org/wiki/Halfwidth_and_fullwidth_forms) and use double the normal width. [ANSI escape codes](https://en.wikipedia.org/wiki/ANSI_escape_code) are stripped and doesn't affect the width.
    	@example
    	```
    	import stringWidth = require('string-width');
    	stringWidth('a');
    	//=> 1
    	stringWidth('古');
    	//=> 2
    	stringWidth('\\u001B[1m古\\u001B[22m');
    	//=> 2
    	```
    	*/
    // TODO: remove this in the next major version, refactor the whole definition to:
    // declare function stringWidth(string: string): number;
    // export = stringWidth;
    @scala.inline
    def default(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def stripAnsi(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripAnsi")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def wordWrap(msg: String, hasWidthIndentationAppend: WordWrapOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(msg.asInstanceOf[js.Any], hasWidthIndentationAppend.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ColumnarOptions extends StObject {
    
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    var hsep: js.UndefOr[String] = js.undefined
    
    var vsep: js.UndefOr[String] = js.undefined
  }
  object ColumnarOptions {
    
    @scala.inline
    def apply(): ColumnarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnarOptions]
    }
    
    @scala.inline
    implicit class ColumnarOptionsMutableBuilder[Self <: ColumnarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setHsep(value: String): Self = StObject.set(x, "hsep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsepUndefined: Self = StObject.set(x, "hsep", js.undefined)
      
      @scala.inline
      def setVsep(value: String): Self = StObject.set(x, "vsep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVsepUndefined: Self = StObject.set(x, "vsep", js.undefined)
    }
  }
  
  trait WordWrapOptions extends StObject {
    
    var append: js.UndefOr[String] = js.undefined
    
    var indentation: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object WordWrapOptions {
    
    @scala.inline
    def apply(): WordWrapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WordWrapOptions]
    }
    
    @scala.inline
    implicit class WordWrapOptionsMutableBuilder[Self <: WordWrapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: String): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
