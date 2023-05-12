package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererLoggerOptions[Levels /* <: String */] extends StObject {
  
  /**
    * Inject your custom implementation of the ListrLogger.
    *
    * @see {@link https://listr2.kilic.dev/renderer/logger.html}
    */
  var logger: js.UndefOr[ListrLogger[Levels]] = js.undefined
}
object RendererLoggerOptions {
  
  inline def apply[Levels /* <: String */](): RendererLoggerOptions[Levels] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererLoggerOptions[Levels]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RendererLoggerOptions[?], Levels /* <: String */] (val x: Self & RendererLoggerOptions[Levels]) extends AnyVal {
    
    inline def setLogger(value: ListrLogger[Levels]): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
