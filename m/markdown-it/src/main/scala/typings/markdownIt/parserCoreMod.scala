package typings.markdownIt

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserCoreMod {
  
  @JSImport("markdown-it/lib/parser_core", JSImport.Namespace)
  @js.native
  class ^ () extends Core
  
  @js.native
  trait Core extends StObject {
    
    var State: Instantiable3[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ js.Any, 
        typings.markdownIt.stateCoreMod.^
      ] = js.native
    
    /**
      * Executes core chain rules.
      */
    def process(state: typings.markdownIt.stateCoreMod.^): Unit = js.native
    
    var ruler: typings.markdownIt.rulerMod.^[RuleCore] = js.native
  }
  object Core {
    
    @scala.inline
    def apply(
      State: Instantiable3[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ js.Any, 
          typings.markdownIt.stateCoreMod.^
        ],
      process: typings.markdownIt.stateCoreMod.^ => Unit,
      ruler: typings.markdownIt.rulerMod.^[RuleCore]
    ): Core = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), ruler = ruler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Core]
    }
    
    @scala.inline
    implicit class CoreMutableBuilder[Self <: Core] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcess(value: typings.markdownIt.stateCoreMod.^ => Unit): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRuler(value: typings.markdownIt.rulerMod.^[RuleCore]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(
        value: Instantiable3[
              /* src */ String, 
              /* md */ MarkdownIt, 
              /* env */ js.Any, 
              typings.markdownIt.stateCoreMod.^
            ]
      ): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    }
  }
  
  type RuleCore = js.Function1[/* state */ typings.markdownIt.stateCoreMod.^, Boolean]
}
