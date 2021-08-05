package typings.jimpPluginCrop

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginCrop.anon.CropOnlyFrames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-crop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Crop = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Crop]
  
  trait Crop extends StObject {
    
    var `class`: CropClass
  }
  object Crop {
    
    inline def apply(`class`: CropClass): Crop = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crop]
    }
    
    extension [Self <: Crop](x: Self) {
      
      inline def setClass(value: CropClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CropClass extends StObject {
    
    def autocrop(): this.type = js.native
    def autocrop(cropOnlyFrames: Boolean): this.type = js.native
    def autocrop(cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(options: CropOnlyFrames): this.type = js.native
    def autocrop(options: CropOnlyFrames, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(tolerance: Double): this.type = js.native
    def autocrop(tolerance: Double, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(tolerance: Double, cropOnlyFrames: Boolean): this.type = js.native
    def autocrop(tolerance: Double, cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(tolerance: Double, cropOnlyFrames: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(tolerance: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(tolerance: Unit, cropOnlyFrames: Boolean): this.type = js.native
    def autocrop(tolerance: Unit, cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(tolerance: Unit, cropOnlyFrames: Unit, cb: ImageCallback[this.type]): this.type = js.native
    
    def crop(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def crop(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def cropQuiet(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def cropQuiet(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
