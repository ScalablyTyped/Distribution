package typings.humanObjectDiff

import typings.humanObjectDiff.distTypesMod.DiffEngineContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineMod {
  
  @JSImport("human-object-diff/dist/engine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def humanReadableDiffGenerator(context: DiffEngineContext): js.Function2[/* lhs */ Any, /* rhs */ Any, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("humanReadableDiffGenerator")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* lhs */ Any, /* rhs */ Any, js.Array[String]]]
}
