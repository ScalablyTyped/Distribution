package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.Context
import typings.inversify.interfacesMod.interfaces.Lookup
import typings.inversify.interfacesMod.interfaces.MetadataReader
import typings.inversify.interfacesMod.interfaces.Request
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversify.interfacesMod.interfaces.TargetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plannerMod {
  
  @JSImport("inversify/dts/planning/planner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createMockRequest(container: Container, serviceIdentifier: ServiceIdentifier[js.Any], key: String, value: js.Any): Request = (^.asInstanceOf[js.Dynamic].applyDynamic("createMockRequest")(container.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Request]
  @scala.inline
  def createMockRequest(container: Container, serviceIdentifier: ServiceIdentifier[js.Any], key: js.Symbol, value: js.Any): Request = (^.asInstanceOf[js.Dynamic].applyDynamic("createMockRequest")(container.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Request]
  @scala.inline
  def createMockRequest(container: Container, serviceIdentifier: ServiceIdentifier[js.Any], key: Double, value: js.Any): Request = (^.asInstanceOf[js.Dynamic].applyDynamic("createMockRequest")(container.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Request]
  
  @scala.inline
  def getBindingDictionary(cntnr: js.Any): Lookup[Binding[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBindingDictionary")(cntnr.asInstanceOf[js.Any]).asInstanceOf[Lookup[Binding[js.Any]]]
  
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any]
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: String
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: String,
    value: js.Any
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: String,
    value: js.Any,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: String,
    value: Unit,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: js.Symbol
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: js.Symbol,
    value: js.Any
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: js.Symbol,
    value: js.Any,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: js.Symbol,
    value: Unit,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: Double
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: Double,
    value: js.Any
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: Double,
    value: js.Any,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: Double,
    value: Unit,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: Unit,
    value: js.Any
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: Unit,
    value: js.Any,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[js.Any],
    key: Unit,
    value: Unit,
    avoidConstraints: Boolean
  ): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(metadataReader.asInstanceOf[js.Any], container.asInstanceOf[js.Any], isMultiInject.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], avoidConstraints.asInstanceOf[js.Any])).asInstanceOf[Context]
}
