package typings.lezerCommon

import typings.lezerCommon.anon.From
import typings.lezerCommon.distParseMod.Input
import typings.lezerCommon.distParseMod.ParseWrapper
import typings.lezerCommon.distParseMod.Parser
import typings.lezerCommon.distTreeMod.SyntaxNodeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMixMod {
  
  @JSImport("@lezer/common/dist/mix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseMixed(nest: js.Function2[/* node */ SyntaxNodeRef, /* input */ Input, NestedParse | Null]): ParseWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMixed")(nest.asInstanceOf[js.Any]).asInstanceOf[ParseWrapper]
  
  trait NestedParse extends StObject {
    
    var overlay: js.UndefOr[js.Array[From] | (js.Function1[/* node */ SyntaxNodeRef, From | Boolean])] = js.undefined
    
    var parser: Parser
  }
  object NestedParse {
    
    inline def apply(parser: Parser): NestedParse = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedParse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NestedParse] (val x: Self) extends AnyVal {
      
      inline def setOverlay(value: js.Array[From] | (js.Function1[/* node */ SyntaxNodeRef, From | Boolean])): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayFunction1(value: /* node */ SyntaxNodeRef => From | Boolean): Self = StObject.set(x, "overlay", js.Any.fromFunction1(value))
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setOverlayVarargs(value: From*): Self = StObject.set(x, "overlay", js.Array(value*))
      
      inline def setParser(value: Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    }
  }
}
