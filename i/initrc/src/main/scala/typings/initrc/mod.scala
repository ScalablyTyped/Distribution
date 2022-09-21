package typings.initrc

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("initrc", "Base")
  @js.native
  open class Base_ () extends Init_
  
  @JSImport("initrc", "Base")
  @js.native
  val Base_ : Instantiable0[Init_] = js.native
  
  @JSImport("initrc", "Init")
  @js.native
  open class Init_ () extends StObject {
    
    def startAdd(fun: js.Function0[Unit], level: Double, name: String): Boolean = js.native
    
    /** @async */
    def startRun(): js.Promise[Unit] = js.native
    
    def status(): Double = js.native
    
    def stopAdd(fun: js.Function0[Unit], level: Double, name: String): Boolean = js.native
    
    /** @async */
    def stopRun(): js.Promise[Unit] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("initrc", "base")
  @js.native
  open class base () extends Init_
  @JSImport("initrc", "base")
  @js.native
  val base: Instantiable0[Init_] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("initrc", "init")
  @js.native
  open class init () extends Init_
  @JSImport("initrc", "init")
  @js.native
  val init: Instantiable0[Init_] = js.native
}
