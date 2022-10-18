package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.anon.Evaluate
import typings.maplibreGl.anon.InterpolationFactor
import typings.maplibreGl.anon.ZoomStops
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object function {
  
  @JSImport("maplibre-gl/dist/style-spec", "function")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl/dist/style-spec", "function.convertFunction")
  @js.native
  def convertFunction: js.Function2[/* parameters */ Any, /* propertySpec */ StylePropertySpecification, Any] = js.native
  inline def convertFunction(parameters: Any, propertySpec: StylePropertySpecification): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFunction")(parameters.asInstanceOf[js.Any], propertySpec.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def convertFunction_=(x: js.Function2[/* parameters */ Any, /* propertySpec */ StylePropertySpecification, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertFunction")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "function.createFunction")
  @js.native
  def createFunction: js.Function2[
    /* parameters */ Any, 
    /* propertySpec */ Any, 
    Evaluate | InterpolationFactor | ZoomStops
  ] = js.native
  inline def createFunction(parameters: Any, propertySpec: Any): Evaluate | InterpolationFactor | ZoomStops = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunction")(parameters.asInstanceOf[js.Any], propertySpec.asInstanceOf[js.Any])).asInstanceOf[Evaluate | InterpolationFactor | ZoomStops]
  inline def createFunction_=(
    x: js.Function2[
      /* parameters */ Any, 
      /* propertySpec */ Any, 
      Evaluate | InterpolationFactor | ZoomStops
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFunction")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "function.isFunction")
  @js.native
  def isFunction: js.Function1[/* value */ Any, Boolean] = js.native
  inline def isFunction(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFunction_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(x.asInstanceOf[js.Any])
}
