package typings.manaSyringe

import typings.inversify.libInterfacesInterfacesMod.interfaces.Bind
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingToSyntax
import typings.inversify.libInterfacesInterfacesMod.interfaces.Container
import typings.inversify.libInterfacesInterfacesMod.interfaces.IsBound
import typings.inversify.libInterfacesInterfacesMod.interfaces.Rebind
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversify.libInterfacesInterfacesMod.interfaces.Unbind
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInversifyInversifyProtocolMod {
  
  @JSImport("mana-syringe/lib/inversify/inversify-protocol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isInversifyContext(data: Record[Any, Any]): /* is mana-syringe.mana-syringe/lib/inversify/inversify-protocol.InversifyContext */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInversifyContext")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/inversify/inversify-protocol.InversifyContext */ Boolean]
  
  inline def isInversifyRegister(data: Record[Any, Any]): /* is mana-syringe.mana-syringe/lib/inversify/inversify-protocol.InversifyRegister */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInversifyRegister")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/inversify/inversify-protocol.InversifyRegister */ Boolean]
  
  trait InversifyContext extends StObject {
    
    var container: Container
  }
  object InversifyContext {
    
    inline def apply(container: Container): InversifyContext = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[InversifyContext]
    }
    
    extension [Self <: InversifyContext](x: Self) {
      
      inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
  
  trait InversifyRegister extends StObject {
    
    def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T]
    @JSName("bind")
    var bind_Original: Bind
    
    def isBound[T](serviceIdentifier: ServiceIdentifier[T]): Boolean
    @JSName("isBound")
    var isBound_Original: IsBound
    
    def rebind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T]
    @JSName("rebind")
    var rebind_Original: Rebind
    
    def unbind[T](serviceIdentifier: ServiceIdentifier[T]): Unit
    @JSName("unbind")
    var unbind_Original: Unbind
  }
  object InversifyRegister {
    
    inline def apply(
      bind: /* serviceIdentifier */ ServiceIdentifier[Any] => BindingToSyntax[Any],
      isBound: /* serviceIdentifier */ ServiceIdentifier[Any] => Boolean,
      rebind: /* serviceIdentifier */ ServiceIdentifier[Any] => BindingToSyntax[Any],
      unbind: /* serviceIdentifier */ ServiceIdentifier[Any] => Unit
    ): InversifyRegister = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), isBound = js.Any.fromFunction1(isBound), rebind = js.Any.fromFunction1(rebind), unbind = js.Any.fromFunction1(unbind))
      __obj.asInstanceOf[InversifyRegister]
    }
    
    extension [Self <: InversifyRegister](x: Self) {
      
      inline def setBind(value: /* serviceIdentifier */ ServiceIdentifier[Any] => BindingToSyntax[Any]): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
      
      inline def setIsBound(value: /* serviceIdentifier */ ServiceIdentifier[Any] => Boolean): Self = StObject.set(x, "isBound", js.Any.fromFunction1(value))
      
      inline def setRebind(value: /* serviceIdentifier */ ServiceIdentifier[Any] => BindingToSyntax[Any]): Self = StObject.set(x, "rebind", js.Any.fromFunction1(value))
      
      inline def setUnbind(value: /* serviceIdentifier */ ServiceIdentifier[Any] => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
    }
  }
}
