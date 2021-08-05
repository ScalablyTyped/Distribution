package typings.levelSublevel

import org.scalablytyped.runtime.Shortcut
import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("level-sublevel", JSImport.Namespace)
  @js.native
  val ^ : Constructor = js.native
  
  trait Batch extends StObject {
    
    var prefix: js.UndefOr[Sublevel] = js.undefined
  }
  object Batch {
    
    inline def apply(): Batch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Batch]
    }
    
    extension [Self <: Batch](x: Self) {
      
      inline def setPrefix(value: Sublevel): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type Constructor = js.Function1[
    /* levelup */ LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]], 
    Sublevel
  ]
  
  type Hook = js.Function2[/* ch */ js.Any, /* add */ js.Function1[/* op */ Batch | Boolean, Unit], Unit]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify levelup.LevelUpBase<Batch> * / any */ trait Sublevel extends StObject {
    
    def pre(hook: Hook): js.Function
    
    def sublevel(key: String): Sublevel
  }
  object Sublevel {
    
    inline def apply(pre: Hook => js.Function, sublevel: String => Sublevel): Sublevel = {
      val __obj = js.Dynamic.literal(pre = js.Any.fromFunction1(pre), sublevel = js.Any.fromFunction1(sublevel))
      __obj.asInstanceOf[Sublevel]
    }
    
    extension [Self <: Sublevel](x: Self) {
      
      inline def setPre(value: Hook => js.Function): Self = StObject.set(x, "pre", js.Any.fromFunction1(value))
      
      inline def setSublevel(value: String => Sublevel): Self = StObject.set(x, "sublevel", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Constructor = ^
}
