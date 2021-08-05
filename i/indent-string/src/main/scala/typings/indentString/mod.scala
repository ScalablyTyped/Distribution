package typings.indentString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Indent each line in a string.
  @param string - The string to indent.
  @param count - How many times you want `options.indent` repeated. Default: `1`.
  @example
  ```
  import indentString = require('indent-string');
  indentString('Unicorns\nRainbows', 4);
  //=> '    Unicorns\n    Rainbows'
  indentString('Unicorns\nRainbows', 4, {indent: '♥'});
  //=> '♥♥♥♥Unicorns\n♥♥♥♥Rainbows'
  ```
  */
  inline def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(string: String, count: Double): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(string: String, count: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(string: String, count: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("indent-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Also indent empty lines.
    		@default false
    		*/
    val includeEmptyLines: js.UndefOr[Boolean] = js.undefined
    
    /**
    		The string to use for the indent.
    		@default ' '
    		*/
    val indent: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncludeEmptyLines(value: Boolean): Self = StObject.set(x, "includeEmptyLines", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmptyLinesUndefined: Self = StObject.set(x, "includeEmptyLines", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
}
