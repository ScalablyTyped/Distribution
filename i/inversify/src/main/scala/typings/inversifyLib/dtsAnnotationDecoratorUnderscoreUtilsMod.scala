package typings
package inversifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/annotation/decorator_utils", JSImport.Namespace)
@js.native
object dtsAnnotationDecoratorUnderscoreUtilsMod extends js.Object {
  def decorate(decorator: stdLib.MethodDecorator | stdLib.ParameterDecorator, target: js.Any): scala.Unit = js.native
  def decorate(
    decorator: stdLib.MethodDecorator | stdLib.ParameterDecorator,
    target: js.Any,
    parameterIndex: java.lang.String
  ): scala.Unit = js.native
  def decorate(
    decorator: stdLib.MethodDecorator | stdLib.ParameterDecorator,
    target: js.Any,
    parameterIndex: scala.Double
  ): scala.Unit = js.native
  def decorate(decorator: stdLib.ClassDecorator, target: js.Any): scala.Unit = js.native
  def decorate(decorator: stdLib.ClassDecorator, target: js.Any, parameterIndex: java.lang.String): scala.Unit = js.native
  def decorate(decorator: stdLib.ClassDecorator, target: js.Any, parameterIndex: scala.Double): scala.Unit = js.native
  def tagParameter(
    annotationTarget: js.Any,
    propertyName: java.lang.String,
    parameterIndex: scala.Double,
    metadata: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Metadata
  ): scala.Unit = js.native
  def tagProperty(
    annotationTarget: js.Any,
    propertyName: java.lang.String,
    metadata: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Metadata
  ): scala.Unit = js.native
}

