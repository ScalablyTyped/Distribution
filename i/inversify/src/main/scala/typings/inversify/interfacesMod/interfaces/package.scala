package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AsyncCallback[TCallback] = js.Function1[/* args */ Any, js.Promise[Any]]

type AsyncContainerModuleCallBack = AsyncCallback[ContainerModuleCallBack]

type AutoFactory[T] = SimpleFactory[T, js.Array[Any]]

type AutoNamedFactory[T] = SimpleFactory[T, js.Array[String]]

type Bind = js.Function1[/* serviceIdentifier */ ServiceIdentifier[Any], BindingToSyntax[Any]]

type BindingActivation[T] = js.Function2[/* context */ Context, /* injectable */ T, T | js.Promise[T]]

type BindingDeactivation[T] = js.Function1[/* injectable */ T, Unit | js.Promise[Unit]]

type ContainerModuleCallBack = js.Function7[
/* bind */ Bind, 
/* unbind */ Unbind, 
/* isBound */ IsBound, 
/* rebind */ Rebind, 
/* unbindAsync */ UnbindAsync, 
/* onActivation */ js.Function2[
  /* serviceIdentifier */ ServiceIdentifier[Any], 
  /* onActivation */ BindingActivation[Any], 
  Unit
], 
/* onDeactivation */ js.Function2[
  /* serviceIdentifier */ ServiceIdentifier[Any], 
  /* onDeactivation */ BindingDeactivation[Any], 
  Unit
], 
Unit]

type ContainerResolution[T] = T | js.Promise[T] | (js.Array[T | js.Promise[T]])

type ContextInterceptor = js.Function1[/* context */ Context, Context]

type DynamicValue[T] = js.Function1[/* context */ Context, T | js.Promise[T]]

type Factory[T, U /* <: js.Array[Any] */, V /* <: js.Array[Any] */] = (SimpleFactory[T, U]) | (MultiFactory[T, U, V])

type FactoryCreator[T, U /* <: js.Array[Any] */, V /* <: js.Array[Any] */] = js.Function1[/* context */ Context, Factory[T, U, V]]

type FactoryTypeFunction[T] = js.Function1[/* context */ Context, T | js.Promise[T]]

type IsBound = js.Function1[/* serviceIdentifier */ ServiceIdentifier[Any], Boolean]

type MetadataMap = StringDictionary[js.Array[Metadata[Any]]]

type MetadataOrMetadataArray = Metadata[Any] | js.Array[Metadata[Any]]

type Middleware = js.Function1[/* next */ Next, Next]

type MultiFactory[T, U /* <: js.Array[Any] */, V /* <: js.Array[Any] */] = js.Function1[/* args */ U, SimpleFactory[T, V]]

type Newable[T] = Instantiable1[/* args (repeated) */ scala.Nothing, T]

type Next = js.Function1[/* args */ NextArgs[Any], Any | js.Array[Any]]

type ProviderCreator[T] = js.Function1[/* context */ Context, Provider[T]]

type Rebind = js.Function1[/* serviceIdentifier */ ServiceIdentifier[Any], BindingToSyntax[Any]]

type RequestScope = Map[Any, Any]

type ResolveRequestHandler = js.Function1[/* request */ Request, Any]

type ServiceIdentifier[T] = String | js.Symbol | Newable[T] | Abstract[T]

type SimpleFactory[T, U /* <: js.Array[Any] */] = js.Function1[/* args */ U, T]

type Unbind = js.Function1[/* serviceIdentifier */ ServiceIdentifier[Any], Unit]

type UnbindAsync = js.Function1[/* serviceIdentifier */ ServiceIdentifier[Any], js.Promise[Unit]]
