package typings.mariasql

import org.scalablytyped.runtime.Shortcut
import typings.mariasql.mod.Client
import typings.mariasql.mod.MariaClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object mariasql extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("mariasql")
    @js.native
    open class ^ ()
      extends StObject
         with MariaClient
    
    @JSGlobal("mariasql")
    @js.native
    val ^ : Client = js.native
    
    type _To = Client
    
    /* This means you don't have to write `^`, but can instead just say `mariasql.foo` */
    override def _to: Client = ^
  }
}
