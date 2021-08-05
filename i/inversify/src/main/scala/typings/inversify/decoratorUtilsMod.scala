package typings.inversify

import typings.inversify.interfacesMod.interfaces.Metadata
import typings.std.ClassDecorator
import typings.std.MethodDecorator
import typings.std.ParameterDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorUtilsMod {
  
  @JSImport("inversify/dts/annotation/decorator_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: ClassDecorator, target: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tagParameter(annotationTarget: js.Any, propertyName: String, parameterIndex: Double, metadata: Metadata): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tagParameter")(annotationTarget.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tagProperty(annotationTarget: js.Any, propertyName: String, metadata: Metadata): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tagProperty")(annotationTarget.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
