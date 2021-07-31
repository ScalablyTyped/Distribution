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
  
  var autoloadCallback: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  
  var autosave: js.UndefOr[Boolean] = js.undefined
  
  var autosaveCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.undefined
  
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
  
  @scala.inline
  def apply(): PartialLokiConfigOptionsP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLokiConfigOptionsP]
  }
  
  @scala.inline
  implicit class PartialLokiConfigOptionsPMutableBuilder[Self <: PartialLokiConfigOptionsP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdapter(value: LokiPersistenceAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdapterNull: Self = StObject.set(x, "adapter", null)
    
    @scala.inline
    def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    @scala.inline
    def setAutoload(value: Boolean): Self = StObject.set(x, "autoload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoloadCallback(value: /* err */ js.Any => Unit): Self = StObject.set(x, "autoloadCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoloadCallbackUndefined: Self = StObject.set(x, "autoloadCallback", js.undefined)
    
    @scala.inline
    def setAutoloadUndefined: Self = StObject.set(x, "autoload", js.undefined)
    
    @scala.inline
    def setAutosave(value: Boolean): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosaveCallback(value: /* err */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "autosaveCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutosaveCallbackUndefined: Self = StObject.set(x, "autosaveCallback", js.undefined)
    
    @scala.inline
    def setAutosaveInterval(value: String | Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosaveIntervalUndefined: Self = StObject.set(x, "autosaveInterval", js.undefined)
    
    @scala.inline
    def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
    
    @scala.inline
    def setDestructureDelimiter(value: String): Self = StObject.set(x, "destructureDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestructureDelimiterUndefined: Self = StObject.set(x, "destructureDelimiter", js.undefined)
    
    @scala.inline
    def setPersistenceMethod(value: fs | localStorage | memory): Self = StObject.set(x, "persistenceMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistenceMethodNull: Self = StObject.set(x, "persistenceMethod", null)
    
    @scala.inline
    def setPersistenceMethodUndefined: Self = StObject.set(x, "persistenceMethod", js.undefined)
    
    @scala.inline
    def setRecursiveWait(value: Boolean): Self = StObject.set(x, "recursiveWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveWaitLimit(value: Boolean): Self = StObject.set(x, "recursiveWaitLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveWaitLimitDuration(value: Double): Self = StObject.set(x, "recursiveWaitLimitDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveWaitLimitDurationUndefined: Self = StObject.set(x, "recursiveWaitLimitDuration", js.undefined)
    
    @scala.inline
    def setRecursiveWaitLimitUndefined: Self = StObject.set(x, "recursiveWaitLimit", js.undefined)
    
    @scala.inline
    def setRecursiveWaitUndefined: Self = StObject.set(x, "recursiveWait", js.undefined)
    
    @scala.inline
    def setSerializationMethod(value: normal | pretty | destructured): Self = StObject.set(x, "serializationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationMethodNull: Self = StObject.set(x, "serializationMethod", null)
    
    @scala.inline
    def setSerializationMethodUndefined: Self = StObject.set(x, "serializationMethod", js.undefined)
    
    @scala.inline
    def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    @scala.inline
    def setThrottledSaves(value: Boolean): Self = StObject.set(x, "throttledSaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottledSavesUndefined: Self = StObject.set(x, "throttledSaves", js.undefined)
  }
}
