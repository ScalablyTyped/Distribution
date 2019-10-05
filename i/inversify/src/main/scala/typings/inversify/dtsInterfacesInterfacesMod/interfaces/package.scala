package typings.inversify.dtsInterfacesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Map

  type AsyncContainerModuleCallBack = js.Function4[
    /* bind */ Bind, 
    /* unbind */ Unbind, 
    /* isBound */ IsBound, 
    /* rebind */ Rebind, 
    js.Promise[Unit]
  ]
  type Bind = js.Function1[/* serviceIdentifier */ ServiceIdentifier[js.Any], BindingToSyntax[js.Any]]
  type ContainerModuleCallBack = js.Function4[/* bind */ Bind, /* unbind */ Unbind, /* isBound */ IsBound, /* rebind */ Rebind, Unit]
  type ContextInterceptor = js.Function1[/* context */ Context, Context]
  type Factory[T] = js.Function1[/* repeated */ js.Any, (js.Function1[/* repeated */ js.Any, T]) | T]
  type FactoryCreator[T] = js.Function1[/* context */ Context, Factory[T]]
  type IsBound = js.Function1[/* serviceIdentifier */ ServiceIdentifier[js.Any], Boolean]
  type MetadataMap = StringDictionary[js.Array[Metadata]]
  type Middleware = js.Function1[/* next */ Next, Next]
  type Next = js.Function1[/* args */ NextArgs, js.Any | js.Array[js.Any]]
  type Provider[T] = js.Function1[
    /* repeated */ js.Any, 
    (js.Function1[/* repeated */ js.Any, js.Promise[T]]) | js.Promise[T]
  ]
  type ProviderCreator[T] = js.Function1[/* context */ Context, Provider[T]]
  type Rebind = js.Function1[/* serviceIdentifier */ ServiceIdentifier[js.Any], BindingToSyntax[js.Any]]
  type ReflectResult = StringDictionary[js.Array[Metadata]]
  type RequestScope = (Map[js.Any, js.Any]) | Null
  type ResolveRequestHandler = js.Function1[/* request */ Request, js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Symbol
    - typings.inversify.dtsInterfacesInterfacesMod.interfaces.Newable[T]
    - typings.inversify.dtsInterfacesInterfacesMod.interfaces.Abstract[T]
  */
  type ServiceIdentifier[T] = _ServiceIdentifier[T] | String | js.Symbol
  type Unbind = js.Function1[/* serviceIdentifier */ ServiceIdentifier[js.Any], Unit]
}
