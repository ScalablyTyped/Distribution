package typings.joi.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactsMap extends StObject {
  
  var artifacts: Map[Any, js.Array[js.Array[String]]]
}
object ArtifactsMap {
  
  inline def apply(artifacts: Map[Any, js.Array[js.Array[String]]]): ArtifactsMap = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactsMap]
  }
  
  extension [Self <: ArtifactsMap](x: Self) {
    
    inline def setArtifacts(value: Map[Any, js.Array[js.Array[String]]]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
  }
}
