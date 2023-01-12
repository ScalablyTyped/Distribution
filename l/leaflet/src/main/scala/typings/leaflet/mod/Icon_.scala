package typings.leaflet.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Icon")
@js.native
open class Icon_[T /* <: BaseIconOptions */] protected () extends Layer {
  def this(options: T) = this()
  
  def createIcon(): HTMLElement = js.native
  def createIcon(oldIcon: HTMLElement): HTMLElement = js.native
  
  def createShadow(): HTMLElement = js.native
  def createShadow(oldIcon: HTMLElement): HTMLElement = js.native
  
  var options: T = js.native
}
object Icon_ {
  
  @JSImport("leaflet", "Icon.Default")
  @js.native
  open class Default () extends Icon_[DefaultIconOptions] {
    def this(options: DefaultIconOptions) = this()
  }
  object Default {
    
    @JSImport("leaflet", "Icon.Default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("leaflet", "Icon.Default.imagePath")
    @js.native
    def imagePath: js.UndefOr[String] = js.native
    inline def imagePath_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagePath")(x.asInstanceOf[js.Any])
  }
  
  trait DefaultIconOptions
    extends StObject
       with BaseIconOptions {
    
    var imagePath: js.UndefOr[String] = js.undefined
  }
  object DefaultIconOptions {
    
    inline def apply(): DefaultIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultIconOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultIconOptions] (val x: Self) extends AnyVal {
      
      inline def setImagePath(value: String): Self = StObject.set(x, "imagePath", value.asInstanceOf[js.Any])
      
      inline def setImagePathUndefined: Self = StObject.set(x, "imagePath", js.undefined)
    }
  }
}
