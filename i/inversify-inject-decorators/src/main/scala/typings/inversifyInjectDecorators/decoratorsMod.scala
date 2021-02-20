package typings.inversifyInjectDecorators

import typings.inversify.interfacesMod.interfaces.Abstract
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.Newable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("inversify-inject-decorators/dts/decorators", "makePropertyInjectDecorator")
  @js.native
  def makePropertyInjectDecorator(container: Container, doCache: Boolean): js.Function1[
    /* serviceIdentifier */ String | js.Symbol | Newable[_] | Abstract[_], 
    js.Function2[/* proto */ _, /* key */ String, Unit]
  ] = js.native
  
  @JSImport("inversify-inject-decorators/dts/decorators", "makePropertyInjectNamedDecorator")
  @js.native
  def makePropertyInjectNamedDecorator(container: Container, doCache: Boolean): js.Function2[
    /* serviceIdentifier */ String | js.Symbol | Newable[_] | Abstract[_], 
    /* named */ String, 
    js.Function2[/* proto */ _, /* key */ String, Unit]
  ] = js.native
  
  @JSImport("inversify-inject-decorators/dts/decorators", "makePropertyInjectTaggedDecorator")
  @js.native
  def makePropertyInjectTaggedDecorator(container: Container, doCache: Boolean): js.Function3[
    /* serviceIdentifier */ String | js.Symbol | Newable[_] | Abstract[_], 
    /* key */ String, 
    /* value */ js.Any, 
    js.Function2[/* proto */ _, /* propertyName */ String, Unit]
  ] = js.native
  
  @JSImport("inversify-inject-decorators/dts/decorators", "makePropertyMultiInjectDecorator")
  @js.native
  def makePropertyMultiInjectDecorator(container: Container, doCache: Boolean): js.Function1[
    /* serviceIdentifier */ String | js.Symbol | Newable[_] | Abstract[_], 
    js.Function2[/* proto */ _, /* key */ String, Unit]
  ] = js.native
}
