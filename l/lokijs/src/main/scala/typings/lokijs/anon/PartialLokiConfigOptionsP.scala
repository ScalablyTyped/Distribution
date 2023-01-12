package typings.lokijs.anon

import typings.lokijs.LokiPersistenceAdapter
import typings.lokijs.lokijsStrings.destructured
import typings.lokijs.lokijsStrings.fs
import typings.lokijs.lokijsStrings.localStorage
import typings.lokijs.lokijsStrings.memory
import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.LokiConfigOptions> & std.Partial<lokijs.ThrottledSaveDrainOptions> */
trait PartialLokiConfigOptionsP extends StObject {
  
  var adapter: js.UndefOr[LokiPersistenceAdapter | Null] = js.undefined
  
  var autoload: js.UndefOr[Boolean] = js.undefined
  
  var autoloadCallback: js.UndefOr[js.Function1[/* err */ Any, Unit]] = js.undefined
  
  var autosave: js.UndefOr[Boolean] = js.undefined
  
  var autosaveCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[Any], Unit]] = js.undefined
  
  var autosaveInterval: js.UndefOr[String | Double] = js.undefined
  
  var destructureDelimiter: js.UndefOr[String] = js.undefined
  
  var persistenceMethod: js.UndefOr[fs | localStorage | memory | Null] = js.undefined
  
  var recursiveWait: js.UndefOr[Boolean] = js.undefined
  
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.undefined
  
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.undefined
  
  var serializationMethod: js.UndefOr[normal | pretty | destructured | Null] = js.undefined
  
  var started: js.UndefOr[Double] = js.undefined
  
  var throttledSaves: js.UndefOr[Boolean] = js.undefined
}
object PartialLokiConfigOptionsP {
  
  inline def apply(): PartialLokiConfigOptionsP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLokiConfigOptionsP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialLokiConfigOptionsP] (val x: Self) extends AnyVal {
    
    inline def setAdapter(value: LokiPersistenceAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterNull: Self = StObject.set(x, "adapter", null)
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setAutoload(value: Boolean): Self = StObject.set(x, "autoload", value.asInstanceOf[js.Any])
    
    inline def setAutoloadCallback(value: /* err */ Any => Unit): Self = StObject.set(x, "autoloadCallback", js.Any.fromFunction1(value))
    
    inline def setAutoloadCallbackUndefined: Self = StObject.set(x, "autoloadCallback", js.undefined)
    
    inline def setAutoloadUndefined: Self = StObject.set(x, "autoload", js.undefined)
    
    inline def setAutosave(value: Boolean): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
    
    inline def setAutosaveCallback(value: /* err */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "autosaveCallback", js.Any.fromFunction1(value))
    
    inline def setAutosaveCallbackUndefined: Self = StObject.set(x, "autosaveCallback", js.undefined)
    
    inline def setAutosaveInterval(value: String | Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
    
    inline def setAutosaveIntervalUndefined: Self = StObject.set(x, "autosaveInterval", js.undefined)
    
    inline def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
    
    inline def setDestructureDelimiter(value: String): Self = StObject.set(x, "destructureDelimiter", value.asInstanceOf[js.Any])
    
    inline def setDestructureDelimiterUndefined: Self = StObject.set(x, "destructureDelimiter", js.undefined)
    
    inline def setPersistenceMethod(value: fs | localStorage | memory): Self = StObject.set(x, "persistenceMethod", value.asInstanceOf[js.Any])
    
    inline def setPersistenceMethodNull: Self = StObject.set(x, "persistenceMethod", null)
    
    inline def setPersistenceMethodUndefined: Self = StObject.set(x, "persistenceMethod", js.undefined)
    
    inline def setRecursiveWait(value: Boolean): Self = StObject.set(x, "recursiveWait", value.asInstanceOf[js.Any])
    
    inline def setRecursiveWaitLimit(value: Boolean): Self = StObject.set(x, "recursiveWaitLimit", value.asInstanceOf[js.Any])
    
    inline def setRecursiveWaitLimitDuration(value: Double): Self = StObject.set(x, "recursiveWaitLimitDuration", value.asInstanceOf[js.Any])
    
    inline def setRecursiveWaitLimitDurationUndefined: Self = StObject.set(x, "recursiveWaitLimitDuration", js.undefined)
    
    inline def setRecursiveWaitLimitUndefined: Self = StObject.set(x, "recursiveWaitLimit", js.undefined)
    
    inline def setRecursiveWaitUndefined: Self = StObject.set(x, "recursiveWait", js.undefined)
    
    inline def setSerializationMethod(value: normal | pretty | destructured): Self = StObject.set(x, "serializationMethod", value.asInstanceOf[js.Any])
    
    inline def setSerializationMethodNull: Self = StObject.set(x, "serializationMethod", null)
    
    inline def setSerializationMethodUndefined: Self = StObject.set(x, "serializationMethod", js.undefined)
    
    inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setThrottledSaves(value: Boolean): Self = StObject.set(x, "throttledSaves", value.asInstanceOf[js.Any])
    
    inline def setThrottledSavesUndefined: Self = StObject.set(x, "throttledSaves", js.undefined)
  }
}
