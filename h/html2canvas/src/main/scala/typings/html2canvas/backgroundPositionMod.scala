package typings.html2canvas

import typings.html2canvas.ipropertydescriptorMod.IPropertyListDescriptor
import typings.html2canvas.lengthPercentageMod.LengthPercentageTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundPositionMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/background-position", "backgroundPosition")
  @js.native
  val backgroundPosition: IPropertyListDescriptor[BackgroundPosition_] = js.native
  
  type BackgroundImagePosition = LengthPercentageTuple
  
  type BackgroundPosition_ = js.Array[BackgroundImagePosition]
}
