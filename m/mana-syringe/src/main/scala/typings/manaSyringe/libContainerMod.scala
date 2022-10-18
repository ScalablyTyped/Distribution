package typings.manaSyringe

import typings.manaSyringe.libCoreMod.Syringe.InjectOption
import typings.manaSyringe.libCoreMod.Syringe.Register
import typings.manaSyringe.libInversifyInversifyProtocolMod.InversifyContext
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainerMod {
  
  @JSImport("mana-syringe/lib/container", "Container")
  @js.native
  open class Container ()
    extends StObject
       with typings.manaSyringe.libCoreMod.Syringe.Container
       with InversifyContext {
    def this(inversifyContainer: typings.inversify.libInterfacesInterfacesMod.interfaces.Container) = this()
    
    /* CompleteClass */
    var container: typings.inversify.libInterfacesInterfacesMod.interfaces.Container = js.native
    
    /* protected */ var inversify: Boolean = js.native
    
    /* protected */ var loadedModules: js.Array[Double] = js.native
  }
  /* static members */
  object Container {
    
    @JSImport("mana-syringe/lib/container", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    inline def config(option: InjectOption[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getContainer(key: typings.inversify.libInterfacesInterfacesMod.interfaces.Container): typings.manaSyringe.libCoreMod.Syringe.Container = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainer")(key.asInstanceOf[js.Any]).asInstanceOf[typings.manaSyringe.libCoreMod.Syringe.Container]
    
    inline def setContainer(
      key: typings.inversify.libInterfacesInterfacesMod.interfaces.Container,
      value: typings.manaSyringe.libCoreMod.Syringe.Container
    ): Map[Double, typings.manaSyringe.libCoreMod.Syringe.Container] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContainer")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Map[Double, typings.manaSyringe.libCoreMod.Syringe.Container]]
  }
  
  @JSImport("mana-syringe/lib/container", "GlobalContainer")
  @js.native
  val GlobalContainer: Container = js.native
  
  @JSImport("mana-syringe/lib/container", "register")
  @js.native
  val register: Register = js.native
}
