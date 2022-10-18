package typings.inversify

import typings.inversify.libAnnotationDecoratorUtilsMod.DecoratorTarget
import typings.inversify.libAnnotationLazyServiceIdentifierMod.ServiceIdentifierOrFunc
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationMultiInjectMod {
  
  @JSImport("inversify/lib/annotation/multi_inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multiInject[T](serviceIdentifier: ServiceIdentifierOrFunc[T]): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiInject")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
}
