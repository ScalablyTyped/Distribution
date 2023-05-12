package typings.jiti

import typings.jiti.distTypesMod.TRANSFORM_RESULT
import typings.jiti.distTypesMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBabelMod {
  
  @JSImport("jiti/dist/babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: TransformOptions): TRANSFORM_RESULT = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[TRANSFORM_RESULT]
}
