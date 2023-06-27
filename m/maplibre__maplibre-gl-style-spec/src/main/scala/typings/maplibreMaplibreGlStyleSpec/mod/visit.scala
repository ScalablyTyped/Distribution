package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.anon.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visit {
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "visit")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "visit.eachLayer")
  @js.native
  def eachLayer: js.Function2[
    /* style */ StyleSpecification, 
    /* callback */ js.Function1[/* _ */ LayerSpecification, Unit], 
    Unit
  ] = js.native
  inline def eachLayer(style: StyleSpecification, callback: js.Function1[/* _ */ LayerSpecification, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachLayer")(style.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachLayer_=(
    x: js.Function2[
      /* style */ StyleSpecification, 
      /* callback */ js.Function1[/* _ */ LayerSpecification, Unit], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eachLayer")(x.asInstanceOf[js.Any])
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "visit.eachProperty")
  @js.native
  def eachProperty: js.Function3[
    /* style */ StyleSpecification, 
    /* options */ Layout, 
    /* callback */ PropertyCallback, 
    Unit
  ] = js.native
  inline def eachProperty(style: StyleSpecification, options: Layout, callback: PropertyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachProperty")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachProperty_=(
    x: js.Function3[
      /* style */ StyleSpecification, 
      /* options */ Layout, 
      /* callback */ PropertyCallback, 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eachProperty")(x.asInstanceOf[js.Any])
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "visit.eachSource")
  @js.native
  def eachSource: js.Function2[
    /* style */ StyleSpecification, 
    /* callback */ js.Function1[/* _ */ SourceSpecification, Unit], 
    Unit
  ] = js.native
  inline def eachSource(style: StyleSpecification, callback: js.Function1[/* _ */ SourceSpecification, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSource")(style.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachSource_=(
    x: js.Function2[
      /* style */ StyleSpecification, 
      /* callback */ js.Function1[/* _ */ SourceSpecification, Unit], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eachSource")(x.asInstanceOf[js.Any])
}
