package typings.manaSyringe

import typings.manaSyringe.libCoreMod.Syringe.Module
import typings.manaSyringe.libCoreMod.Syringe.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleMod {
  
  @JSImport("mana-syringe/lib/module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Module(): typings.manaSyringe.libModuleSyringeModuleMod.SyringeModule = ^.asInstanceOf[js.Dynamic].applyDynamic("Module")().asInstanceOf[typings.manaSyringe.libModuleSyringeModuleMod.SyringeModule]
  inline def Module(register: Registry): typings.manaSyringe.libModuleSyringeModuleMod.SyringeModule = ^.asInstanceOf[js.Dynamic].applyDynamic("Module")(register.asInstanceOf[js.Any]).asInstanceOf[typings.manaSyringe.libModuleSyringeModuleMod.SyringeModule]
  
  @JSImport("mana-syringe/lib/module", "SyringeModule")
  @js.native
  open class SyringeModule ()
    extends typings.manaSyringe.libModuleSyringeModuleMod.SyringeModule {
    def this(registry: Registry) = this()
  }
  
  inline def isSyringeModule(data: Module): /* is mana-syringe.mana-syringe/lib/module/syringe-module.SyringeModule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyringeModule")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/module/syringe-module.SyringeModule */ Boolean]
}
