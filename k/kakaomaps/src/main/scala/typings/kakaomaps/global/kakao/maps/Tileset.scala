package typings.kakaomaps.global.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-unnecessary-class
@JSGlobal("kakao.maps.Tileset")
@js.native
open class Tileset protected ()
  extends StObject
     with typings.kakaomaps.kakao.maps.Tileset {
  def this(
    width: Double,
    height: Double,
    urlFunc: js.Function0[Unit],
    copyright: js.Array[typings.kakaomaps.kakao.maps.TilesetCopyright],
    dark: Boolean,
    minZoom: Double,
    maxZoom: Double
  ) = this()
  def this(
    width: Double,
    height: Double,
    urlFunc: js.Function0[Unit],
    copyright: js.Array[typings.kakaomaps.kakao.maps.TilesetCopyright],
    dark: Boolean,
    minZoom: Double,
    maxZoom: Double,
    getTile: js.Function0[Unit]
  ) = this()
}
object Tileset {
  
  @JSGlobal("kakao.maps.Tileset")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(id: String, tileset: typings.kakaomaps.kakao.maps.Tileset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(id.asInstanceOf[js.Any], tileset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
