package typings.inversify

import typings.inversify.libAnnotationDecoratorUtilsMod.DecoratorTarget
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationTaggedMod {
  
  @JSImport("inversify/lib/annotation/tagged", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tagged[T](metadataKey: String, metadataValue: Any): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("tagged")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  inline def tagged[T](metadataKey: js.Symbol, metadataValue: Any): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("tagged")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
  inline def tagged[T](metadataKey: Double, metadataValue: Any): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("tagged")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
}
