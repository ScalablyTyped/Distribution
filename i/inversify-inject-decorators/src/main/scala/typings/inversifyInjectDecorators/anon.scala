package typings.inversifyInjectDecorators

import typings.inversify.libInterfacesInterfacesMod.interfaces.Abstract
import typings.inversify.libInterfacesInterfacesMod.interfaces.Newable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LazyInject extends StObject {
    
    def lazyInject(serviceIdentifier: String): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    def lazyInject(serviceIdentifier: js.Symbol): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    def lazyInject(serviceIdentifier: Abstract[Any]): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    def lazyInject(serviceIdentifier: Newable[Any]): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    
    def lazyInjectNamed(serviceIdentifier: String, named: String): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    def lazyInjectNamed(serviceIdentifier: js.Symbol, named: String): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    def lazyInjectNamed(serviceIdentifier: Abstract[Any], named: String): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    def lazyInjectNamed(serviceIdentifier: Newable[Any], named: String): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    
    def lazyInjectTagged(serviceIdentifier: String, key: String, value: Any): js.Function2[/* proto */ Any, /* propertyName */ String, Unit] = js.native
    def lazyInjectTagged(serviceIdentifier: js.Symbol, key: String, value: Any): js.Function2[/* proto */ Any, /* propertyName */ String, Unit] = js.native
    def lazyInjectTagged(serviceIdentifier: Abstract[Any], key: String, value: Any): js.Function2[/* proto */ Any, /* propertyName */ String, Unit] = js.native
    def lazyInjectTagged(serviceIdentifier: Newable[Any], key: String, value: Any): js.Function2[/* proto */ Any, /* propertyName */ String, Unit] = js.native
    
    def lazyMultiInject(serviceIdentifier: String): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    def lazyMultiInject(serviceIdentifier: js.Symbol): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    def lazyMultiInject(serviceIdentifier: Abstract[Any]): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
    def lazyMultiInject(serviceIdentifier: Newable[Any]): js.Function2[/* proto */ Any, /* key */ String, Unit] = js.native
  }
}
