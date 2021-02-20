package typings.ionicCliFramework

import typings.stringWidth.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("@ionic/cli-framework/utils/format", "TTY_WIDTH")
  @js.native
  val TTY_WIDTH: Double = js.native
  
  @JSImport("@ionic/cli-framework/utils/format", "columnar")
  @js.native
  def columnar(rows: js.Array[js.Array[String]], hasHsepVsepHeaders: ColumnarOptions): String = js.native
  
  @JSImport("@ionic/cli-framework/utils/format", "expandPath")
  @js.native
  def expandPath(p: String): String = js.native
  
  @JSImport("@ionic/cli-framework/utils/format", "generateFillSpaceStringList")
  @js.native
  def generateFillSpaceStringList(list: js.Array[String]): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework/utils/format", "generateFillSpaceStringList")
  @js.native
  def generateFillSpaceStringList(list: js.Array[String], optimalLength: js.UndefOr[scala.Nothing], fillCharacter: String): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework/utils/format", "generateFillSpaceStringList")
  @js.native
  def generateFillSpaceStringList(list: js.Array[String], optimalLength: Double): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework/utils/format", "generateFillSpaceStringList")
  @js.native
  def generateFillSpaceStringList(list: js.Array[String], optimalLength: Double, fillCharacter: String): js.Array[String] = js.native
  
  @JSImport("@ionic/cli-framework/utils/format", "indent")
  @js.native
  def indent(): String = js.native
  @JSImport("@ionic/cli-framework/utils/format", "indent")
  @js.native
  def indent(n: Double): String = js.native
  
  @JSImport("@ionic/cli-framework/utils/format", "prettyPath")
  @js.native
  def prettyPath(p: String): String = js.native
  
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
    @JSImport("@ionic/cli-framework/utils/format", "stringWidth.<apply>")
    @js.native
    def apply(string: String): Double = js.native
    
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
    @JSImport("@ionic/cli-framework/utils/format", "stringWidth.default")
    @js.native
    def default(string: String): Double = js.native
    @scala.inline
    def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ionic/cli-framework/utils/format", "stripAnsi")
  @js.native
  def stripAnsi(string: String): String = js.native
  
  @JSImport("@ionic/cli-framework/utils/format", "wordWrap")
  @js.native
  def wordWrap(msg: String, hasWidthIndentationAppend: WordWrapOptions): String = js.native
  
  @js.native
  trait ColumnarOptions extends StObject {
    
    var headers: js.UndefOr[js.Array[String]] = js.native
    
    var hsep: js.UndefOr[String] = js.native
    
    var vsep: js.UndefOr[String] = js.native
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
  
  @js.native
  trait WordWrapOptions extends StObject {
    
    var append: js.UndefOr[String] = js.native
    
    var indentation: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
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
