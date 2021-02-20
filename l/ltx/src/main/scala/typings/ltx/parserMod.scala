package typings.ltx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.ltx.elementMod.Element
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("ltx/lib/Parser", "Parser")
  @js.native
  class Parser () extends EventEmitter {
    def this(options: ParserOptions) = this()
    
    def end(data: String): Unit = js.native
    
    def write(data: String): Unit = js.native
  }
  
  @js.native
  trait ParserOptions extends StObject {
    
    var Element: js.UndefOr[
        Instantiable2[
          /* name */ String, 
          /* attrs */ js.UndefOr[String | StringDictionary[js.Any]], 
          typings.ltx.elementMod.Element
        ]
      ] = js.native
    
    var Parser: js.UndefOr[
        Instantiable1[/* options */ js.UndefOr[ParserOptions], typings.ltx.parserMod.Parser]
      ] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(
        value: Instantiable2[
              /* name */ String, 
              /* attrs */ js.UndefOr[String | StringDictionary[js.Any]], 
              Element
            ]
      ): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "Element", js.undefined)
      
      @scala.inline
      def setParser(value: Instantiable1[/* options */ js.UndefOr[ParserOptions], Parser]): Self = StObject.set(x, "Parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "Parser", js.undefined)
    }
  }
}
