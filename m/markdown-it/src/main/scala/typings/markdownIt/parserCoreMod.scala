package typings.markdownIt

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserCoreMod {
  
  @JSImport("markdown-it/lib/parser_core", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Core {
    
    /* CompleteClass */
    var State: Instantiable3[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ Any, 
        typings.markdownIt.stateCoreMod.^
      ] = js.native
    
    /**
      * Executes core chain rules.
      */
    /* CompleteClass */
    override def process(state: typings.markdownIt.stateCoreMod.^): Unit = js.native
    
    /* CompleteClass */
    var ruler: typings.markdownIt.rulerMod.^[RuleCore] = js.native
  }
  
  trait Core extends StObject {
    
    var State: Instantiable3[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ Any, 
        typings.markdownIt.stateCoreMod.^
      ]
    
    /**
      * Executes core chain rules.
      */
    def process(state: typings.markdownIt.stateCoreMod.^): Unit
    
    var ruler: typings.markdownIt.rulerMod.^[RuleCore]
  }
  object Core {
    
    inline def apply(
      State: Instantiable3[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ Any, 
          typings.markdownIt.stateCoreMod.^
        ],
      process: typings.markdownIt.stateCoreMod.^ => Unit,
      ruler: typings.markdownIt.rulerMod.^[RuleCore]
    ): Core = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), ruler = ruler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Core]
    }
    
    extension [Self <: Core](x: Self) {
      
      inline def setProcess(value: typings.markdownIt.stateCoreMod.^ => Unit): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def setRuler(value: typings.markdownIt.rulerMod.^[RuleCore]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
      
      inline def setState(
        value: Instantiable3[
              /* src */ String, 
              /* md */ MarkdownIt, 
              /* env */ Any, 
              typings.markdownIt.stateCoreMod.^
            ]
      ): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    }
  }
  
  type RuleCore = js.Function1[/* state */ typings.markdownIt.stateCoreMod.^, Unit]
}
