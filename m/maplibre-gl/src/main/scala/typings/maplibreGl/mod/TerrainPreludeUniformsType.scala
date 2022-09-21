package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerrainPreludeUniformsType extends StObject {
  
  var u_depth: Uniform1i
  
  var u_terrain: Uniform1i
  
  var u_terrain_dim: Uniform1f
  
  var u_terrain_exaggeration: Uniform1f
  
  var u_terrain_matrix: UniformMatrix4f
  
  var u_terrain_offset: Uniform1f
  
  var u_terrain_unpack: Uniform4f
}
object TerrainPreludeUniformsType {
  
  inline def apply(
    u_depth: Uniform1i,
    u_terrain: Uniform1i,
    u_terrain_dim: Uniform1f,
    u_terrain_exaggeration: Uniform1f,
    u_terrain_matrix: UniformMatrix4f,
    u_terrain_offset: Uniform1f,
    u_terrain_unpack: Uniform4f
  ): TerrainPreludeUniformsType = {
    val __obj = js.Dynamic.literal(u_depth = u_depth.asInstanceOf[js.Any], u_terrain = u_terrain.asInstanceOf[js.Any], u_terrain_dim = u_terrain_dim.asInstanceOf[js.Any], u_terrain_exaggeration = u_terrain_exaggeration.asInstanceOf[js.Any], u_terrain_matrix = u_terrain_matrix.asInstanceOf[js.Any], u_terrain_offset = u_terrain_offset.asInstanceOf[js.Any], u_terrain_unpack = u_terrain_unpack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerrainPreludeUniformsType]
  }
  
  extension [Self <: TerrainPreludeUniformsType](x: Self) {
    
    inline def setU_depth(value: Uniform1i): Self = StObject.set(x, "u_depth", value.asInstanceOf[js.Any])
    
    inline def setU_terrain(value: Uniform1i): Self = StObject.set(x, "u_terrain", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_dim(value: Uniform1f): Self = StObject.set(x, "u_terrain_dim", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_exaggeration(value: Uniform1f): Self = StObject.set(x, "u_terrain_exaggeration", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_matrix(value: UniformMatrix4f): Self = StObject.set(x, "u_terrain_matrix", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_offset(value: Uniform1f): Self = StObject.set(x, "u_terrain_offset", value.asInstanceOf[js.Any])
    
    inline def setU_terrain_unpack(value: Uniform4f): Self = StObject.set(x, "u_terrain_unpack", value.asInstanceOf[js.Any])
  }
}
