package typings.inversifyInjectDecorators

import typings.inversify.interfacesMod.interfaces.Abstract
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.Newable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("inversify-inject-decorators/dts/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePropertyInjectDecorator(container: Container, doCache: Boolean): js.Function1[
    /* serviceIdentifier */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    js.Function2[/* proto */ js.Any, /* key */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropertyInjectDecorator")(container.asInstanceOf[js.Any], doCache.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* serviceIdentifier */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    js.Function2[/* proto */ js.Any, /* key */ String, Unit]
  ]]
  
  inline def makePropertyInjectNamedDecorator(container: Container, doCache: Boolean): js.Function2[
    /* serviceIdentifier */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    /* named */ String, 
    js.Function2[/* proto */ js.Any, /* key */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropertyInjectNamedDecorator")(container.asInstanceOf[js.Any], doCache.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* serviceIdentifier */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    /* named */ String, 
    js.Function2[/* proto */ js.Any, /* key */ String, Unit]
  ]]
  
  inline def makePropertyInjectTaggedDecorator(container: Container, doCache: Boolean): js.Function3[
    /* serviceIdentifier */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    /* key */ String, 
    /* value */ js.Any, 
    js.Function2[/* proto */ js.Any, /* propertyName */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropertyInjectTaggedDecorator")(container.asInstanceOf[js.Any], doCache.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* serviceIdentifier */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    /* key */ String, 
    /* value */ js.Any, 
    js.Function2[/* proto */ js.Any, /* propertyName */ String, Unit]
  ]]
  
  inline def makePropertyMultiInjectDecorator(container: Container, doCache: Boolean): js.Function1[
    /* serviceIdentifier */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    js.Function2[/* proto */ js.Any, /* key */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropertyMultiInjectDecorator")(container.asInstanceOf[js.Any], doCache.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* serviceIdentifier */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    js.Function2[/* proto */ js.Any, /* key */ String, Unit]
  ]]
}
