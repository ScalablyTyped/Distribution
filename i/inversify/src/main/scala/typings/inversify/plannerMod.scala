package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.Context
import typings.inversify.interfacesMod.interfaces.Lookup
import typings.inversify.interfacesMod.interfaces.MetadataReader
import typings.inversify.interfacesMod.interfaces.Request
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversify.interfacesMod.interfaces.TargetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/planner", JSImport.Namespace)
@js.native
object plannerMod extends js.Object {
  def createMockRequest(container: Container, serviceIdentifier: ServiceIdentifier[_], key: String, value: js.Any): Request = js.native
  def createMockRequest(container: Container, serviceIdentifier: ServiceIdentifier[_], key: js.Symbol, value: js.Any): Request = js.native
  def createMockRequest(container: Container, serviceIdentifier: ServiceIdentifier[_], key: Double, value: js.Any): Request = js.native
  def getBindingDictionary(cntnr: js.Any): Lookup[Binding[_]] = js.native
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[_]
  ): Context = js.native
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[_],
    key: String
  ): Context = js.native
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[_],
    key: String,
    value: js.Any
  ): Context = js.native
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[_],
    key: String,
    value: js.Any,
    avoidConstraints: Boolean
  ): Context = js.native
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[_],
    key: js.Symbol
  ): Context = js.native
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[_],
    key: js.Symbol,
    value: js.Any
  ): Context = js.native
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[_],
    key: js.Symbol,
    value: js.Any,
    avoidConstraints: Boolean
  ): Context = js.native
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[_],
    key: Double
  ): Context = js.native
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[_],
    key: Double,
    value: js.Any
  ): Context = js.native
  def plan(
    metadataReader: MetadataReader,
    container: Container,
    isMultiInject: Boolean,
    targetType: TargetType,
    serviceIdentifier: ServiceIdentifier[_],
    key: Double,
    value: js.Any,
    avoidConstraints: Boolean
  ): Context = js.native
}

