package typings.maplibreGl.mod

import typings.glMatrix.mod.mat4
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerrainData extends StObject {
  
  var depthTexture: WebGLTexture
  
  var texture: WebGLTexture
  
  var tile: Tile
  
  var u_depth: Double
  
  var u_terrain: Double
  
  var u_terrain_dim: Double
  
  var u_terrain_exaggeration: Double
  
  var u_terrain_matrix: mat4
  
  var u_terrain_offset: Double
  
  var u_terrain_unpack: js.Array[Double]
}
object TerrainData {
  
  inline def apply(
    depthTexture: WebGLTexture,
    texture: WebGLTexture,
    tile: Tile,
    u_depth: Double,
    u_terrain: Double,
    u_terrain_dim: Double,
    u_terrain_exaggeration: Double,
    u_terrain_matrix: mat4,
    u_terrain_offset: Double,
    u_terrain_unpack: js.Array[Double]
  ): TerrainData = {
    val __obj = js.Dynamic.literal(depthTexture = depthTexture.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], u_depth = u_depth.asInstanceOf[js.Any], u_terrain = u_terrain.asInstanceOf[js.Any], u_terrain_dim = u_terrain_dim.asInstanceOf[js.Any], u_terrain_exaggeration = u_terrain_exaggeration.asInstanceOf[js.Any], u_terrain_matrix = u_terrain_matrix.asInstanceOf[js.Any], u_terrain_offset = u_terrain_offset.asInstanceOf[js.Any], u_terrain_unpack = u_terrain_unpack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerrainData]
  }
  
  extension [Self <: TerrainData](x: Self) {
    
    inline def setDepthTexture(value: WebGLTexture): Self = StObject.set(x, "depthTexture", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: WebGLTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTile(value: Tile): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setU_depth(value: Double): Self = StObject.set(x, "u_depth", value.asInstanceOf[js.Any])
    
    inline def setU_terrain(value: Double): Self = StObject.set(x, "u_terrain", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_dim(value: Double): Self = StObject.set(x, "u_terrain_dim", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_exaggeration(value: Double): Self = StObject.set(x, "u_terrain_exaggeration", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_matrix(value: mat4): Self = StObject.set(x, "u_terrain_matrix", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_offset(value: Double): Self = StObject.set(x, "u_terrain_offset", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_unpack(value: js.Array[Double]): Self = StObject.set(x, "u_terrain_unpack", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_unpackVarargs(value: Double*): Self = StObject.set(x, "u_terrain_unpack", js.Array(value*))
  }
}
