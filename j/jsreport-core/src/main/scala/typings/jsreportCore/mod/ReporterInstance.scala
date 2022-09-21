package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReporterInstance extends StObject {
  
  var afterRenderListeners: ListenerCollection
  
  var afterTemplatingEnginesExecutedListeners: ListenerCollection
  
  var beforeRenderListeners: ListenerCollection
  
  var blobStorage: BlobStorage
  
  var closeListeners: ListenerCollection
  
  var defaults: js.UndefOr[Defaults] = js.undefined
  
  var documentStore: DocumentStore
  
  var entityTypeValidator: SchemaValidator
  
  var initializeListeners: ListenerCollection
  
  // it would be nice to add winston.LoggerInstance here
  // however adding import winston = require('winston') breaks exported enums
  var logger: js.UndefOr[Any] = js.undefined
  
  var options: js.UndefOr[Configuration] = js.undefined
  
  var optionsValidator: SchemaValidator
  
  var renderErrorListeners: ListenerCollection
  
  var settings: Settings
  
  var validateRenderListeners: ListenerCollection
  
  var version: js.UndefOr[String] = js.undefined
}
object ReporterInstance {
  
  inline def apply(
    afterRenderListeners: ListenerCollection,
    afterTemplatingEnginesExecutedListeners: ListenerCollection,
    beforeRenderListeners: ListenerCollection,
    blobStorage: BlobStorage,
    closeListeners: ListenerCollection,
    documentStore: DocumentStore,
    entityTypeValidator: SchemaValidator,
    initializeListeners: ListenerCollection,
    optionsValidator: SchemaValidator,
    renderErrorListeners: ListenerCollection,
    settings: Settings,
    validateRenderListeners: ListenerCollection
  ): ReporterInstance = {
    val __obj = js.Dynamic.literal(afterRenderListeners = afterRenderListeners.asInstanceOf[js.Any], afterTemplatingEnginesExecutedListeners = afterTemplatingEnginesExecutedListeners.asInstanceOf[js.Any], beforeRenderListeners = beforeRenderListeners.asInstanceOf[js.Any], blobStorage = blobStorage.asInstanceOf[js.Any], closeListeners = closeListeners.asInstanceOf[js.Any], documentStore = documentStore.asInstanceOf[js.Any], entityTypeValidator = entityTypeValidator.asInstanceOf[js.Any], initializeListeners = initializeListeners.asInstanceOf[js.Any], optionsValidator = optionsValidator.asInstanceOf[js.Any], renderErrorListeners = renderErrorListeners.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], validateRenderListeners = validateRenderListeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReporterInstance]
  }
  
  extension [Self <: ReporterInstance](x: Self) {
    
    inline def setAfterRenderListeners(value: ListenerCollection): Self = StObject.set(x, "afterRenderListeners", value.asInstanceOf[js.Any])
    
    inline def setAfterTemplatingEnginesExecutedListeners(value: ListenerCollection): Self = StObject.set(x, "afterTemplatingEnginesExecutedListeners", value.asInstanceOf[js.Any])
    
    inline def setBeforeRenderListeners(value: ListenerCollection): Self = StObject.set(x, "beforeRenderListeners", value.asInstanceOf[js.Any])
    
    inline def setBlobStorage(value: BlobStorage): Self = StObject.set(x, "blobStorage", value.asInstanceOf[js.Any])
    
    inline def setCloseListeners(value: ListenerCollection): Self = StObject.set(x, "closeListeners", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: Defaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setDocumentStore(value: DocumentStore): Self = StObject.set(x, "documentStore", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeValidator(value: SchemaValidator): Self = StObject.set(x, "entityTypeValidator", value.asInstanceOf[js.Any])
    
    inline def setInitializeListeners(value: ListenerCollection): Self = StObject.set(x, "initializeListeners", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setOptions(value: Configuration): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsValidator(value: SchemaValidator): Self = StObject.set(x, "optionsValidator", value.asInstanceOf[js.Any])
    
    inline def setRenderErrorListeners(value: ListenerCollection): Self = StObject.set(x, "renderErrorListeners", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setValidateRenderListeners(value: ListenerCollection): Self = StObject.set(x, "validateRenderListeners", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
