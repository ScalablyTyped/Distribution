package typings.inversify

import org.scalablytyped.runtime.Instantiable1
import typings.inversify.libInterfacesInterfacesMod.interfaces.MetadataOrMetadataArray
import typings.std.MethodDecorator
import typings.std.NewableFunction
import typings.std.ParameterDecorator
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationDecoratorUtilsMod {
  
  @JSImport("inversify/lib/annotation/decorator_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTaggedDecorator(metadata: MetadataOrMetadataArray): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaggedDecorator")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any, parameterIndexOrProperty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: MethodDecorator | ParameterDecorator, target: Any, parameterIndexOrProperty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any, parameterIndexOrProperty: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate(decorator: DecoratorTarget[Any], target: Any, parameterIndexOrProperty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorator.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parameterIndexOrProperty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tagParameter(
    annotationTarget: DecoratorTarget[Any],
    parameterName: String,
    parameterIndex: Double,
    metadata: MetadataOrMetadataArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tagParameter")(annotationTarget.asInstanceOf[js.Any], parameterName.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def tagParameter(
    annotationTarget: DecoratorTarget[Any],
    parameterName: js.Symbol,
    parameterIndex: Double,
    metadata: MetadataOrMetadataArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tagParameter")(annotationTarget.asInstanceOf[js.Any], parameterName.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def tagParameter(
    annotationTarget: DecoratorTarget[Any],
    parameterName: Unit,
    parameterIndex: Double,
    metadata: MetadataOrMetadataArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tagParameter")(annotationTarget.asInstanceOf[js.Any], parameterName.asInstanceOf[js.Any], parameterIndex.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tagProperty(annotationTarget: DecoratorTarget[Any], propertyName: String, metadata: MetadataOrMetadataArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tagProperty")(annotationTarget.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def tagProperty(annotationTarget: DecoratorTarget[Any], propertyName: js.Symbol, metadata: MetadataOrMetadataArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tagProperty")(annotationTarget.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait ConstructorFunction[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
       with DecoratorTarget[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.inversify.libAnnotationDecoratorUtilsMod.ConstructorFunction[T]
    - typings.inversify.libAnnotationDecoratorUtilsMod.Prototype[T]
  */
  trait DecoratorTarget[T] extends StObject
  
  @js.native
  trait Prototype[T]
    extends StObject
       with DecoratorTarget[T] {
    
    var constructor: NewableFunction = js.native
  }
}
