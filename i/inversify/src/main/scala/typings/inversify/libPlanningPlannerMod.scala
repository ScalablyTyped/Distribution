package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.Binding
import typings.inversify.libInterfacesInterfacesMod.interfaces.Container
import typings.inversify.libInterfacesInterfacesMod.interfaces.Context
import typings.inversify.libInterfacesInterfacesMod.interfaces.Lookup
import typings.inversify.libInterfacesInterfacesMod.interfaces.MetadataReader
import typings.inversify.libInterfacesInterfacesMod.interfaces.Request
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversify.libInterfacesInterfacesMod.interfaces.TargetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlanningPlannerMod {
  
  @JSImport("inversify/lib/planning/planner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMockRequest(container: Container, serviceIdentifier: ServiceIdentifier[Any], key: String, value: Any): Request = (^.asInstanceOf[js.Dynamic].applyDynamic("createMockRequest")(container.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Request]
  inline def createMockRequest(container: Container, serviceIdentifier: ServiceIdentifier[Any], key: js.Symbol, value: Any): Request = (^.asInstanceOf[js.Dynamic].applyDynamic("createMockRequest")(container.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Request]
  inline def createMockRequest(container: Container, serviceIdentifier: ServiceIdentifier[Any], key: Double, value: Any): Request = (^.asInstanceOf[js.Dynamic].applyDynamic("createMockRequest")(container.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Request]
  
  inline def getBindingDictionary(cntnr: Container): Lookup[Binding[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBindingDictionary")(cntnr.asInstanceOf[js.Any]).asInstanceOf[Lookup[Binding[Any]]]
  
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any]
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: String
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: String,
    value: Any
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: String,
    value: Any,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: String,
    value: Unit,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: js.Symbol
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: js.Symbol,
    value: Any
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: js.Symbol,
    value: Any,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: js.Symbol,
    value: Unit,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: Double
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: Double,
    value: Any
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: Double,
    value: Any,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: Double,
    value: Unit,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: Unit,
    value: Any
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: Unit,
    value: Any,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  inline def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[Any],
    key: Unit,
    value: Unit,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
}
