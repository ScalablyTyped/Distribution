package typings.ionicCore

import typings.swiper.mod.SelectableElement
import typings.swiper.mod.SwiperModule
import typings.swiper.mod.SwiperOptions
import typings.swiper.swiperEsmMod.Swiper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swiperInterfaceMod {
  
  @JSImport("@ionic/core/dist/types/components/slides/swiper/swiper-interface", "SwiperInterface")
  @js.native
  class SwiperInterface protected () extends Swiper {
    /**
      * Constructs a new Swiper instance.
      *
      * @param container Where Swiper applies to.
      * @param options   Instance options.
      */
    def this(container: SelectableElement) = this()
    def this(container: SelectableElement, options: SwiperOptions) = this()
  }
  /* static members */
  object SwiperInterface {
    
    @JSImport("@ionic/core/dist/types/components/slides/swiper/swiper-interface", "SwiperInterface")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Installs modules on Swiper in runtime.
      */
    inline def use(modules: js.Array[SwiperModule]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(modules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
