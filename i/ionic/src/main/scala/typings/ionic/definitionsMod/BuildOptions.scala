package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptions[T /* <: ProjectType */]
  extends StObject
     with BaseBuildOptions {
  
  var `type`: T
}
object BuildOptions {
  
  inline def apply[T /* <: ProjectType */](`--`: js.Array[String], engine: String, `type`: T): BuildOptions[T] = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions[T]]
  }
  
  extension [Self <: BuildOptions[?], T /* <: ProjectType */](x: Self & BuildOptions[T]) {
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
