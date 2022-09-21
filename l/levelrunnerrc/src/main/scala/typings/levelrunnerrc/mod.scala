package typings.levelrunnerrc

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("levelrunnerrc", "Base")
  @js.native
  open class Base_ protected () extends LevelRunner {
    def this(before_in_ : js.Function0[Unit], after_in_ : js.Function0[Unit], level_in_ : Double) = this()
  }
  
  @JSImport("levelrunnerrc", "Base")
  @js.native
  val Base_ : Instantiable3[
    /* before_in_ */ js.Function0[Unit], 
    /* after_in_ */ js.Function0[Unit], 
    /* level_in_ */ Double, 
    LevelRunner
  ] = js.native
  
  @JSImport("levelrunnerrc", "LevelRunner")
  @js.native
  open class LevelRunner protected () extends StObject {
    def this(before_in_ : js.Function0[Unit], after_in_ : js.Function0[Unit], level_in_ : Double) = this()
    
    def add(fun: js.Function0[Unit], level: Double, name: String): Unit = js.native
    
    def run(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("levelrunnerrc", "base")
  @js.native
  open class base protected () extends LevelRunner {
    def this(before_in_ : js.Function0[Unit], after_in_ : js.Function0[Unit], level_in_ : Double) = this()
  }
  @JSImport("levelrunnerrc", "base")
  @js.native
  val base: Instantiable3[
    /* before_in_ */ js.Function0[Unit], 
    /* after_in_ */ js.Function0[Unit], 
    /* level_in_ */ Double, 
    LevelRunner
  ] = js.native
}
