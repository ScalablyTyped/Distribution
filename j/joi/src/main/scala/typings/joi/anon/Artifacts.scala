package typings.joi.anon

import typings.joi.joiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifacts extends StObject {
  
  var artifacts: `true`
}
object Artifacts {
  
  inline def apply(): Artifacts = {
    val __obj = js.Dynamic.literal(artifacts = true)
    __obj.asInstanceOf[Artifacts]
  }
  
  extension [Self <: Artifacts](x: Self) {
    
    inline def setArtifacts(value: `true`): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
  }
}
