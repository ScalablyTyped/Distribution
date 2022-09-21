package typings.manaSyringe

import typings.inversify.interfacesMod.interfaces.Bind
import typings.inversify.interfacesMod.interfaces.IsBound
import typings.inversify.interfacesMod.interfaces.Rebind
import typings.inversify.interfacesMod.interfaces.Unbind
import typings.inversify.mod.ContainerModule
import typings.manaSyringe.coreMod.Syringe.DefinedToken
import typings.manaSyringe.coreMod.Syringe.InjectOption
import typings.manaSyringe.coreMod.Syringe.Module
import typings.manaSyringe.coreMod.Syringe.Registry
import typings.manaSyringe.coreMod.Syringe.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syringeModuleMod {
  
  @JSImport("mana-syringe/lib/module/syringe-module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mana-syringe/lib/module/syringe-module", "SyringeModule")
  @js.native
  open class SyringeModule ()
    extends StObject
       with Module {
    def this(registry: Registry) = this()
    
    /* protected */ var baseRegistry: js.UndefOr[Registry] = js.native
    
    def contribution(tokens: DefinedToken*): this.type = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    val inversifyModule: ContainerModule = js.native
    
    /* protected */ def inversifyRegister(bind: Bind, unbind: Unbind, isBound: IsBound, rebind: Rebind): Unit = js.native
    
    /* protected */ var optionCollection: js.UndefOr[js.Array[Token[Any] | InjectOption[Any]]] = js.native
    
    /* protected */ def options: js.Array[InjectOption[Any] | Token[Any]] = js.native
    
    def register(options: TokenOrOption[Any]*): this.type = js.native
  }
  
  inline def isSyringeModule(data: Module): /* is mana-syringe.mana-syringe/lib/module/syringe-module.SyringeModule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyringeModule")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/module/syringe-module.SyringeModule */ Boolean]
  
  type TokenOrOption[T] = Token[T] | InjectOption[T]
}
