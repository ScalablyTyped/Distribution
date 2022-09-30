package typings.html2canvas

import typings.html2canvas.html2canvasInts.`0`
import typings.html2canvas.html2canvasInts.`16`
import typings.html2canvas.html2canvasInts.`17`
import typings.html2canvas.html2canvasInts.`19`
import typings.html2canvas.html2canvasInts.`20`
import typings.html2canvas.html2canvasInts.`22`
import typings.html2canvas.html2canvasInts.`6`
import typings.html2canvas.html2canvasInts.`7`
import typings.html2canvas.ipropertydescriptorMod.IPropertyListDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundSizeMod {
  
  @js.native
  sealed trait BACKGROUND_SIZE extends StObject
  @JSImport("html2canvas/dist/types/css/property-descriptors/background-size", "BACKGROUND_SIZE")
  @js.native
  object BACKGROUND_SIZE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BACKGROUND_SIZE & String] = js.native
    
    @js.native
    sealed trait AUTO
      extends StObject
         with BACKGROUND_SIZE
    /* "auto" */ val AUTO: typings.html2canvas.backgroundSizeMod.BACKGROUND_SIZE.AUTO & String = js.native
    
    @js.native
    sealed trait CONTAIN
      extends StObject
         with BACKGROUND_SIZE
    /* "contain" */ val CONTAIN: typings.html2canvas.backgroundSizeMod.BACKGROUND_SIZE.CONTAIN & String = js.native
    
    @js.native
    sealed trait COVER
      extends StObject
         with BACKGROUND_SIZE
    /* "cover" */ val COVER: typings.html2canvas.backgroundSizeMod.BACKGROUND_SIZE.COVER & String = js.native
  }
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/background-size", "backgroundSize")
  @js.native
  val backgroundSize: IPropertyListDescriptor[BackgroundSize_] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.lengthPercentageMod.LengthPercentage
    - typings.html2canvas.tokenizerMod.StringValueToken
  */
  trait BackgroundSizeInfo extends StObject
  object BackgroundSizeInfo {
    
    inline def DimensionToken(flags: Double, number: Double, unit: String): typings.html2canvas.tokenizerMod.DimensionToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(15)
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.DimensionToken]
    }
    
    inline def NumberValueToken(flags: Double, number: Double, `type`: `16` | `17`): typings.html2canvas.tokenizerMod.NumberValueToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.NumberValueToken]
    }
    
    inline def StringValueToken(`type`: `0` | `6` | `19` | `20` | `22` | `7`, value: String): typings.html2canvas.tokenizerMod.StringValueToken = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.StringValueToken]
    }
  }
  
  type BackgroundSize_ = js.Array[js.Array[BackgroundSizeInfo]]
}
