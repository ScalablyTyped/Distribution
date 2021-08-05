package typings.jestDiff

import typings.jestDiff.typesMod.DiffOptions
import typings.jestDiff.typesMod.DiffOptionsNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeDiffOptionsMod {
  
  @JSImport("jest-diff/build/normalizeDiffOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def noColor(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("noColor")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeDiffOptions(): DiffOptionsNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeDiffOptions")().asInstanceOf[DiffOptionsNormalized]
  inline def normalizeDiffOptions(options: DiffOptions): DiffOptionsNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeDiffOptions")(options.asInstanceOf[js.Any]).asInstanceOf[DiffOptionsNormalized]
}
