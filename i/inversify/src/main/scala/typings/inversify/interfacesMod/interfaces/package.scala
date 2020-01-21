package typings.inversify.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  type AsyncContainerModuleCallBack = js.Function4[
    /* bind */ typings.inversify.interfacesMod.interfaces.Bind, 
    /* unbind */ typings.inversify.interfacesMod.interfaces.Unbind, 
    /* isBound */ typings.inversify.interfacesMod.interfaces.IsBound, 
    /* rebind */ typings.inversify.interfacesMod.interfaces.Rebind, 
    js.Promise[scala.Unit]
  ]
  type Bind = js.Function1[
    /* serviceIdentifier */ typings.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any], 
    typings.inversify.interfacesMod.interfaces.BindingToSyntax[js.Any]
  ]
  type ContainerModuleCallBack = js.Function4[
    /* bind */ typings.inversify.interfacesMod.interfaces.Bind, 
    /* unbind */ typings.inversify.interfacesMod.interfaces.Unbind, 
    /* isBound */ typings.inversify.interfacesMod.interfaces.IsBound, 
    /* rebind */ typings.inversify.interfacesMod.interfaces.Rebind, 
    scala.Unit
  ]
  type ContextInterceptor = js.Function1[
    /* context */ typings.inversify.interfacesMod.interfaces.Context, 
    typings.inversify.interfacesMod.interfaces.Context
  ]
  type Factory[T] = js.Function1[/* repeated */ js.Any, (js.Function1[/* repeated */ js.Any, T]) | T]
  type FactoryCreator[T] = js.Function1[
    /* context */ typings.inversify.interfacesMod.interfaces.Context, 
    typings.inversify.interfacesMod.interfaces.Factory[T]
  ]
  type IsBound = js.Function1[
    /* serviceIdentifier */ typings.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any], 
    scala.Boolean
  ]
  type MetadataMap = org.scalablytyped.runtime.StringDictionary[js.Array[typings.inversify.interfacesMod.interfaces.Metadata]]
  type Middleware = js.Function1[
    /* next */ typings.inversify.interfacesMod.interfaces.Next, 
    typings.inversify.interfacesMod.interfaces.Next
  ]
  type Next = js.Function1[
    /* args */ typings.inversify.interfacesMod.interfaces.NextArgs, 
    js.Any | js.Array[js.Any]
  ]
  type Provider[T] = js.Function1[
    /* repeated */ js.Any, 
    (js.Function1[/* repeated */ js.Any, js.Promise[T]]) | js.Promise[T]
  ]
  type ProviderCreator[T] = js.Function1[
    /* context */ typings.inversify.interfacesMod.interfaces.Context, 
    typings.inversify.interfacesMod.interfaces.Provider[T]
  ]
  type Rebind = js.Function1[
    /* serviceIdentifier */ typings.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any], 
    typings.inversify.interfacesMod.interfaces.BindingToSyntax[js.Any]
  ]
  type ReflectResult = org.scalablytyped.runtime.StringDictionary[js.Array[typings.inversify.interfacesMod.interfaces.Metadata]]
  type RequestScope = (typings.std.Map[js.Any, js.Any]) | scala.Null
  type ResolveRequestHandler = js.Function1[/* request */ typings.inversify.interfacesMod.interfaces.Request, js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Symbol
    - typings.inversify.interfacesMod.interfaces.Newable[T]
    - typings.inversify.interfacesMod.interfaces.Abstract[T]
  */
  type ServiceIdentifier[T] = typings.inversify.interfacesMod.interfaces._ServiceIdentifier[T] | java.lang.String | js.Symbol
  type Unbind = js.Function1[
    /* serviceIdentifier */ typings.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any], 
    scala.Unit
  ]
}
