package typings.markdownIt

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libHelpersParseLinkDestinationMod.ParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersMod extends Shortcut {
  
  @JSImport("markdown-it/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : Helpers = js.native
  
  trait Helpers extends StObject {
    
    def parseLinkDestination(str: String, pos: Double, max: Double): ParseResult
    @JSName("parseLinkDestination")
    var parseLinkDestination_Original: js.Function3[/* str */ String, /* pos */ Double, /* max */ Double, ParseResult]
    
    def parseLinkLabel(state: typings.markdownIt.libRulesInlineStateInlineMod.^, start: Double): Double
    def parseLinkLabel(state: typings.markdownIt.libRulesInlineStateInlineMod.^, start: Double, disableNested: Boolean): Double
    @JSName("parseLinkLabel")
    var parseLinkLabel_Original: js.Function3[
        /* state */ typings.markdownIt.libRulesInlineStateInlineMod.^, 
        /* start */ Double, 
        /* disableNested */ js.UndefOr[Boolean], 
        Double
      ]
    
    def parseLinkTitle(str: String, pos: Double, max: Double): ParseResult
    @JSName("parseLinkTitle")
    var parseLinkTitle_Original: js.Function3[/* str */ String, /* pos */ Double, /* max */ Double, ParseResult]
  }
  object Helpers {
    
    inline def apply(
      parseLinkDestination: (/* str */ String, /* pos */ Double, /* max */ Double) => ParseResult,
      parseLinkLabel: (/* state */ typings.markdownIt.libRulesInlineStateInlineMod.^, /* start */ Double, /* disableNested */ js.UndefOr[Boolean]) => Double,
      parseLinkTitle: (/* str */ String, /* pos */ Double, /* max */ Double) => ParseResult
    ): Helpers = {
      val __obj = js.Dynamic.literal(parseLinkDestination = js.Any.fromFunction3(parseLinkDestination), parseLinkLabel = js.Any.fromFunction3(parseLinkLabel), parseLinkTitle = js.Any.fromFunction3(parseLinkTitle))
      __obj.asInstanceOf[Helpers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Helpers] (val x: Self) extends AnyVal {
      
      inline def setParseLinkDestination(value: (/* str */ String, /* pos */ Double, /* max */ Double) => ParseResult): Self = StObject.set(x, "parseLinkDestination", js.Any.fromFunction3(value))
      
      inline def setParseLinkLabel(
        value: (/* state */ typings.markdownIt.libRulesInlineStateInlineMod.^, /* start */ Double, /* disableNested */ js.UndefOr[Boolean]) => Double
      ): Self = StObject.set(x, "parseLinkLabel", js.Any.fromFunction3(value))
      
      inline def setParseLinkTitle(value: (/* str */ String, /* pos */ Double, /* max */ Double) => ParseResult): Self = StObject.set(x, "parseLinkTitle", js.Any.fromFunction3(value))
    }
  }
  
  type _To = Helpers
  
  /* This means you don't have to write `^`, but can instead just say `libHelpersMod.foo` */
  override def _to: Helpers = ^
}
