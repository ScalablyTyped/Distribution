package typings.listr2.mod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inject your custom style map consisting of icons and coloring for the ListrLogger.
  *
  * @see {@link https://listr2.kilic.dev/renderer/logger.html}
  */
trait ListrLoggerStyleMap[Levels /* <: String */] extends StObject {
  
  /**
    * Coloring of the levels.
    *
    * @see {@link https://listr2.kilic.dev/renderer/logger.html#style}
    */
  var color: js.UndefOr[Partial[Record[Levels, LoggerFormat]]] = js.undefined
  
  /**
    * Icons of the levels.
    *
    * @see {@link https://listr2.kilic.dev/renderer/logger.html#style}
    */
  var icon: js.UndefOr[Partial[Record[Levels, String]]] = js.undefined
}
object ListrLoggerStyleMap {
  
  inline def apply[Levels /* <: String */](): ListrLoggerStyleMap[Levels] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrLoggerStyleMap[Levels]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrLoggerStyleMap[?], Levels /* <: String */] (val x: Self & ListrLoggerStyleMap[Levels]) extends AnyVal {
    
    inline def setColor(value: Partial[Record[Levels, LoggerFormat]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIcon(value: Partial[Record[Levels, String]]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}
