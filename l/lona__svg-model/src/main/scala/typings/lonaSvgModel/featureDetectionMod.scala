package typings.lonaSvgModel

import typings.lonaSvgModel.svgTypesMod.SVGRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureDetectionMod {
  
  @JSImport("@lona/svg-model/lib/feature-detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lona/svg-model/lib/feature-detection", "SUPPORTED_ATTRIBUTE_NAMES")
  @js.native
  val SUPPORTED_ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  @JSImport("@lona/svg-model/lib/feature-detection", "SUPPORTED_ELEMENT_NAMES")
  @js.native
  val SUPPORTED_ELEMENT_NAMES: js.Array[String] = js.native
  
  inline def getUnsupportedFeatures(root: SVGRoot): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnsupportedFeatures")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
