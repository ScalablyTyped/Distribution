package typings.inversifyInjectDecorators

import typings.inversify.interfacesMod.interfaces.Abstract
import typings.inversify.interfacesMod.interfaces.Newable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LazyInject extends StObject {
    
    def lazyInject(serviceIdentifier: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    def lazyInject(serviceIdentifier: js.Symbol): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    def lazyInject(serviceIdentifier: Abstract[js.Any]): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    def lazyInject(serviceIdentifier: Newable[js.Any]): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    
    def lazyInjectNamed(serviceIdentifier: String, named: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    def lazyInjectNamed(serviceIdentifier: js.Symbol, named: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    def lazyInjectNamed(serviceIdentifier: Abstract[js.Any], named: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    def lazyInjectNamed(serviceIdentifier: Newable[js.Any], named: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    
    def lazyInjectTagged(serviceIdentifier: String, key: String, value: js.Any): js.Function2[/* proto */ js.Any, /* propertyName */ String, Unit] = js.native
    def lazyInjectTagged(serviceIdentifier: js.Symbol, key: String, value: js.Any): js.Function2[/* proto */ js.Any, /* propertyName */ String, Unit] = js.native
    def lazyInjectTagged(serviceIdentifier: Abstract[js.Any], key: String, value: js.Any): js.Function2[/* proto */ js.Any, /* propertyName */ String, Unit] = js.native
    def lazyInjectTagged(serviceIdentifier: Newable[js.Any], key: String, value: js.Any): js.Function2[/* proto */ js.Any, /* propertyName */ String, Unit] = js.native
    
    def lazyMultiInject(serviceIdentifier: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    def lazyMultiInject(serviceIdentifier: js.Symbol): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    def lazyMultiInject(serviceIdentifier: Abstract[js.Any]): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
    def lazyMultiInject(serviceIdentifier: Newable[js.Any]): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  }
}
