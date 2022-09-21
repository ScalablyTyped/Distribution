package typings.maplibreGl.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.mapboxTinySdf.mod.TinySDFOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "GlyphManager")
@js.native
open class GlyphManager protected () extends StObject {
  def this(requestManager: RequestManager) = this()
  def this(requestManager: RequestManager, localIdeographFontFamily: String) = this()
  
  def _doesCharSupportLocalGlyph(id: Double): Boolean = js.native
  
  def _tinySDF(entry: Entry, stack: String, id: Double): StyleGlyph = js.native
  
  var entries: StringDictionary[Entry] = js.native
  
  def getGlyphs(
    glyphs: StringDictionary[js.Array[Double]],
    callback: Callback[StringDictionary[NumberDictionary[StyleGlyph]]]
  ): scala.Unit = js.native
  
  var localIdeographFontFamily: String = js.native
  
  var requestManager: RequestManager = js.native
  
  def setURL(): scala.Unit = js.native
  def setURL(url: String): scala.Unit = js.native
  
  var url: String = js.native
}
/* static members */
object GlyphManager {
  
  @JSImport("maplibre-gl", "GlyphManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "GlyphManager.TinySDF")
  @js.native
  def TinySDF: Instantiable1[/* options */ TinySDFOptions, typings.mapboxTinySdf.mod.default] = js.native
  inline def TinySDF_=(x: Instantiable1[/* options */ TinySDFOptions, typings.mapboxTinySdf.mod.default]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TinySDF")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "GlyphManager.loadGlyphRange")
  @js.native
  def loadGlyphRange: js.Function5[
    /* fontstack */ String, 
    /* range */ Double, 
    /* urlTemplate */ String, 
    /* requestManager */ RequestManager, 
    /* callback */ Callback[NumberDictionary[StyleGlyph | Null]], 
    scala.Unit
  ] = js.native
  inline def loadGlyphRange(
    fontstack: String,
    range: Double,
    urlTemplate: String,
    requestManager: RequestManager,
    callback: Callback[NumberDictionary[StyleGlyph | Null]]
  ): scala.Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadGlyphRange")(fontstack.asInstanceOf[js.Any], range.asInstanceOf[js.Any], urlTemplate.asInstanceOf[js.Any], requestManager.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  inline def loadGlyphRange_=(
    x: js.Function5[
      /* fontstack */ String, 
      /* range */ Double, 
      /* urlTemplate */ String, 
      /* requestManager */ RequestManager, 
      /* callback */ Callback[NumberDictionary[StyleGlyph | Null]], 
      scala.Unit
    ]
  ): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadGlyphRange")(x.asInstanceOf[js.Any])
}
