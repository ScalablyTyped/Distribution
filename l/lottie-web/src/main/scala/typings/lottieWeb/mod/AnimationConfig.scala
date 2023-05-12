package typings.lottieWeb.mod

import typings.lottieWeb.anon.Play
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationConfig[T /* <: RendererType */] extends StObject {
  
  var assetsPath: js.UndefOr[String] = js.undefined
  
  var audioFactory: js.UndefOr[js.Function1[/* assetPath */ String, Play]] = js.undefined
  
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  var container: Element
  
  var initialSegment: js.UndefOr[AnimationSegment] = js.undefined
  
  var loop: js.UndefOr[Boolean | Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var renderer: js.UndefOr[T] = js.undefined
  
  var rendererSettings: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: lottie-web.anon.Canvas[T] */ js.Any
  ] = js.undefined
}
object AnimationConfig {
  
  inline def apply[T /* <: RendererType */](container: Element): AnimationConfig[T] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationConfig[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationConfig[?], T /* <: RendererType */] (val x: Self & AnimationConfig[T]) extends AnyVal {
    
    inline def setAssetsPath(value: String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
    
    inline def setAssetsPathUndefined: Self = StObject.set(x, "assetsPath", js.undefined)
    
    inline def setAudioFactory(value: /* assetPath */ String => Play): Self = StObject.set(x, "audioFactory", js.Any.fromFunction1(value))
    
    inline def setAudioFactoryUndefined: Self = StObject.set(x, "audioFactory", js.undefined)
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setInitialSegment(value: AnimationSegment): Self = StObject.set(x, "initialSegment", value.asInstanceOf[js.Any])
    
    inline def setInitialSegmentUndefined: Self = StObject.set(x, "initialSegment", js.undefined)
    
    inline def setLoop(value: Boolean | Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRenderer(value: T): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererSettings(
      value: /* import warning: importer.ImportType#apply Failed type conversion: lottie-web.anon.Canvas[T] */ js.Any
    ): Self = StObject.set(x, "rendererSettings", value.asInstanceOf[js.Any])
    
    inline def setRendererSettingsUndefined: Self = StObject.set(x, "rendererSettings", js.undefined)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
