package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  val abortTile: js.UndefOr[js.Function2[/* tile */ Tile, /* callback */ Callback[scala.Unit], scala.Unit]] = js.undefined
  
  var attribution: js.UndefOr[String] = js.undefined
  
  def fire(event: Event): Any
  
  val hasTile: js.UndefOr[js.Function1[/* tileID */ OverscaledTileID, Boolean]] = js.undefined
  
  def hasTransition(): Boolean
  
  var id: String
  
  var isTileClipped: js.UndefOr[Boolean] = js.undefined
  
  def loadTile(tile: Tile, callback: Callback[scala.Unit]): scala.Unit
  
  def loaded(): Boolean
  
  var maxzoom: Double
  
  var minzoom: Double
  
  val onAdd: js.UndefOr[js.Function1[/* map */ Map, scala.Unit]] = js.undefined
  
  val onRemove: js.UndefOr[js.Function1[/* map */ Map, scala.Unit]] = js.undefined
  
  val prepare: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  
  var reparseOverscaled: js.UndefOr[Boolean] = js.undefined
  
  var roundZoom: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * @returns A plain (stringifiable) JS object representing the current state of the source.
  	 * Creating a source using the returned object as the `options` should result in a Source that is
  	 * equivalent to this one.
  	 * @private
  	 */
  def serialize(): Any
  
  var tileID: js.UndefOr[CanonicalTileID] = js.undefined
  
  var tileSize: Double
  
  val `type`: String
  
  val unloadTile: js.UndefOr[js.Function2[/* tile */ Tile, /* callback */ Callback[scala.Unit], scala.Unit]] = js.undefined
  
  var vectorLayerIds: js.UndefOr[js.Array[String]] = js.undefined
}
object Source {
  
  inline def apply(
    fire: Event => Any,
    hasTransition: () => Boolean,
    id: String,
    loadTile: (Tile, Callback[scala.Unit]) => scala.Unit,
    loaded: () => Boolean,
    maxzoom: Double,
    minzoom: Double,
    serialize: () => Any,
    tileSize: Double,
    `type`: String
  ): Source = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), hasTransition = js.Any.fromFunction0(hasTransition), id = id.asInstanceOf[js.Any], loadTile = js.Any.fromFunction2(loadTile), loaded = js.Any.fromFunction0(loaded), maxzoom = maxzoom.asInstanceOf[js.Any], minzoom = minzoom.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), tileSize = tileSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setAbortTile(value: (/* tile */ Tile, /* callback */ Callback[scala.Unit]) => scala.Unit): Self = StObject.set(x, "abortTile", js.Any.fromFunction2(value))
    
    inline def setAbortTileUndefined: Self = StObject.set(x, "abortTile", js.undefined)
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setFire(value: Event => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
    
    inline def setHasTile(value: /* tileID */ OverscaledTileID => Boolean): Self = StObject.set(x, "hasTile", js.Any.fromFunction1(value))
    
    inline def setHasTileUndefined: Self = StObject.set(x, "hasTile", js.undefined)
    
    inline def setHasTransition(value: () => Boolean): Self = StObject.set(x, "hasTransition", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsTileClipped(value: Boolean): Self = StObject.set(x, "isTileClipped", value.asInstanceOf[js.Any])
    
    inline def setIsTileClippedUndefined: Self = StObject.set(x, "isTileClipped", js.undefined)
    
    inline def setLoadTile(value: (Tile, Callback[scala.Unit]) => scala.Unit): Self = StObject.set(x, "loadTile", js.Any.fromFunction2(value))
    
    inline def setLoaded(value: () => Boolean): Self = StObject.set(x, "loaded", js.Any.fromFunction0(value))
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setOnAdd(value: /* map */ Map => scala.Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnRemove(value: /* map */ Map => scala.Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setPrepare(value: () => scala.Unit): Self = StObject.set(x, "prepare", js.Any.fromFunction0(value))
    
    inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
    
    inline def setReparseOverscaled(value: Boolean): Self = StObject.set(x, "reparseOverscaled", value.asInstanceOf[js.Any])
    
    inline def setReparseOverscaledUndefined: Self = StObject.set(x, "reparseOverscaled", js.undefined)
    
    inline def setRoundZoom(value: Boolean): Self = StObject.set(x, "roundZoom", value.asInstanceOf[js.Any])
    
    inline def setRoundZoomUndefined: Self = StObject.set(x, "roundZoom", js.undefined)
    
    inline def setSerialize(value: () => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    inline def setTileID(value: CanonicalTileID): Self = StObject.set(x, "tileID", value.asInstanceOf[js.Any])
    
    inline def setTileIDUndefined: Self = StObject.set(x, "tileID", js.undefined)
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnloadTile(value: (/* tile */ Tile, /* callback */ Callback[scala.Unit]) => scala.Unit): Self = StObject.set(x, "unloadTile", js.Any.fromFunction2(value))
    
    inline def setUnloadTileUndefined: Self = StObject.set(x, "unloadTile", js.undefined)
    
    inline def setVectorLayerIds(value: js.Array[String]): Self = StObject.set(x, "vectorLayerIds", value.asInstanceOf[js.Any])
    
    inline def setVectorLayerIdsUndefined: Self = StObject.set(x, "vectorLayerIds", js.undefined)
    
    inline def setVectorLayerIdsVarargs(value: String*): Self = StObject.set(x, "vectorLayerIds", js.Array(value*))
  }
}
