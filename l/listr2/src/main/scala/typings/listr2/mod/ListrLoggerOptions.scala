package typings.listr2.mod

import typings.listr2.listr2Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the logger
  */
trait ListrLoggerOptions[Levels /* <: String */]
  extends StObject
     with ProcessOutputRendererOptions
     with ListrLoggerStyleMap[Levels | String] {
  
  /**
    * Apply fields and templates as presets before and after each message.
    */
  var fields: js.UndefOr[LoggerFieldOptions[`true`]] = js.undefined
  
  /**
    * Send the designated levels to `process.stderr`.
    */
  var toStderr: js.UndefOr[js.Array[Levels | String]] = js.undefined
  
  /**
    * Use icons for the log levels.
    */
  var useIcons: js.UndefOr[Boolean] = js.undefined
}
object ListrLoggerOptions {
  
  inline def apply[Levels /* <: String */](): ListrLoggerOptions[Levels] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrLoggerOptions[Levels]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrLoggerOptions[?], Levels /* <: String */] (val x: Self & ListrLoggerOptions[Levels]) extends AnyVal {
    
    inline def setFields(value: LoggerFieldOptions[`true`]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setToStderr(value: js.Array[Levels | String]): Self = StObject.set(x, "toStderr", value.asInstanceOf[js.Any])
    
    inline def setToStderrUndefined: Self = StObject.set(x, "toStderr", js.undefined)
    
    inline def setToStderrVarargs(value: (Levels | String)*): Self = StObject.set(x, "toStderr", js.Array(value*))
    
    inline def setUseIcons(value: Boolean): Self = StObject.set(x, "useIcons", value.asInstanceOf[js.Any])
    
    inline def setUseIconsUndefined: Self = StObject.set(x, "useIcons", js.undefined)
  }
}
